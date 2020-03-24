package br.com.exemplos.AbstractFactory;

//ESSA É A FABRICA DE CARROS DE LUXO, ELA USA OS MÉTODOS HERDADOS DA CarroFactory
//PAR CRIAR UM CARRO COM RODAS LIGA LEVE E SOM DO TIPO CDPLAYER
public class PizzaCalabresa extends PizzaFactory {

	@Override
	public Sabor montarPizza() {
		return new Calabresa();
	}

	@Override
	public Pizzaiolo SelecionaPizzaiolo() {
		
		return new Pizzaiolo1();
	}

}
