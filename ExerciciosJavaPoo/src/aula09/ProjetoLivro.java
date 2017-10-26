package aula09;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Antonio", 25, "M");
		p[1] = new Pessoa("Maria", 20, "F");
		
		l[0] = new Livro("Java para iniciantes", "José Pedro", 200, p[0]);
		l[1] = new Livro("PHP para iniciantes", "Maria Silva", 150, p[1]);
		l[2] = new Livro("HTML e CSS", "Antonio Marcio", 650, p[1]);
		
		l[0].abrir();
		l[0].folhear(101);
		l[0].voltarPag();
		l[0].detalhes();
		
		l[1].abrir();
		l[1].avancarPag();
		l[1].detalhes();
		
		l[2].fechar();
		l[2].detalhes();
	}
}