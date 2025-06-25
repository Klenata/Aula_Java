package Metodos;

public class concessionária {

	public static void main(String[] args) {
		Carros c1 = new Carros();
		Carros c2 = new Carros("Gol", 48000);
		Carros c3 = new Carros("Prata", "Onix", 60000.00);
		System.out.printf("O nosso %s está por R$%.2f", c3.modelo, c3.preco);

	}

}