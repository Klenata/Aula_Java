package aula01;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Digite um número:");
		int resp = num.nextInt();
		System.out.println(resp > 0 ? "Positivo" : resp == 0 ? "Zero" : "Negativo");

	}

}
