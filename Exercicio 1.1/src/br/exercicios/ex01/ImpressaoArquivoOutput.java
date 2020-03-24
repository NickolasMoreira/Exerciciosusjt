package br.exercicios.ex01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImpressaoArquivoOutput extends Impressao {
	
	
	public void escreve() {
	  String content = "Hello, World!";
	  String local = "C:\\Users\\MOREIRA\\Documents\\output.log";
		
      try {

   
          Files.write(Paths.get(local), content.getBytes());


      } catch (IOException e) {
          e.printStackTrace();
      }
	
	
}
}