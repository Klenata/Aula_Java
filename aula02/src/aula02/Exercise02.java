package aula02;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número baseado no dia da semana: ");
		int data = input.nextInt();
		
		switch (data) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:	
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:	
			System.out.println("Quinta-feira");
			break;
		case 6:	
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Número Invalido! Digite um múmero de 1 a 7");
			
		}
	}
}
		
		/*if (data == 1) {
			System.out.println("Domingo");	
		}
		else if (data == 2) {
			System.out.println("Segunda-feira");	
		}
		else if (data == 3) {
			System.out.println("Terça-feira");	
		}
		else if (data == 4) {
			System.out.println("Quarta-feira");	
		}
		else if (data == 5) {
			System.out.println("Quinta-feira");	
		}
		else if (data == 6) {
			System.out.println("Sexta-feira");	
		}
		else if (data == 7){
			System.out.println("Sábado");
		}
		else {
			System.out.println("Número Invalido!");
		}

	}

}*/