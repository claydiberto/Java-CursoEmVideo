package aula11;

public class EscolaAula11 {

	public static void main(String[] args) {
		Visitante p1 = new Visitante();
		p1.setNome("Maria");
		p1.setIdade(16);
		p1.apresentar();
		
		Aluno a1 = new Aluno("Antonio", 25, "M", 001);
		a1.apresentar();
		a1.pagarMensalidade();
		
		Bolsista b2 = new Bolsista("José", 20, "M", 002, 500.00);
		b2.fazerAniver();
		b2.apresentar();
		b2.renovarBolsa();
		b2.pagarMensalidade();
	}
}