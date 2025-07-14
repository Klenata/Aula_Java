package Encapsulamento;

public class Aluno {
	private String nome;
	private double nota1, nota2, media = (nota1+nota2)/2;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double getMedia(double nota1, double nota2) {
		return (nota1+nota2)/2;
	}
	
	public void isAprovado() {
		if (media >= 6.0) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
		}
	}
	

}
