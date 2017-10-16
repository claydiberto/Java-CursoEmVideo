package aula02;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	// Metodos
	void rabiscar() {
		if (tampada) {
			System.out.println("Erro! A caneta está tampada.");
		} else {
			System.out.println("Rabiscando...");
		}
	}
	
	void tampar() {
		tampada = true;
	}
	
	void destampar() {
		tampada = false;
	}
	
	float getPonta() {
		return ponta;
	}

	void setPonta(float ponta) {
		this.ponta = ponta;
	}

	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta + "mm");
		System.out.println("Carga: " + this.carga + "%");
		System.out.println("Tampada: " + (this.tampada == true?"Sim":"Não"));
	}
}