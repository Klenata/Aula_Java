package Fundamentos2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[] = new int[4];
		int b[] = new int[4];
		int c[] = new int[4];
		int d[] = new int[4];
		
		for (int i = 0; i < a.length; i++) {
			System.out.printf("Insira o %d item da lista a: ", i+1);
			a[i] = input.nextInt();
			System.out.printf("Insira o %d item da lista b: ", i+1);
			b[i] = input.nextInt();
			System.out.printf("Insira o %d item da lista c: ", i+1);
			c[i] = input.nextInt();
			System.out.printf("Insira o %d item da lista d: ", i+1);
			d[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		

	}

}
