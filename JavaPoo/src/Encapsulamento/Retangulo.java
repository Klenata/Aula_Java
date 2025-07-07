package Encapsulamento;

public class Retangulo {
	private Double altura;
	private Double base;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double calcularArea() {
		return base*altura;
	}
	
	public double calcularPerimetro() {
		return(base+altura)*2;
	}

}
