package br.com.exemplos.AbstractFactory;

//ABSTRACT FACTORY - Essa é minha classe abstrata mais genérica
//Quem extender dela é obrigado a implementar os métodos montaRoda e montarSom

public abstract class PizzaFactory {
	
	public abstract Sabor montarPizza();	
	public abstract Pizzaiolo SelecionaPizzaiolo();
}
