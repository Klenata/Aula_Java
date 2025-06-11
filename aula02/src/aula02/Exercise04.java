package aula02;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite se feminino ou masculino: ");
		char letra = input.next().charAt(0);
		
		System.out.println(letra == 'f' ? "Feminino" : "Masculino");

	}

}
