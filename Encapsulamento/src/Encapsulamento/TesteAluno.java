package Encapsulamento;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Kleber");
		aluno1.setNota1(5.5);
		aluno1.setNota2(6.5);
		
		System.out.println(aluno1.getMedia());
	}

}
