package Encapsulamento;

public class animaldeestimacao {
	private String nome;
	private int idade;
	private String tipo;
	private String raca;
	
	public void atualizarNome(String nome) {
		this.nome = nome;
	}
	public String mostrarNome() {
		return this.nome;
	}
	
	public void atualizarIdade(int idade) {
		this.idade = idade;
	}
	public int mostrarIdade() {
		return this.idade;
	}
	
	public void atualizarTipo(String tipo) {
		this.tipo = tipo;
	}
	public String mostrarTipo() {
		return this.tipo;
	}
	
	public void atualizarRaca(String raca) {
		this.raca = raca;
	}
	public String mostrarRaca() {
		return this.raca;
	}

}
