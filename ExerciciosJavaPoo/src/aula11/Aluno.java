package aula11;

public class Aluno extends Pessoa {
	//
	/// Atributos
	//
	private int matricula;
	private String curso;
	
	//
	/// Construtor
	//
	/*public Aluno(String nome, int idade, String sexo, int matricula) {
		super(nome, idade, sexo);
		this.matricula = matricula;
	}*/
	
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
	public void cancelarMatricula() {
		this.curso = "";
		System.out.println("Matrícula cancelada.");
	}
	
	@Override
	public void apresentar() {
		super.apresentar();
		System.out.print(" e o número de sua matrícula é " + getMatricula());
	}
}
