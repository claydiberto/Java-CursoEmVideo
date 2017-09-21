package somavalores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SomaValores extends JFrame {

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
					SomaValores frame = new SomaValores();
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
	public SomaValores() {
		setTitle("Soma valores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 94);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtN1 = new JTextField();
		txtN1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtN1.setBounds(10, 11, 60, 32);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtN2.setBounds(113, 11, 60, 32);
		contentPane.add(txtN2);
		txtN2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(80, 15, 23, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblResultado = new JLabel("0");
		lblResultado.setForeground(Color.RED);
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblResultado.setBounds(253, 10, 82, 32);
		contentPane.add(lblResultado);
		
		JButton btnSoma = new JButton("=");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Captura o valor do campo txtN1 e atribui a variavel n1
				int n1 = Integer.parseInt(txtN1.getText());
				
				// Captura o valor do campo txtN2 e atribui a variavel n2
				int n2 = Integer.parseInt(txtN2.getText());
				
				// Soma os valores de n1 e n2 e atribui ao label lblResultado
				lblResultado.setText(Integer.toString(n1+n2));
			}
		});
		btnSoma.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSoma.setBounds(183, 10, 60, 32);
		contentPane.add(btnSoma);		
	}
}