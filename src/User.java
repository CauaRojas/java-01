import javax.swing.JOptionPane;

public class User {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null, "Insira seu nome:");
		String email = JOptionPane.showInputDialog(null, "Insira seu email:");
		int idade = Integer.valueOf(JOptionPane.showInputDialog(null, "Insira sua idade:"));
		JOptionPane.showMessageDialog(null, "Olá " + nome + " você tem " + idade + " anos\nAcesse seu email: " + email);
	}

}
