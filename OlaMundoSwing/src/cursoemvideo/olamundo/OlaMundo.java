package cursoemvideo.olamundo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class OlaMundo extends JFrame {

	private JPanel contentPane;
	private JTextField txtResolucao;
	private JTextField txtIdioma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlaMundo frame = new OlaMundo();
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
	public OlaMundo() {
		setTitle("Aprendendo Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		final JLabel lblMensagem = new JLabel("");
		lblMensagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagem.setForeground(new Color(255, 0, 0));
		lblMensagem.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblMensagem.setBounds(53, 57, 312, 84);
		panel.add(lblMensagem);
		
		JLabel lblIdioma = new JLabel("Idioma:");
		lblIdioma.setBounds(10, 170, 59, 14);
		panel.add(lblIdioma);
		
		JLabel lblResoluo = new JLabel("Resolu\u00E7\u00E3o:");
		lblResoluo.setBounds(10, 195, 68, 14);
		panel.add(lblResoluo);
		
		txtResolucao = new JTextField();
		txtResolucao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtResolucao.setBounds(81, 191, 103, 20);
		panel.add(txtResolucao);
		txtResolucao.setColumns(10);
		
		txtIdioma = new JTextField();
		txtIdioma.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIdioma.setBounds(81, 166, 103, 20);
		panel.add(txtIdioma);
		txtIdioma.setColumns(10);
		
		JLabel lblData = new JLabel("");
		lblData.setHorizontalAlignment(SwingConstants.RIGHT);
		lblData.setFont(new Font("Calibri", Font.ITALIC, 18));
		lblData.setForeground(Color.DARK_GRAY);
		lblData.setBounds(133, 221, 281, 41);
		panel.add(lblData);
		
		JButton btnClick = new JButton("Clique aqui");
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Mostra a mensagem "Olá, mundo!"
				lblMensagem.setText("Olá, mundo!");
				
				// Mostra a data e hora
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm" + " - " + "dd/MM/yyyy");
				lblData.setText(sdf.format(new Date()));
				
				// Mostra a resolução da tela
				Toolkit tool = Toolkit.getDefaultToolkit();
				Dimension d = tool.getScreenSize();
				txtResolucao.setText(d.width + " x " + d.height);
				
				// Mostra o idioma do computador
				Locale local = Locale.getDefault();
				txtIdioma.setText(local.getDisplayLanguage());
			}
		});
		btnClick.setForeground(Color.DARK_GRAY);
		btnClick.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnClick.setBounds(133, 11, 162, 35);
		panel.add(btnClick);
		
	}
}
