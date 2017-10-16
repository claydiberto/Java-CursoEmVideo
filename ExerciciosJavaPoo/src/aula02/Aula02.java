package aula02;

public class Aula02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Esferografica";
		c1.cor = "Azul";
		c1.setPonta(0.5f);
		c1.tampada = true;
		
		//c1.destampar();
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Tinteiro";
		c2.cor = "Preta";
		c2.tampada = false;
		c2.rabiscar();
	}
}