package aula12;

public class Peixe extends Animal {
	private String corEscama;

	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substâncias");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não emite som");
	}
	
	protected void soltarBolha() {
		System.out.println("Soltou uma bolha");
	}

	protected String getCorEscama() {
		return corEscama;
	}

	protected void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
}
