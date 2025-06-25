package Fundamentos03;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		String texto = input.nextLine();
        char alvo = ' ';
        int contador = 1;
		
        for (int i = 0; i < texto.length(); i++) {
        	if (texto.charAt(i) == alvo) {
        		contador++;        		
        	}
        }
		System.out.println(contador);
	}

}
