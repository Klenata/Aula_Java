package Fundamentos2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos alunos tem na sua sala?");
		int aux = 1;
		int alunos = input.nextInt();
		double notas = 0;
		
		while (aux <= alunos) {
			System.out.println("Digite uma nota: ");
			notas += input.nextDouble();
			aux++;
		}
		double media = (notas/alunos);
		System.out.printf("A média da turma foi %.2f\n", media);
		String status = (media >= 7 ? "Aprovada":"Reprovada");
		System.out.printf("A turma foi %s",status);
	}

}