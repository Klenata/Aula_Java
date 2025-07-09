package Encapsulamento;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = input.next();
		System.out.print("Digite sua idade: ");
		int idade = input.nextInt();
		
		pessoa1.setNome("Kleber");
		pessoa1.setIdade(21);
		System.out.printf("Seu nome é %s e tem %d anos" ,pessoa1.getNome(), pessoa1.getIdade());
	}

}
