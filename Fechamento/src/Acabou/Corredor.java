package Acabou;

public class Corredor extends Atleta{
	public String correr;
	public boolean correndo = false;
	
	public void correr() {
		if (correndo == false) {
			System.out.printf("%s esta correndo", nome);
			correndo = true;
		}
		else {
			System.out.printf("%s já está correndo", nome);
		}
	}
	
	public void pararCorrer() {
		if (correndo == true) {
			System.out.printf("%s parou de correr", nome);
			correndo = false;
		}
		else {
			System.out.printf("%s já está correndo", nome);
		}		
	}
}
