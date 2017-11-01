package aula10;

public class Pessoa {
	//
	/// Atributos
	//
	protected String nome;
	protected int idade;
	protected String sexo;
	
	//
	/// Construtor
	//
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

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
	public void fazerAniver() {
		this.idade++;
	}
	
	public void apresentar() {
		System.out.print("\n" + getNome() + " tem " + getIdade() + " anos de idade");
	}
}