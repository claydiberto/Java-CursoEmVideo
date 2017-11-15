package aula11;

public abstract class Pessoa {
	//
	/// Atributos
	// 
	protected String nome;
	protected int idade;
	protected String sexo;

	//
	/// Getters e Setters
	//
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//
	/// Metodos de uma pessoa
	//
	final public void fazerAniver() {
		this.idade++;
	}
	
	public void apresentar() {
		System.out.print("\n" + getNome() + " tem " + getIdade() + " anos de idade");
	}
}