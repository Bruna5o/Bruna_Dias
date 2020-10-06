package Exercicio7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex7 extends JFrame {

	private JPanel contentPane;
	private JTextField comida1;
	private JTextField comida2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex7 frame = new Ex7();
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
	public Ex7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Mensagem = new JLabel("Insira suas comidas favoritas: ");
		Mensagem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Mensagem.setBounds(45, 30, 227, 28);
		contentPane.add(Mensagem);
		
		comida1 = new JTextField();
		comida1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comida1.setBounds(45, 71, 312, 20);
		contentPane.add(comida1);
		comida1.setColumns(10);
		
		comida2 = new JTextField();
		comida2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comida2.setBounds(45, 114, 312, 20);
		contentPane.add(comida2);
		comida2.setColumns(10);
		
		JButton BotaoFeito = new JButton("Feito!");
		BotaoFeito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, comida1.getText() +" e "+ comida2.getText()+" foram ótimas escolhas!!");
			}
		});
		BotaoFeito.setFont(new Font("Times New Roman", Font.BOLD, 14));
		BotaoFeito.setBounds(305, 178, 89, 23);
		contentPane.add(BotaoFeito);
	}

}
