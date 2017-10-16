package voto;

import calculaidade.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Voto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Voto frame = new Voto();
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
	public Voto() {
		setTitle("Posso vota?");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 262, 184);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Voto.class.getResource("/imagens/User.png")));
		lblNewLabel.setBounds(10, 11, 100, 100);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ano de nascimento:");
		lblNewLabel_1.setBounds(130, 11, 116, 14);
		contentPane.add(lblNewLabel_1);
		
		JSpinner txtAnoNasc = new JSpinner();
		txtAnoNasc.setModel(new SpinnerNumberModel(new Integer(2017), new Integer(1900), null, new Integer(1)));
		txtAnoNasc.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtAnoNasc.setBounds(120, 34, 105, 33);
		contentPane.add(txtAnoNasc);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setForeground(Color.DARK_GRAY);
		lblResultado.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblResultado.setBounds(10, 122, 236, 23);
		contentPane.add(lblResultado);
		
		JButton btnVoto = new JButton("Posso vota?");
		btnVoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Captura o ano de nascimento
				int nasc = Integer.parseInt(txtAnoNasc.getValue().toString());
				
				// Usa a classe CalculaIdade com o ano atual
				CalculaIdade calc = new CalculaIdade();
				int idade = calc.CalculoIdade(nasc);
				
				String tipo;				
				
				// Menor que 16 anos não votam
				if (idade < 16) {
					tipo = "não é permitido";
				} else if (idade >= 16 && idade < 18 || idade > 70) {
					tipo = "é opcional";
				} else {
					tipo = "é obrigatório!";
				}
				lblResultado.setText("Você tem " + idade + " anos. Seu voto " + tipo );
			}
		});
		btnVoto.setBounds(120, 78, 105, 33);
		contentPane.add(btnVoto);
	}
}
