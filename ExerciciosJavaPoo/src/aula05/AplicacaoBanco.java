package aula05;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AplicacaoBanco extends JFrame {

	private JPanel contentPane;
	private JTextField txtSaldo;
	private JTextField txtNumero;
	private JTextField txtDono;
	private JTextField txtSacar;
	private JTextField txtDeposito;
	// Cria uma conta
	Conta conta = new Conta();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplicacaoBanco frame = new AplicacaoBanco();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// Verifica se a conta esta aberta
	private boolean statusConta() {
		if (conta.getStatus()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Create the frame.
	 */
	public AplicacaoBanco() {
		setTitle("Banco Shield");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(150, 6, 200, 150);
		contentPane.add(panel);
		
		JLabel lblAutoAtendimento = new JLabel("Auto atendimento");
		panel.add(lblAutoAtendimento);
		lblAutoAtendimento.setFont(new Font("Perpetua Titling MT", Font.BOLD, 15));
		lblAutoAtendimento.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label = new JLabel("");
		panel.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(AplicacaoBanco.class.getResource("/imagens/shieldLogo.png")));
		
		JPanel panOperacoes = new JPanel();
		panOperacoes.setBounds(6, 168, 488, 200);
		contentPane.add(panOperacoes);
		panOperacoes.setLayout(null);
		panOperacoes.setVisible(false);
		
		JLabel lblMensagem = new JLabel("");
		lblMensagem.setBounds(10, 169, 472, 25);
		lblMensagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagem.setFont(new Font("Lucida Grande", Font.ITALIC, 14));
		panOperacoes.add(lblMensagem);
		
		JPanel panSacar = new JPanel();
		panSacar.setBounds(5, 5, 110, 75);
		panOperacoes.add(panSacar);
		panSacar.setLayout(null);
		panSacar.setVisible(false);
		
		txtSacar = new JTextField();
		txtSacar.setBounds(6, 6, 100, 26);
		panSacar.add(txtSacar);
		txtSacar.setColumns(10);
		
		JPanel panSaldo = new JPanel();
		panSaldo.setBounds(139, 6, 218, 36);
		panOperacoes.add(panSaldo);
		panSaldo.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panSaldo.setVisible(false);
		
		JLabel lblSaldoAtual = new JLabel("Saldo atual");
		panSaldo.add(lblSaldoAtual);
		
		txtSaldo = new JTextField();
		panSaldo.add(txtSaldo);
		txtSaldo.setColumns(10);
		
		JPanel panMensalidade = new JPanel();
		panMensalidade.setBounds(10, 80, 472, 39);
		panOperacoes.add(panMensalidade);
		panMensalidade.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panMensalidade.setVisible(false);
		panMensalidade.setVisible(false);
		
		JLabel lblMsgMensalidade = new JLabel("");
		panMensalidade.add(lblMsgMensalidade);
		
		JPanel panNovaConta = new JPanel();
		panNovaConta.setBounds(139, 10, 212, 154);
		panOperacoes.add(panNovaConta);
		panNovaConta.setLayout(null);
		panNovaConta.setVisible(false);
		
		JLabel lblNumeroDaConta = new JLabel("Numero da conta");
		lblNumeroDaConta.setBounds(6, 11, 108, 16);
		panNovaConta.add(lblNumeroDaConta);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(117, 6, 85, 26);
		panNovaConta.add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(6, 48, 44, 16);
		panNovaConta.add(lblNome);
		
		txtDono = new JTextField();
		txtDono.setBounds(51, 43, 151, 26);
		panNovaConta.add(txtDono);
		txtDono.setColumns(10);
		
		JLabel lblTipoDaConta = new JLabel("Tipo");
		lblTipoDaConta.setBounds(6, 89, 44, 16);
		panNovaConta.add(lblTipoDaConta);
		
		JComboBox txtTipo = new JComboBox();
		txtTipo.setModel(new DefaultComboBoxModel(new String[] {"Conta Corrente", "Conta Poupanca"}));
		txtTipo.setBounds(51, 81, 151, 27);
		panNovaConta.add(txtTipo);
		
		JPanel panDepositar = new JPanel();
		panDepositar.setBounds(330, 5, 110, 75);
		panOperacoes.add(panDepositar);
		panDepositar.setLayout(null);
		panDepositar.setVisible(false);
		
		txtDeposito = new JTextField();
		txtDeposito.setBounds(6, 6, 98, 26);
		panDepositar.add(txtDeposito);
		txtDeposito.setColumns(10);
		
		// Criar conta no banco
		JButton btnCriarConta = new JButton("Criar conta");
		btnCriarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Verifica o tipo de conta criada
				String tipo = txtTipo.getSelectedItem().toString();
				if (tipo == "Conta Corrente") {
					tipo = "cc";
				} else {
					tipo = "cp";
				}
				conta.abrirConta(Integer.parseInt(txtNumero.getText()),
						txtDono.getText(),
						tipo);
				lblMensagem.setText("<html>A conta foi criada com sucesso!</html>");
			}
		});
		btnCriarConta.setBounds(100, 119, 102, 29);
		panNovaConta.add(btnCriarConta);
		
		JButton btnFechar = new JButton("");
		btnFechar.setBounds(450, 6, 32, 32);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Limpa a tela de operacoes e campos de texto
				panNovaConta.setVisible(false);
				panMensalidade.setVisible(false);
				panSaldo.setVisible(false);
				panOperacoes.setVisible(false);
				panSacar.setVisible(false);
				panDepositar.setVisible(false);
				lblMensagem.setText("");
				txtDono.setText("");
				txtDeposito.setText("");
				txtNumero.setText("");
				txtSacar.setText("");
			}
		});
		btnFechar.setIcon(new ImageIcon(AplicacaoBanco.class.getResource("/imagens/btnClose.png")));
		panOperacoes.add(btnFechar);
		
		// Confirma o deposito
		JButton btnDepConfirm = new JButton("Depositar");
		btnDepConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valor = Double.parseDouble(txtDeposito.getText());
				Boolean res = conta.depositar(valor);
				if (res) {
					lblMensagem.setText("Foi depositado em sua conta R$ " + valor);
				} else {
					lblMensagem.setText("Voce precisa abrir uma conta primeiro.");
				}
			}
		});
		btnDepConfirm.setBounds(6, 40, 98, 29);
		panDepositar.add(btnDepConfirm);
		
		// Confirma o saque
		JButton btnSacConfirm = new JButton("Sacar");
		btnSacConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valor = Double.parseDouble(txtSacar.getText());
				Boolean res = conta.sacar(valor);
				if (res) {
					lblMensagem.setText("Foi sacado em sua conta R$ " + valor);
				} else {
					lblMensagem.setText("Voce precisa abrir uma conta primeiro.");
				}
			}
		});
		btnSacConfirm.setBounds(6, 41, 100, 29);
		panSacar.add(btnSacConfirm);
		
		// Pagar mensalidade
		JButton btnPagar = new JButton("Pagar");
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean res = conta.pagarMensalidade();
				if (res) {
					lblMensagem.setText("<html>Foi debitado R$20,00.</html>");	
				} else {
					lblMensagem.setText("<html>Foi debitado R$12,00.</html>");
				}					
			}
		});
		panMensalidade.add(btnPagar);
		
		JButton btnMensalidade = new JButton("Pagar Mensalidade");
		btnMensalidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (statusConta()) {
					panMensalidade.setVisible(true);
					panSaldo.setVisible(false);
					panSacar.setVisible(false);
					panDepositar.setVisible(false);
					panOperacoes.setVisible(true);
					panNovaConta.setVisible(false);
					lblMensagem.setText("");
					
					if (conta.getTipoConta().equals("cc")) {
						lblMsgMensalidade.setText("<html>Sera debitado R$20,00 de sua conta corrente.</html>");	
					} else {
						lblMsgMensalidade.setText("<html>Sera debitado R$12,00 de sua conta poupanca.</html>");
					}	
				} else {
					panOperacoes.setVisible(true);
					lblMensagem.setText("Voce precisa abrir uma conta primeiro.");
				}
			}
		});
		btnMensalidade.setBounds(6, 61, 132, 41);
		contentPane.add(btnMensalidade);
		
		JButton btnSacar = new JButton("Sacar");
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (statusConta()) {
					panMensalidade.setVisible(false);
					panSaldo.setVisible(false);
					panSacar.setVisible(true);
					panDepositar.setVisible(false);
					panOperacoes.setVisible(true);
					panNovaConta.setVisible(false);
					lblMensagem.setText("");
				} else {
					panOperacoes.setVisible(true);
					lblMensagem.setText("Voce precisa abrir uma conta primeiro.");
				}
			}
		});		
		btnSacar.setBounds(362, 50, 132, 41);
		contentPane.add(btnSacar);
		
		JButton btnDepositar = new JButton("Depositar");
		btnDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (statusConta()) {
					panMensalidade.setVisible(false);
					panSaldo.setVisible(false);
					panSacar.setVisible(false);
					panDepositar.setVisible(true);
					panOperacoes.setVisible(true);
					panNovaConta.setVisible(false);
					lblMensagem.setText("");
				} else {
					panOperacoes.setVisible(true);
					lblMensagem.setText("Voce precisa abrir uma conta primeiro.");
				}
			}
		});
		btnDepositar.setBounds(362, 103, 132, 41);
		contentPane.add(btnDepositar);
		
		JButton btnNovaConta = new JButton("");
		btnNovaConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panMensalidade.setVisible(false);
				panSaldo.setVisible(false);
				panSacar.setVisible(false);
				panDepositar.setVisible(false);
				panOperacoes.setVisible(true);
				panNovaConta.setVisible(true);
			}
		});
		btnNovaConta.setIcon(new ImageIcon(AplicacaoBanco.class.getResource("/imagens/btnAdd.png")));
		btnNovaConta.setBounds(452, 6, 40, 40);
		contentPane.add(btnNovaConta);
		
		JButton btnConsultarSaldo = new JButton("Consultar Saldo");
		btnConsultarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (statusConta()) {
					panNovaConta.setVisible(false);
					panMensalidade.setVisible(false);
					panSacar.setVisible(false);
					panDepositar.setVisible(false);
					panSaldo.setVisible(true);
					panOperacoes.setVisible(true);
					txtSaldo.setText(Double.toString(conta.getSaldo()));
					lblMensagem.setText("");
				} else {
					panOperacoes.setVisible(true);
					lblMensagem.setText("Voce precisa abrir uma conta primeiro.");
				}	
			}
		});
		btnConsultarSaldo.setBounds(6, 11, 132, 41);
		contentPane.add(btnConsultarSaldo);
		
		JButton btnEncerrarConta = new JButton("Encerrar conta");
		btnEncerrarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (statusConta()) {
					panNovaConta.setVisible(false);
					panMensalidade.setVisible(false);
					panSacar.setVisible(false);
					panDepositar.setVisible(false);
					panSaldo.setVisible(false);
					panOperacoes.setVisible(true);
					lblMensagem.setText("");
					if (conta.getSaldo() == 0) {
						conta.setStatus(false);
						lblMensagem.setText("Sua conta foi encerrada");
					} else {
						lblMensagem.setText("<html>Voce possui saldo em sua conta. Para encerrar favor retirar o dinheiro.</html>");
					}
				} else {
					panOperacoes.setVisible(true);
					lblMensagem.setText("Voce precisa abrir uma conta primeiro.");
				}	
			}
		});
		btnEncerrarConta.setBounds(6, 113, 132, 41);
		contentPane.add(btnEncerrarConta);
	}
}