package Exercicio6;

import javax.swing.JOptionPane;

public class Ex6 {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Insira o seu nome e idade para que possamos verificar se possui permissão para tirar carteira");
		String nome = JOptionPane.showInputDialog("Insira seu nome: ");
		int idade =Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua idade: "));
		
		 
		if (idade >= 18) {
			JOptionPane.showMessageDialog(null, nome+", você possui permissão para tirar carteira de motorista.");
		}
		else {
			JOptionPane.showMessageDialog(null,  nome+ "Você não possui permissão para tirar carteira");
		}
	}
 
}
