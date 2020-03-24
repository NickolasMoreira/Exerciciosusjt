package br.com.exemplos.AbstractFactory;
// A CLASSE DE TESTE POSSUI UM MÉTODO montarCarro QUE VERIFICA SE O USUARIO DESEJA UM CARRO DO TIPO LUXO OU POPULAR
// SE O USUARIO DIGITAR LUXO O OBJETO DO TIPO CarroFactory (referencia geral, pode ser CarroLuxoFactory ou CarroPopularFactory)
// instancia um novo CarroLuxoFactory e o objeto do tipo carro usa o montar roda e montar som dessa classe la embaixo 
public class TesteFactory {

		public static Pizza montarPizza(String sabor) {
			PizzaFactory pf	= null;
			switch (sabor) {
			case "Segunda": 
				pf = new PizzaCalabresa();
				break;
			case "Quarta": 
				pf = new PizzaCalabresa();
				break;
			case "Sexta": 
				pf = new PizzaCalabresa();
				break;				
			case "Terça":
				pf = new PizzaPresuntoFactory();
				break;
			case "Quinta":
				pf = new PizzaPresuntoFactory();
				break;
			case "Sabado":
				pf = new PizzaPresuntoFactory();
				break;
			}				
			
			
			Pizza pizza = new Pizza();
			pizza.setSabor((pf.montarPizza()));
			pizza.setPizzaiolo((pf.SelecionaPizzaiolo()));
			
			return pizza;
		}

		public static void main(String[] args) {
			Pizza pizza1 = montarPizza("Segunda");
			Pizza pizza2 = montarPizza("Sabado");
			
			//System.out.println(c1);
		}

}
