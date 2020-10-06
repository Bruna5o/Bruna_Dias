package Exercicio9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex9 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex9 frame = new Ex9();
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
	public Ex9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Marca = new JLabel("PIzzaria Maquiavel");
		Marca.setFont(new Font("Castellar", Font.BOLD, 18));
		Marca.setBounds(29, 11, 346, 31);
		contentPane.add(Marca);
		
		JLabel pedido = new JLabel("Escolha sua pizza: ");
		pedido.setFont(new Font("Castellar", Font.BOLD, 14));
		pedido.setBounds(29, 44, 193, 23);
		contentPane.add(pedido);
		
		JCheckBox pizza1 = new JCheckBox("A moda do Pr\u00EDncipe");
		pizza1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pizza1.setBounds(6, 86, 126, 23);
		contentPane.add(pizza1);
		
		JCheckBox pizza2 = new JCheckBox("Mandr\u00E1gora-Jalapenho");
		pizza2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pizza2.setBounds(144, 86, 142, 23);
		contentPane.add(pizza2);
		
		JCheckBox pizza3 = new JCheckBox("A arte do champignon");
		pizza3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pizza3.setBounds(288, 86, 136, 23);
		contentPane.add(pizza3);
		
		JLabel acompanha = new JLabel("Acompanhamento");
		acompanha.setFont(new Font("Castellar", Font.BOLD, 14));
		acompanha.setBounds(29, 126, 193, 23);
		contentPane.add(acompanha);
		
		JCheckBox a1 = new JCheckBox("Queijo");
		a1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		a1.setBounds(6, 173, 97, 23);
		contentPane.add(a1);
		
		JCheckBox a2 = new JCheckBox("Molho");
		a2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		a2.setBounds(144, 173, 97, 23);
		contentPane.add(a2);
		
		JCheckBox a3 = new JCheckBox("Borda Recheada");
		a3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		a3.setBounds(300, 173, 124, 23);
		contentPane.add(a3);
		
		JButton pedidob = new JButton("Fazer pedido!");
		pedidob.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					JOptionPane.showMessageDialog(null, "Pedido realizado! ");
			}
		});
		pedidob.setFont(new Font("Castellar", Font.BOLD, 14));
		pedidob.setBounds(144, 214, 164, 23);
		contentPane.add(pedidob);
	}
}
