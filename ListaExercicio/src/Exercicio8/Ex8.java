package Exercicio8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex8 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex8 frame = new Ex8();
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
	public Ex8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Mensagem = new JLabel("Entre os pensadores iluministas, est\u00E3o:");
		Mensagem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Mensagem.setBounds(31, 24, 305, 35);
		contentPane.add(Mensagem);
		
		JRadioButton alternativaA = new JRadioButton("John Locke, Voltaire e Jean-Jacques Rousseau");
		alternativaA.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		alternativaA.setBounds(31, 66, 305, 23);
		contentPane.add(alternativaA);
		
		JRadioButton ALTERNATIVAb = new JRadioButton("Calvino e Lutero");
		ALTERNATIVAb.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ALTERNATIVAb.setBounds(31, 92, 212, 23);
		contentPane.add(ALTERNATIVAb);
		
		JRadioButton alternativaC = new JRadioButton("Charles Maurras e Mussolini");
		alternativaC.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		alternativaC.setBounds(31, 118, 290, 23);
		contentPane.add(alternativaC);
		
		JRadioButton alternativad = new JRadioButton(" Francisco Franco e Karl Marx");
		alternativad.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		alternativad.setBounds(31, 144, 305, 23);
		contentPane.add(alternativad);
		
		JButton Resposta = new JButton("Responder");
		Resposta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (alternativaA.isSelected()) {
					JOptionPane.showMessageDialog(null, "Resposta certa! ");
				} else {
					JOptionPane.showMessageDialog(null, "Resposta incorreta! ");
				}
			
			}
		});
		Resposta.setBounds(269, 198, 113, 23);
		contentPane.add(Resposta);
	}
}
