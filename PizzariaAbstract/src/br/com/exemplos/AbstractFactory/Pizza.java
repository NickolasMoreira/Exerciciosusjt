package br.com.exemplos.AbstractFactory;

public class Pizza {
	public Sabor sabor;
	public Pizzaiolo pizzaiolo;
	
	public Sabor getSabor() {
		return sabor;
	}
	public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}
	public Pizzaiolo getPizzaiolo() {
		return pizzaiolo;
	}
	public void setPizzaiolo(Pizzaiolo pizzaiolo) {
		this.pizzaiolo = pizzaiolo;
	}
	

	
}
