package aula12;

public class Ave extends Animal {
	private String corPena;

	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");
	}

	@Override
	public void emitirSom() {
		System.out.println("som de Ave");
	}

	protected String getCorPena() {
		return corPena;
	}

	protected void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	protected void fazerNinho() {
		System.out.println("Construiu um ninho");
	}
	
}
