package aula11;

public class Aluno extends Pessoa {
	//
	/// Atributos
	//
	protected int matricula;
	protected String curso;
	
	//
	/// Construtor
	//
	public Aluno(String nome, int idade, String sexo, int matricula) {
		super(); 
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.matricula = matricula;
	}
	
	//
	/// Getters e Setters
	//
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//
	/// Metodos de Aluno
	//
	public void pagarMensalidade() {
		System.out.println("Mensalidade de aluno paga.");
	}
	
	@Override
	public void apresentar() {
		super.apresentar();
		System.out.println(" e o n�mero de sua matr�cula � " + getMatricula());
	}
}
