package Fundamentos2;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos alunos tem na sala?");
		int qtdAlunos = input.nextInt();
		double soma = 0;
		
		for (int i = 0; i < qtdAlunos; i++) {
			System.out.println("Digite a nota:");
			soma += input.nextDouble();
		}
		double media = soma/qtdAlunos;
		
		String status = (media > 7 ? "Aprovada":"Reprovada");
		System.out.printf("Turma %s", status);
		
		
	}

}
