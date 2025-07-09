package Encapsulamento;

public class testeBancario {

	public static void main(String[] args) {
		ContaBancaria cliente1 = new ContaBancaria();
		
		cliente1.depositar(50);
		cliente1.depositar(50);
		cliente1.depositar(50);
		cliente1.depositar(50);
		cliente1.sacar(150);
		System.out.printf("Seu saldo é de %.2f.",cliente1.getSaldo());

	}

}
