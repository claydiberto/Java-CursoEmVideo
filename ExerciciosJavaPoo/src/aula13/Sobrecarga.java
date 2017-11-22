package aula13;

public class Sobrecarga {

	public static void main(String[] args) {
		/*
		Mamifero m = new Mamifero();
		m.emitirSom();
		
		Lobo l = new Lobo();
		l.emitirSom();
		*/
		
		Cachorro c = new Cachorro();
		c.emitirSom();
		c.reagir("olá");
		c.reagir("não");
		c.reagir(11, 45);
		c.reagir(16, 20);
		c.reagir(22, 00);
		c.reagir(true);
		c.reagir(false);
		c.reagir(2, 12.5f);
		c.reagir(15, 2.5f);
	}
}
