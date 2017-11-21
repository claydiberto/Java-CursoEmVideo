package aula12;

public class Sobreposicao {

	public static void main(String[] args) {
		//Animal n = new Animal();		// Classe abstrata não pode ser instanciada
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		System.out.println("-- Mamífero --");
		m.setPeso(35.3f);
		m.setCorPelo("Branco");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		System.out.println("--");
		System.out.println("");
		
		System.out.println("-- Reptil --");
		r.setIdade(2);
		r.setMembros(4);
		r.alimentar();
		r.locomover();
		r.emitirSom();
		System.out.println("--");
		System.out.println("");
		
		System.out.println("-- Peixe --");
		p.setCorEscama("Azul");
		p.alimentar();
		p.locomover();
		p.emitirSom();
		p.soltarBolha();
		System.out.println("--");
		System.out.println("");
		
		System.out.println("-- Ave --");
		a.setIdade(3);
		a.alimentar();
		a.locomover();
		a.emitirSom();
		System.out.println("--");
		System.out.println("");
		
		Canguru c = new Canguru();
		System.out.println("-- Canguru --");
		c.locomover();
		c.emitirSom();
		c.usarBolsa();
		System.out.println("--");
		System.out.println("");
		
		Cachorro k = new Cachorro();
		System.out.println("-- Cachorro --");
		k.alimentar();
		k.locomover();
		k.emitirSom();
		System.out.println("--");
		System.out.println("");
		
		Cobra j = new Cobra();
		System.out.println("-- Cobra --");
		j.emitirSom();
		j.locomover();
		System.out.println("--");
		System.out.println("");
		
		Tartaruga t = new Tartaruga();
		System.out.println("-- Tartaruga --");
		t.locomover();
		t.emitirSom();
		System.out.println("--");
		System.out.println("");
		
		GoldFish g = new GoldFish();
		System.out.println("-- Goldfish --");
		g.alimentar();
		g.locomover();
		g.soltarBolha();
		System.out.println("--");
		System.out.println("");
		
		Arara e = new Arara();
		System.out.println("-- Arara --");
		e.locomover();
		e.emitirSom();
		System.out.println("--");
		System.out.println("");

	}

}
