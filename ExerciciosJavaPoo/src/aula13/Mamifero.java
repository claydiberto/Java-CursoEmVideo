package aula13;

public class Mamifero extends Animal {
	protected String corPelo;

	protected String getCorPelo() {
		return corPelo;
	}

	protected void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de mamífero");
	}
}
