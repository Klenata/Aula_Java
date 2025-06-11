package aula02;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		Scanner num1 = new Scanner(System.in);
		System.out.println("Digite um número:");
		int n1 = num1.nextInt();
		System.out.println("Digite outro número:");
		int n2 = num1.nextInt();
		System.out.println("Digite outro número:");
		int n3 = num1.nextInt();
		
		int retorno = (n1 > n2 && n1 > n3 ? n1 : n2 > n1 && n2 > n3 ?  n2:  n3);
		System.out.printf("O maior número é %d", retorno);
			
	}
}
		/*System.out.println(n1 > n2 && n1 > n3 ? "O maior número é " + n1 : n2 > n1 && n2 > n3 ? "O maior número é " + n2: "o maior número é " + n3);*/

		/*int retorno = Math.max(n2, Math.max(n1, n3));
		System.out.printf("O maior número é %d", retorno);*/

		/*if (n1 > n2 && n1 > n3) {
			System.out.println("O maior número é " + n1);
		}
		else if (n2 > n1 && n2 > n3) {
			System.out.println("O maior número é " + n2);
			}
		else {
			System.out.println("O maior número é " + n3);
			}
		}
		
		}*/