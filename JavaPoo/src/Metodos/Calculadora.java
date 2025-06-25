package Metodos;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o primeiro número para a soma: ");
		int n1 = input.nextInt();
		System.out.println("Digite o segundo número para a soma: ");
		int n2 = input.nextInt();
		System.out.println("Digite o terveiro número para a soma: \nse não tiver, digite 0");
		int n3 = input.nextInt();		
		CalcularMetodos soma = new CalcularMetodos();
		System.out.println(soma.somar(n1 + n2, n3));
	}

}
