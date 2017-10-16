package repeticaofor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RepeticaoSwing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RepeticaoSwing frame = new RepeticaoSwing();
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
	public RepeticaoSwing() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inicio");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Final");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 48, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Passo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 85, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblInicio = new JLabel("0");
		lblInicio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInicio.setForeground(Color.DARK_GRAY);
		lblInicio.setBounds(225, 12, 33, 14);
		contentPane.add(lblInicio);
		
		JList lista = new JList();
		lista.setValueIsAdjusting(true);
		lista.setBounds(248, 12, 141, 219);
		contentPane.add(lista);
		
		JLabel lblFinal = new JLabel("0");
		lblFinal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFinal.setForeground(Color.DARK_GRAY);
		lblFinal.setBounds(225, 49, 33, 14);
		contentPane.add(lblFinal);
		
		JLabel lblPasso = new JLabel("0");
		lblPasso.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPasso.setForeground(Color.DARK_GRAY);
		lblPasso.setBounds(225, 86, 33, 14);
		contentPane.add(lblPasso);
		
		JSlider sliInicio = new JSlider();
		sliInicio.setValue(0);
		sliInicio.setMaximum(5);
		sliInicio.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblInicio.setText(Integer.toString(sliInicio.getValue()));
			}
		});
		sliInicio.setBounds(66, 11, 149, 23);
		contentPane.add(sliInicio);
		
		JSlider sliFinal = new JSlider();
		sliFinal.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblFinal.setText(Integer.toString(sliFinal.getValue()));
			}
		});
		sliFinal.setValue(6);
		sliFinal.setMinimum(6);
		sliFinal.setMaximum(20);
		sliFinal.setBounds(66, 49, 149, 23);
		contentPane.add(sliFinal);
		
		JSlider sliPasso = new JSlider();
		sliPasso.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblPasso.setText(Integer.toString(sliPasso.getValue()));
			}
		});
		sliPasso.setMinimum(1);
		sliPasso.setMaximum(5);
		sliPasso.setValue(1);
		sliPasso.setBounds(66, 86, 149, 23);
		contentPane.add(sliPasso);
		
		JButton btnContar = new JButton("Contar");
		btnContar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ini = sliInicio.getValue();
				int fin = sliFinal.getValue();
				int pas = sliPasso.getValue();
				
				DefaultListModel list = new DefaultListModel();
				
				for (int i = ini; i <= fin ; i += pas) {
					list.addElement(i);
				}
				
				lista.setModel(list);
			}
		});
		btnContar.setForeground(new Color(25, 25, 112));
		btnContar.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnContar.setBounds(10, 134, 228, 97);
		contentPane.add(btnContar);
	}
}