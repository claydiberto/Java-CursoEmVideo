package calculaidade;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

public class CalculaIdade extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculaIdade frame = new CalculaIdade();
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
	public CalculaIdade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 334, 182);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAnoDeNascimento = new JLabel("Ano de nascimento:");
		lblAnoDeNascimento.setBounds(10, 11, 127, 14);
		contentPane.add(lblAnoDeNascimento);
		
		JSpinner txtAno = new JSpinner();
		txtAno.setModel(new SpinnerNumberModel(2017, 1900, 2017, 1));
		txtAno.setBounds(141, 8, 63, 20);
		contentPane.add(txtAno);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(CalculaIdade.class.getResource("/imagens/User.png")));
		lblNewLabel.setBounds(214, 0, 103, 105);
		contentPane.add(lblNewLabel);
		
		JLabel lblIdade = new JLabel("0");
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblIdade.setForeground(Color.RED);
		lblIdade.setBounds(214, 107, 52, 33);
		contentPane.add(lblIdade);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Captura o Ano de nascimento informado no campo txtAno
				int anoNascimento = Integer.parseInt(txtAno.getValue().toString());
				
				// Captura o ano atual
				Calendar calendario = Calendar.getInstance();
				int anoAtual = calendario.get(Calendar.YEAR);
				
				// Atribui ao label lblIdade a subtração do ano atual com o ano de nascimento capturado
				lblIdade.setText(Integer.toString(anoAtual - anoNascimento));
			}
		});
		btnCalcular.setIcon(new ImageIcon(CalculaIdade.class.getResource("/imagens/calculator.png")));
		btnCalcular.setBounds(10, 39, 194, 59);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel_1 = new JLabel("Sua idade ao final do ano ser\u00E1: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 119, 226, 14);
		contentPane.add(lblNewLabel_1);		
	}
}
