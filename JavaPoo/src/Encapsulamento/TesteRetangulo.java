package Encapsulamento;

import java.util.Scanner;

public class TesteRetangulo {

	public static void main(String[] args) {
		Retangulo retangulo1 = new Retangulo();
		Retangulo retangulo2 = new Retangulo();
		
		Scanner input = new Scanner(System.in);
		System.out.println("insira o valor da base: ");
		double base = input.nextDouble();
		System.out.println("insira o valor da base: ");
		double altura = input.nextDouble();
		
		retangulo2.setAltura(altura);
		retangulo2.setBase(base);
		retangulo1.setAltura(25);
		retangulo1.setBase(50);
		System.out.println(retangulo1.calcularArea());
		System.out.println(retangulo1.calcularPerimetro());
		System.out.println(retangulo2.calcularArea());
		System.out.println(retangulo2.calcularPerimetro());

	}

}
