package br.com.exemplos.AbstractFactory;

//AQUI TEMOS A FABRICA DE CARROS PUPULARES, ELA USA O MÉTODO HERDADO DA CarroFactory PARA CRIAR
//UM CARRO COM RODAS SIMPLES E COM SOM DO TIPO TOCA FITAS   
public class PizzaPresuntoFactory extends PizzaFactory {


	@Override
	public Sabor montarPizza() {
		// TODO Auto-generated method stub
		return new Presunto();
	}

	@Override
	public Pizzaiolo SelecionaPizzaiolo() {
		// TODO Auto-generated method stub
		return new Pizzaiolo2();
	}

}
