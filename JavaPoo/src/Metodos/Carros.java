package Metodos;

public class Carros {
	public String cor;
	public double preco;
	public String modelo;
	
	public Carros() {
		
	}
	
	public Carros(String modelo, double preco) {
		this.cor = "Preta";
		this.modelo = modelo;
		this.preco = preco;		
	}
	
	public Carros(String cor,String modelo, double preco) {
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
	}
	
		
}