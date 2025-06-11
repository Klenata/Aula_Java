package aula02;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double n1 = input.nextDouble();		
		System.out.println("Digite a segunda nota: ");
		double n2 = input.nextDouble();
		
		double media = (n1+n2)/2;
		System.out.println(media);
		
		System.out.println((n1+n2)/2);

	}

}
