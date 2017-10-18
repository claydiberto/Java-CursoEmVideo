package aula06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JToggleButton;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controle extends JFrame {

	//
	/// Atributos para com variaveis tratadas
	//
	private JLayeredPane contentPane;
	private boolean on, play;
	private int vol;
	
	//
	/// Instancia um objeto (c) da classe ControleRemoto
	ControleRemoto c = new ControleRemoto();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controle frame = new Controle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//
	/// Metodo para atualizar os valores das variaveis
	//
	public void refresh() {
		int[] r = c.status();
		on = (r[0] == 1)?true:false;
		play = (r[1] == 1)?true:false;
		vol = r[2];
	}
	
	/**
	 * Create the frame.
	 */
	public Controle() {
		setResizable(false);
		setTitle("Controle Remoto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 334);
		contentPane = new JLayeredPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 145, 300);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTela = new JLabel("Tela");
		lblTela.setForeground(Color.GRAY);
		lblTela.setFont(new Font("Verdana", Font.BOLD, 16));
		lblTela.setHorizontalAlignment(SwingConstants.CENTER);
		lblTela.setBounds(6, 6, 139, 24);
		panel.add(lblTela);
		
		JPanel panDisplay = new JPanel();
		panDisplay.setBackground(Color.WHITE);
		panDisplay.setBounds(0, 84, 145, 216);
		panel.add(panDisplay);
		panDisplay.setLayout(null);
		
		JLabel lblVolume = new JLabel("ico");
		lblVolume.setHorizontalAlignment(SwingConstants.CENTER);
		lblVolume.setBounds(6, 6, 35, 35);
		panDisplay.add(lblVolume);
		
		JSlider sliVolume = new JSlider();
		sliVolume.setMaximum(15);
		sliVolume.setEnabled(false);
		sliVolume.setValue(0);
		sliVolume.setOrientation(SwingConstants.VERTICAL);
		sliVolume.setBounds(6, 53, 35, 157);
		panDisplay.add(sliVolume);
		
		JProgressBar barTocando = new JProgressBar();
		barTocando.setBackground(Color.ORANGE);
		barTocando.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		barTocando.setMaximum(10);
		barTocando.setForeground(Color.DARK_GRAY);
		barTocando.setOrientation(SwingConstants.VERTICAL);
		barTocando.setBounds(76, 6, 63, 204);
		panDisplay.add(barTocando);
		
		JLabel lblPwd = new JLabel("OFF");
		lblPwd.setForeground(new Color(255, 0, 0));
		lblPwd.setFont(new Font("Verdana", Font.BOLD, 14));
		lblPwd.setHorizontalAlignment(SwingConstants.CENTER);
		lblPwd.setBounds(6, 42, 47, 30);
		panel.add(lblPwd);
		
		JSlider sliPwd = new JSlider();
		sliPwd.setEnabled(false);
		sliPwd.setMaximum(1);
		sliPwd.setValue(0);
		sliPwd.setForeground(Color.GRAY);
		sliPwd.setBounds(55, 42, 84, 30);
		panel.add(sliPwd);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(163, 6, 185, 300);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Controle");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel.setBounds(6, 6, 172, 24);
		panel_1.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnPwd = new JButton("PWD");
		btnPwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refresh();								// Atualiza os valores das variaveis
				if (on) {								// Verifica se o controle esta ligado (Se positivo)
					c.desliga();							// Desliga o controle
					lblPwd.setText("OFF");				// Escreve OFF no label
					lblPwd.setForeground(Color.RED);		// Define a cor RED para o label
					sliPwd.setValue(0);					// Define o valor 0 para o slider
				} else {
					c.liga();							// Liga o controle
					lblPwd.setText("ON");				// Escreve ON no label
					lblPwd.setForeground(Color.BLUE);	// Define a cor BLUE para o label
					sliPwd.setValue(1);					// Define o valor 1 para o slider
					sliVolume.setValue(vol);				// Define o valor do volume atual para o slider do volume
				}
			}
		});
		btnPwd.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnPwd.setBounds(6, 58, 80, 40);
		panel_1.add(btnPwd);
		
		JToggleButton btnMenu = new JToggleButton("MENU");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnMenu.isSelected()) {				// Verifica se o botao esta selecionado (Se positivo)
					panDisplay.setVisible(true);			// Torna visivel o painel display
				} else {
					panDisplay.setVisible(false);		// Torna invisivel o painel display
				}
			}
		});
		btnMenu.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnMenu.setBounds(98, 58, 80, 40);
		panel_1.add(btnMenu);
		
		JToggleButton btnMute = new JToggleButton("MUTE");
		btnMute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				// // // Implementar a mudanca o icone lblVolume
				refresh();
				if (btnMute.isSelected()) {				// Verifica se o botao esta selecionado (Se positivo)
					sliVolume.setValue(0);				// Define o slider volume em 0
								// Define a imagem de alto-falante-mudo no icone do label volume
				} else {
					sliVolume.setValue(vol);				// Define o slider volume com o valor do volume atual
								// Define a imagem de alto-falante-mudo no icone do label volume
				}
			}
		});
		btnMute.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnMute.setBounds(6, 162, 172, 40);
		panel_1.add(btnMute);
		
		JButton btnPlay = new JButton("PLAY | PAUSE");
		btnPlay.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				barTocando.setValue(5);
			}
		});
		btnPlay.setBounds(6, 110, 172, 40);
		panel_1.add(btnPlay);
		
		JButton btnMaisVolume = new JButton("+");
		btnMaisVolume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.maisVolume();
				refresh();
				sliVolume.setValue(vol);
				btnMute.setSelected(false);
			}
		});
		btnMaisVolume.setFont(new Font("Verdana", Font.BOLD, 22));
		btnMaisVolume.setBounds(98, 214, 80, 80);
		panel_1.add(btnMaisVolume);
		
		JButton btnMenosVolume = new JButton("-");
		btnMenosVolume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.menosVolume();
				refresh();
				sliVolume.setValue(vol);
				btnMute.setSelected(false);
			}
		});
		btnMenosVolume.setFont(new Font("Verdana", Font.BOLD, 22));
		btnMenosVolume.setBounds(6, 214, 80, 80);
		panel_1.add(btnMenosVolume);
	}
}
