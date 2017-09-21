package cursoemvideo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class TelaRelogio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelogio frame = new TelaRelogio();
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
	public TelaRelogio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 11, 101, 100);
		label.setIcon(new ImageIcon(TelaRelogio.class.getResource("/imagens/calendario.png")));
		contentPane.add(label);
		
		JLabel lblDataEHora = new JLabel("Data e Hora Atuais");
		lblDataEHora.setHorizontalAlignment(SwingConstants.LEFT);
		lblDataEHora.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataEHora.setBounds(121, 11, 124, 26);
		contentPane.add(lblDataEHora);
		
		JLabel lblDataHora = new JLabel("Clique no bot\u00E3o");
		lblDataHora.setForeground(Color.GRAY);
		lblDataHora.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblDataHora.setBounds(121, 45, 253, 26);
		contentPane.add(lblDataHora);
		
		JButton btnBotao = new JButton("Clique aqui");
		btnBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Date data = new Date();
				lblDataHora.setText(data.toString());
			}
		});
		btnBotao.setBounds(273, 78, 101, 23);
		contentPane.add(btnBotao);
	}
}
