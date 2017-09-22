package aula03;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada = true;
	
	// Metodos
	public void rabiscar() {
		if (tampada) {
			System.out.println("Erro! A caneta está tampada.");
		} else {
			System.out.println("Rabiscando...");
		}
	}
	
	public void tampar() {
		tampada = true;
	}
	
	public void destampar() {
		tampada = false;
	}
	
	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	// Mostra o status da caneta
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta + "mm");
		System.out.println("Carga: " + this.carga + "%");
		System.out.println("Tampada: " + (this.tampada == true?"Sim":"Não"));
	}
}
