package Fundamentos2;

public class Exercise6 {

	public static void main(String[] args) {
		int aux = 1;
		for (int i = 1; i < 100; i++) {
			if (i%3 == 0) {
				System.out.printf("%d x 3 = %d\n",aux++, i);
			}
		}

	}

}
