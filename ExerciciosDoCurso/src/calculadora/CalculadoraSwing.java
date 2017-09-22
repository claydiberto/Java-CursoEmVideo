package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.Format;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class CalculadoraSwing extends JFrame {

	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraSwing frame = new CalculadoraSwing();
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
	public CalculadoraSwing() {
		setResizable(false);
		setTitle("Super Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 6, 187, 130);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNmero = new JLabel("Numero 1:");
		lblNmero.setBounds(6, 6, 82, 16);
		panel_1.add(lblNmero);
		
		JLabel lblNewLabel = new JLabel("Numero 2:");
		lblNewLabel.setBounds(6, 50, 82, 16);
		panel_1.add(lblNewLabel);
		
		txtN1 = new JTextField();
		txtN1.setBounds(84, 1, 95, 26);
		panel_1.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(84, 45, 95, 26);
		panel_1.add(txtN2);
		txtN2.setColumns(10);
		
		JPanel panResultados = new JPanel();
		panResultados.setBackground(UIManager.getColor("Button.background"));
		panResultados.setBounds(6, 148, 299, 277);
		contentPane.add(panResultados);
		panResultados.setLayout(null);
		// Deixa o painel de resultados invisível ao iniciar o programa
		panResultados.setVisible(false);
		
		JLabel lblSoma = new JLabel("Adicao:");
		lblSoma.setBounds(6, 6, 129, 16);
		panResultados.add(lblSoma);
		
		JLabel lblSubtrao = new JLabel("Subtracao:");
		lblSubtrao.setBounds(6, 34, 129, 16);
		panResultados.add(lblSubtrao);
		
		JLabel lblMultiplicao = new JLabel("Multiplicacao:");
		lblMultiplicao.setBounds(6, 62, 129, 16);
		panResultados.add(lblMultiplicao);
		
		JLabel lblNewLabel_1 = new JLabel("Divisao:");
		lblNewLabel_1.setBounds(6, 90, 129, 16);
		panResultados.add(lblNewLabel_1);
		
		JLabel lblResto = new JLabel("Resto:");
		lblResto.setBounds(6, 118, 129, 16);
		panResultados.add(lblResto);
		
		JLabel lblNewLabelRaiz = new JLabel("Raiz Quadrada:");
		lblNewLabelRaiz.setBounds(6, 172, 129, 16);
		panResultados.add(lblNewLabelRaiz);
		
		JLabel lblNewLabel_2 = new JLabel("Raiz Cubica:");
		lblNewLabel_2.setBounds(6, 200, 129, 16);
		panResultados.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Elevado ao Cubo:");
		lblNewLabel_3.setBounds(6, 228, 129, 16);
		panResultados.add(lblNewLabel_3);
		
		JLabel lblValorAbsoluto = new JLabel("Valor Absoluto:");
		lblValorAbsoluto.setBounds(6, 256, 129, 16);
		panResultados.add(lblValorAbsoluto);
		
		JLabel lblAdi = new JLabel("0");
		lblAdi.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblAdi.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAdi.setForeground(new Color(210, 105, 30));
		lblAdi.setBounds(180, 6, 113, 16);
		panResultados.add(lblAdi);
		
		JLabel lblSub = new JLabel("0");
		lblSub.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblSub.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSub.setForeground(new Color(210, 105, 30));
		lblSub.setBounds(180, 34, 113, 16);
		panResultados.add(lblSub);
		
		JLabel lblMul = new JLabel("0");
		lblMul.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblMul.setHorizontalAlignment(SwingConstants.TRAILING);
		lblMul.setForeground(new Color(210, 105, 30));
		lblMul.setBounds(180, 62, 113, 16);
		panResultados.add(lblMul);
		
		JLabel lblDiv = new JLabel("0");
		lblDiv.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblDiv.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDiv.setForeground(new Color(210, 105, 30));
		lblDiv.setBounds(180, 90, 113, 16);
		panResultados.add(lblDiv);
		
		JLabel lblRes = new JLabel("0");
		lblRes.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblRes.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRes.setForeground(new Color(210, 105, 30));
		lblRes.setBounds(180, 118, 113, 16);
		panResultados.add(lblRes);
		
		JLabel lblRa2 = new JLabel("0");
		lblRa2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblRa2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRa2.setForeground(new Color(210, 105, 30));
		lblRa2.setBounds(180, 172, 113, 16);
		panResultados.add(lblRa2);
		
		JLabel lblRa3 = new JLabel("0");
		lblRa3.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblRa3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRa3.setForeground(new Color(210, 105, 30));
		lblRa3.setBounds(180, 200, 113, 16);
		panResultados.add(lblRa3);
		
		JLabel lblEl3 = new JLabel("0");
		lblEl3.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblEl3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEl3.setForeground(new Color(210, 105, 30));
		lblEl3.setBounds(180, 228, 113, 16);
		panResultados.add(lblEl3);
		
		JLabel lblAbs = new JLabel("0");
		lblAbs.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblAbs.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAbs.setForeground(new Color(210, 105, 30));
		lblAbs.setBounds(180, 256, 113, 16);
		panResultados.add(lblAbs);
		
		JLabel lblNewLabel_4 = new JLabel("Valores calculados com o numero 1");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(16, 145, 273, 16);
		panResultados.add(lblNewLabel_4);
		
		JLabel label = new JLabel("");
		label.setBounds(205, 6, 100, 130);
		contentPane.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(CalculadoraSwing.class.getResource("/imagens/calc.png")));
		
		// Acao do botao calcular
		JButton btnCalcular = new JButton("");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Torna visivel o painel de resultados
				panResultados.setVisible(true);
				
				// Captura os dois numeros digitados
				float n1 = Float.parseFloat(txtN1.getText());
				float n2 = Float.parseFloat(txtN2.getText());
				
				// Realiza a adicao dos valores
				lblAdi.setText(Float.toString(n1 + n2));
				
				// Realiza a subtracao dos valores
				lblSub.setText(Float.toString(n1 - n2));
				
				// Realiza a multiplicacao dos valores
				lblMul.setText(Float.toString(n1 * n2));
				
				// Realiza a divisao dos valores
				lblDiv.setText(Float.toString(n1 / n2));
				
				// Realiza o resto da divisao dos valores
				lblRes.setText(Float.toString(n1 % n2));
				
				// Calcula a raiz quadrada do numero 1
				lblRa2.setText(Double.toString(Math.sqrt(n1)));
				
				// Calcula a raiz cubica do numero 1
				lblRa3.setText(Double.toString(Math.cbrt(n1)));
				
				// Eleva o numero 1 ao cubo
				lblEl3.setText(Double.toString(Math.pow(n1, 3)));
				
				// Mostra o valor absoluto do numero 1
				lblAbs.setText(Float.toString(Math.abs(n1)));
				
			}
		});
		btnCalcular.setBounds(129, 74, 50, 50);
		panel_1.add(btnCalcular);
		btnCalcular.setIcon(new ImageIcon(CalculadoraSwing.class.getResource("/imagens/btnCalculadora.png")));
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Limpa as duas caixas de texto
				txtN1.setText("");
				txtN2.setText("");
			}
		});
		btnLimpar.setBounds(6, 95, 82, 29);
		panel_1.add(btnLimpar);
	}
}
