package Exercicio10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex10 extends JFrame {

	private JPanel contentPane;
	private JTextField RuaT;
	private JTextField NumT;
	private JTextField BairroT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try { 
					Ex10 frame = new Ex10();
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
	public Ex10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Endereco = new JLabel("Endere\u00E7o: ");
		Endereco.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Endereco.setBounds(24, 11, 86, 14);
		contentPane.add(Endereco);
		
		JLabel rua = new JLabel("Rua: ");
		rua.setFont(new Font("Times New Roman", Font.BOLD, 12));
		rua.setBounds(24, 54, 46, 14);
		contentPane.add(rua);
		
		JLabel n = new JLabel("Numero: ");
		n.setFont(new Font("Times New Roman", Font.BOLD, 12));
		n.setBounds(24, 79, 70, 14);
		contentPane.add(n);
		
		JLabel bairro = new JLabel("Bairro: ");
		bairro.setFont(new Font("Times New Roman", Font.BOLD, 12));
		bairro.setBounds(24, 108, 46, 14);
		contentPane.add(bairro);
		
		JLabel Cidade = new JLabel("Cidade: ");
		Cidade.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cidade.setBounds(24, 133, 46, 14);
		contentPane.add(Cidade);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Belo Horizonte");
		comboBox.addItem("Ouro Preto");
		comboBox.addItem("Mariana");
		comboBox.addItem("Nova Lima");
		comboBox.addItem("Ibirite");
		comboBox.setSelectedItem(null);
		comboBox.setToolTipText("");
		comboBox.setBounds(80, 129, 281, 22);
		contentPane.add(comboBox);
		
		JButton salva = new JButton("Salvar");
		salva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Endereço cadastrado com sucesso! " + RuaT.getText() +" N°: " +  NumT.getText() + " - " + BairroT.getText() + " - " + comboBox.getSelectedItem() + ", " + "Minas Gerais");
				
			}
		});
		salva.setBounds(272, 197, 89, 23);
		contentPane.add(salva);
		
		RuaT = new JTextField();
		RuaT.setBounds(80, 51, 281, 20);
		contentPane.add(RuaT);
		RuaT.setColumns(10);
		
		NumT = new JTextField();
		NumT.setBounds(80, 76, 86, 20);
		contentPane.add(NumT);
		NumT.setColumns(10);
		
		JLabel estado = new JLabel("Pais: ");
		estado.setFont(new Font("Times New Roman", Font.BOLD, 12));
		estado.setBounds(24, 158, 46, 14);
		contentPane.add(estado);
		
		JLabel MG = new JLabel("Minas Gerais");
		MG.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		MG.setBounds(80, 158, 281, 14);
		contentPane.add(MG);
		
		BairroT = new JTextField();
		BairroT.setColumns(10);
		BairroT.setBounds(80, 104, 281, 20);
		contentPane.add(BairroT);
	}
}
