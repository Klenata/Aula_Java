package Fundamentos03;

public class Exemplo1 {

	public static void main(String[] args) {
		String str = new String();
		String alfabeto = "abcdefghijklmnopqrstuvwxyz";
		String teclado = "qwertyuiopasdfghjklçzxcvbnm";
		
		char c = alfabeto.charAt(5);
		System.out.println("Letra excluida: "+c);
		
		String s1 = "Hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals("Hello");
		boolean b2 = s1.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2);
		boolean b4 = s1.equalsIgnoreCase("azul");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}

}