package exercicio;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copo copo = new Copo();
		
		copo.modelo = "Americano";
		copo.material = "Vidro";
		copo.ml = 750;
		copo.derramar();
		
		copo.status();
		copo.guardar();
		
	}

}
