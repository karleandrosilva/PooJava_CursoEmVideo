package exercicio;

public class Copo {
	String modelo;
	String material;
	int ml;
	boolean cheia;
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Material: " + this.material);
		System.out.println("Tem " + this.ml + "ML");
		System.out.println("Está cheia? " + this.cheia);
	}
	
	void encher() {
		this.cheia = true;
	}
	
	void derramar() {
		this.cheia = false;
	}
	
	void guardar() {
		if (this.cheia == true) {
			System.out.println("NÃO PODE GUARDAR, POIS O COPO ESTÁ CHEIO.");
		} else {
			System.out.println("COPO GUARDADO NO ARMÁRIO.");
		}
	}
}
