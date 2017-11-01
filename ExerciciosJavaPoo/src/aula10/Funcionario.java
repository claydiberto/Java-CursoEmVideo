package aula10;

public class Funcionario extends Pessoa {
	//
	/// Atributos
	//
	private String setor;
	private boolean trabalhando;
	
	//
	/// Construtor
	//
	public Funcionario(String nome, int idade, String sexo, String setor) {
		super(nome, idade, sexo);
		this.setor = setor;
		this.trabalhando = false;
	}
	
	//
	/// Getters e Setters
	//
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public boolean isTrabalhando() {
		return trabalhando;
	}
	
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	//
	/// Metodos do Funcionario
	//
	public void mudarTrabalho() {
		if (trabalhando) setTrabalhando(false);
		else setTrabalhando(true);
	}
	
	@Override
	public void apresentar() {
		String trab = isTrabalhando()?"está":"não está";
		super.apresentar();
		System.out.print(" e " + trab + " trabalhando.");
	}
}
