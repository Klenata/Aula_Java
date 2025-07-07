package Encapsulamento;

public class TesteNumeros {

	public static void main(String[] args) {
		Numeros c1 = new Numeros();
		c1.ajustarValor(135);
		int retorno = c1.mostrarValor();
		System.out.println(retorno);

	}

}
