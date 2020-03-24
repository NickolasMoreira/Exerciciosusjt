package br.exercicios.ex01;

import java.util.Random;

public class TesteImpressao {

	public static void main(String[] args) {
		
		 //private int impressao;
		
		 ImpressaoArquivoOutput imprime = new ImpressaoArquivoOutput();
		 ImpressaoNaTela imprime2 = new ImpressaoNaTela();
		 
		   Random gerador = new Random(); 
	       int x = gerador.nextInt();
	        
	        switch (x%2){
	        case 0:
	        	//System.out.println("Exporta TXT");
	        	imprime.escreve();
	            break;
	            
	        case 1:
	        	 imprime2.escreve();
	        	 //System.out.println("teste");
	        	 
	        }
	       
	    }
	
		 
		 
		
		
		

	

}
