package triangulo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.Painter;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;

public class Triangulo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Triangulo frame = new Triangulo();
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
	public Triangulo() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 432, 291);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Segmento a");
		lblNewLabel.setBounds(10, 11, 76, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Segmento b");
		lblNewLabel_1.setBounds(10, 44, 76, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Segmento c");
		lblNewLabel_2.setBounds(10, 77, 76, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblA = new JLabel("0");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblA.setForeground(new Color(128, 128, 128));
		lblA.setBounds(232, 13, 24, 14);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("0");
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblB.setForeground(new Color(128, 128, 128));
		lblB.setBounds(232, 46, 24, 14);
		contentPane.add(lblB);
		
		JLabel lblC = new JLabel("0");
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblC.setForeground(new Color(128, 128, 128));
		lblC.setBounds(232, 79, 24, 14);
		contentPane.add(lblC);
		
		JSlider sliA = new JSlider();
		sliA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				lblA.setText(Integer.toString(sliA.getValue()));
			}
		});
		sliA.setMaximum(20);
		sliA.setValue(0);
		sliA.setBounds(96, 11, 126, 22);
		contentPane.add(sliA);
		
		JSlider sliB = new JSlider();
		sliB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				lblB.setText(Integer.toString(sliB.getValue()));				
			}
		});
		sliB.setMaximum(20);
		sliB.setValue(0);
		sliB.setBounds(96, 44, 126, 23);
		contentPane.add(sliB);
		
		JSlider sliC = new JSlider();
		sliC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				lblC.setText(Integer.toString(sliC.getValue()));
			}
		});
		sliC.setValue(0);
		sliC.setMaximum(20);
		sliC.setBounds(96, 77, 126, 23);
		contentPane.add(sliC);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Triangulo.class.getResource("/imagens/triangulosIcon.png")));
		lblNewLabel_6.setBounds(266, 11, 150, 135);
		contentPane.add(lblNewLabel_6);
		
		JPanel panTriangulo = new JPanel();
		panTriangulo.setBounds(295, 157, 121, 94);
		contentPane.add(panTriangulo);
		panTriangulo.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblTriangulo = new JLabel("");
		panTriangulo.add(lblTriangulo);
		lblTriangulo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panResultado = new JPanel();
		panResultado.setBounds(10, 157, 277, 94);
		contentPane.add(panResultado);
		panResultado.setVisible(false);
		
		JLabel lblStatus = new JLabel("New label");
		lblStatus.setForeground(SystemColor.textHighlight);
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 18));
		panResultado.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblTipo = new JLabel("New label");
		lblTipo.setForeground(new Color(244, 164, 96));
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 18));
		panResultado.add(lblTipo);
		panResultado.add(lblStatus);
		
		JButton btnChecar = new JButton("Verificar");
		btnChecar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panResultado.setVisible(true);
				int a = sliA.getValue();
				int b = sliB.getValue();
				int c = sliC.getValue();
				
				if ((a < b+c) && (b < a+c) && (c < a+b) ) {
					lblStatus.setText("Formam um triângulo");
					if (a == b && b == c) {
						lblTipo.setText("Equilátero");
						lblTriangulo.setIcon(new ImageIcon(Triangulo.class.getResource("/imagens/equilatero.png")));
					} else if (a == b || a == c || b == c) {
						lblTipo.setText("Isósceles");
						lblTriangulo.setIcon(new ImageIcon(Triangulo.class.getResource("/imagens/isosceles.png")));
					} else {
						lblTipo.setText("Escaleno");
						lblTriangulo.setIcon(new ImageIcon(Triangulo.class.getResource("/imagens/escaleno.png")));
					}
				} else {
					lblStatus.setText("Não formam um triângulo");
					lblTipo.setText("----");
					lblTriangulo.setIcon(null);
				}
			}
		});
		btnChecar.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		btnChecar.setBounds(10, 110, 246, 36);
		contentPane.add(btnChecar);
		
	}
}
