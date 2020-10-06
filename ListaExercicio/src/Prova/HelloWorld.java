package Prova;

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

public class HelloWorld extends JFrame {

	private JPanel contentPane;
	private JTextField Mensagem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorld frame = new HelloWorld();
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
	public HelloWorld() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Hello = new JLabel("Hello World!");
		Hello.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Hello.setBounds(152, 43, 144, 37);
		contentPane.add(Hello);
		
		
		Mensagem = new JTextField();
		Mensagem.setBounds(87, 108, 279, 37);
		contentPane.add(Mensagem);
		Mensagem.setColumns(10);
		
		JButton Iniciar = new JButton("Iniciar");
		Iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = JOptionPane.showInputDialog("Digite seu nome: ");
				JOptionPane.showMessageDialog(null, Hello.getText() + " " + nome);

			}
		});
		Iniciar.setBounds(174, 185, 89, 23);
		contentPane.add(Iniciar);
	}
}
