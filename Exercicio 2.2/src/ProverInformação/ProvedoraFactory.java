package ProverInformação;

public class ProvedoraFactory {
	
	public Provedora geraInformacao(String senha) {
		
		
		if(senha.equals("publico")) {
			ProvedoraPublica pp = new ProvedoraPublica();
			pp.criaInformacao();
			
		}
		else if(senha.equals("dp")) {
			
			ProvedoraConfidencial pc = new ProvedoraConfidencial();
			pc.criaInformacao();
			
		}
		return null;
		
	}

}
