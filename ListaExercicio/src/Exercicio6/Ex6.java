package Exercicio6;

import javax.swing.JOptionPane;

public class Ex6 {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Insira o seu nome e idade para que possamos verificar se possui permiss�o para tirar carteira");
		String nome = JOptionPane.showInputDialog("Insira seu nome: ");
		int idade =Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua idade: "));
		
		 
		if (idade >= 18) {
			JOptionPane.showMessageDialog(null, nome+", voc� possui permiss�o para tirar carteira de motorista.");
		}
		else {
			JOptionPane.showMessageDialog(null,  nome+ "Voc� n�o possui permiss�o para tirar carteira");
		}
	}
 
}
