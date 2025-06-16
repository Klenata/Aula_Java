package Fundamentos2;

public class Exercise8 {

	public static void main(String[] args) {
		int soma3 = 0, soma5 = 0, somaTotal = 0;
		

		
		for (int i = 1; i < 20+1 ;i++) {
			soma3 += i%3==0?i:0;
			soma5 += i%5==0?i:0;
			}
		somaTotal = soma3+soma5;
		System.out.println(soma3 +" "+ soma5 +" "+ somaTotal);
		}


	}
