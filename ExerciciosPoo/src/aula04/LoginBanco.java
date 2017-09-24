package aula04;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.GridLayout;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginBanco extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroConta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginBanco frame = new LoginBanco();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginBanco() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginBanco.class.getResource("/imagens/iconShield.png")));
		setTitle("Banco Shield");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 281, 146);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Banco S.H.I.E.L.D");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel.setBounds(55, 6, 178, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Conta:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(21, 61, 56, 40);
		contentPane.add(lblNewLabel_1);
		
		txtNumeroConta = new JTextField();
		txtNumeroConta.setHorizontalAlignment(SwingConstants.TRAILING);
		txtNumeroConta.setForeground(new Color(34, 139, 34));
		txtNumeroConta.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		txtNumeroConta.setBounds(89, 62, 110, 40);
		contentPane.add(txtNumeroConta);
		txtNumeroConta.setColumns(10);
		
		// Acao do botao entrar
		JButton btnEntrar = new JButton("");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Captura o numero da conta do campo txtNumeroConta
				int conta = Integer.parseInt(txtNumeroConta.getText());
				AplicacaoBanco frame = new AplicacaoBanco();
				frame.setVisible(true);
			}
		});
		btnEntrar.setIcon(new ImageIcon(LoginBanco.class.getResource("/imagens/iconShield.png")));
		btnEntrar.setBounds(211, 61, 40, 40);
		contentPane.add(btnEntrar);
	}
}
