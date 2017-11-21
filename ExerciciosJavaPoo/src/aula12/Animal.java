package aula12;

public abstract class Animal {
	//
	/// Atributos
	//
	private float peso;
	private int idade;
	private int membros;
	
	//
	/// Métodos de animal
	//
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	//
	/// Getters e Setters
	//
	protected float getPeso() {
		return peso;
	}
	protected void setPeso(float peso) {
		this.peso = peso;
	}
	protected int getIdade() {
		return idade;
	}
	protected void setIdade(int idade) {
		this.idade = idade;
	}
	protected int getMembros() {
		return membros;
	}
	protected void setMembros(int membros) {
		this.membros = membros;
	}
}