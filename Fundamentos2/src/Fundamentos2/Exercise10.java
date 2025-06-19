package Fundamentos2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String resultado;
		double alunos[] = new double [5], soma = 0, media = 0;
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.printf("Digite a %dª nota: ", i+1);
			alunos[i] = input.nextDouble();
			soma += alunos[i];
			}
		
		media = soma/alunos.length;
		resultado = (media > 7 ? "Aprovada": "Reprovada");
		System.out.printf("A sua média é %.2f e a turma está %s\n", media, resultado);
		System.out.println(Arrays.toString(alunos));
	}

}
