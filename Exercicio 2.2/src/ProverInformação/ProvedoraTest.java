package ProverInformação;

import javax.swing.JOptionPane;

public class ProvedoraTest {

	public static void main(String[] args) {
		
		String senha = JOptionPane.showInputDialog("Digite a senha:");
		ProvedoraFactory provedora = new ProvedoraFactory();
		provedora.geraInformacao(senha);

	}

}
