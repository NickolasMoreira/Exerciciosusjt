package ProverInforma��o;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ProvedoraPublica extends Provedora {

	public void criaInformacao() {
		
		
		Path caminho = Paths.get("C:/Users/MOREIRA/Desktop/PROJETOS GITHUB/Exercicios Design Pattern/Exercicio 2.2/Provedor/Publico.txt");
		
		try {
		byte[] texto = Files.readAllBytes(caminho);
		String leitura = new String(texto);
		System.out.println(leitura);
		
		}catch(Exception e) {
			System.out.println("Arquivo n�o localizado");
		}
		
		}
	}

	

