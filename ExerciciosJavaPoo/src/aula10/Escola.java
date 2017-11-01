package aula10;

public class Escola {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João", 20, "M");
		Aluno p2 = new Aluno("Pedro", 25, "M", 356);
		Professor p3 = new Professor("Maria", 52, "F", "Biologia");
		Funcionario p4 = new Funcionario("Jean", 35, "M", "Fiscal");
		
		p1.fazerAniver();
		p1.apresentar();
		
		p2.fazerAniver();
		p2.apresentar();
		
		p3.receberAumento(560.25);
		p3.receberAumento(70.50);
		p3.apresentar();
		
		p4.mudarTrabalho();
		p4.apresentar();
	}
}