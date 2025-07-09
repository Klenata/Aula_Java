package Encapsulamento;

public class TesteProduto {

	public static void main(String[] args) {
		Produto item1 = new Produto();
		
		item1.setNome("Arroz");
		item1.setPreco(5.99);
		item1.setQuantidadeEstoque(5);
		item1.adicionarEstoque(3);
		item1.removerEstoque(5);
		
		System.out.printf("o Produto %s, tem %d de estoque e o valor de R$%.2f",
				item1.getNome(), item1.getQuantidadeEstoque(), item1.getPreco());
	}

}
