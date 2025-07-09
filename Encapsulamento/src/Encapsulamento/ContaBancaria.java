package Encapsulamento;

public class ContaBancaria {
	private String numeroConta;
	private double saldo;
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo+=valor;
		}
		else {
			System.out.println("Valor Invalido!");
		}
	}
	public void sacar(double valor) {
		if (saldo > 0 && valor <= saldo) {
			this.saldo -= valor;
		}
		else {
			System.out.println("Valor Invalido!");
		}
	}
	
	
	
	
	
}
