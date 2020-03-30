package recebeNome;

public class Nome {
	
	protected String nome;
	protected String sobreNome;
	
	public Nome(String nome, String sobreNome) {
		
		this.nome = nome;
		this.sobreNome = sobreNome;
	}
	


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String toString() {
		
		return nome + sobreNome;
		
	}

}
