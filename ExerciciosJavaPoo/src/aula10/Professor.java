package aula10;

public class Professor extends Pessoa {
	//
	/// Atributos
	//
	private String especialidade;
	private double salario;
	
	//
	/// Construtor
	//
	public Professor(String nome, int idade, String sexo, String especialidade) {
		super(nome, idade, sexo);
		this.especialidade = especialidade;
	}
	
	//
	/// Getters e Setters
	//
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	//
	/// Metodos do Professor
	//
	public void receberAumento(double aumento) {
		this.salario += aumento;
	}
	
	@Override
	public void apresentar() {
		super.apresentar();
		System.out.print(" e seu salário é R$" + getSalario());
	}
}
