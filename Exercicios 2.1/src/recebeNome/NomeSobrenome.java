package recebeNome;

public class NomeSobrenome implements criaNome  {

	@Override
	public Nome criar(String s) {
		
		int pos = s.indexOf(" ");  //Recebe string e armazena em pos a posição do espaço do que procuro
		String nome = s.substring(0,pos);  //armazena em nome os caracteres da string até a  pos do espaço em branco
		String sobrenome = s.substring(pos + 1, s.length()); //armazena todo o resto
		return new Nome(nome,sobrenome);  //cria um novo objeto do tipo nome 
	

	
	}


}
