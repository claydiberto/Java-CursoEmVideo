package aula11;

public class Bolsista extends Aluno {
	//
	/// Atributos
	//
	private double bolsa;
	
	//
	/// Construtor
	//
	public Bolsista(String nome, int idade, String sexo, int matricula, double bolsa) {
		super(nome, idade, sexo, matricula);
		this.bolsa = bolsa;
	}

	//
	/// Getters e Setters
	//
	private double getBolsa() {
		return bolsa;
	}

	private void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}
	
	//
	/// Metodos de um bolsista
	//
	public void renovarBolsa() {
		System.out.println("Bolsa renovada com suceso!");
	}

	@Override
	public void pagarMensalidade() {
		System.out.println("Mensalidade de bolsista paga.");
	}
}
