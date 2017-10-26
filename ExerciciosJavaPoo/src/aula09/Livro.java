package aula09;

public class Livro implements Publicacao {
	//
	/// Atributos
	//
	private String titulo;
	private String autor;
	private int totalPag;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//
	/// Metodo construtor
	//
	public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPag = totalPag;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}

	//
	/// Getters e Setters
	//
	private String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	private String getAutor() {
		return autor;
	}

	private void setAutor(String autor) {
		this.autor = autor;
	}

	private int getTotalPag() {
		return totalPag;
	}

	private void setTotalPag(int totalPag) {
		this.totalPag = totalPag;
	}

	private int getPagAtual() {
		return pagAtual;
	}

	private void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	private boolean isAberto() {
		return aberto;
	}

	private void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	private Pessoa getLeitor() {
		return leitor;
	}

	private void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	//
	/// Metodos de um livro
	//	
	public void detalhes() {
		String open = aberto?"sim":"não";
		System.out.println("\nTitulo: " + titulo + " | Autor: " + autor + 
				"\nTotal de páginas: " + totalPag + " | Atual: " + pagAtual + " | Aberto: " + open 
				+ "\nLeitor: " + leitor.getNome() + " | Idade: " + leitor.getIdade() + " | Sexo: " + leitor.getSexo() + "\n");
	}

	//
	/// Metodos sobrescritos da interface Publicacao
	//
	@Override
	public void abrir() {
		if (!aberto) this.aberto = true;
		else System.out.println("O livro está aberto.");
	}

	@Override
	public void fechar() {
		if (aberto) this.aberto = false;
		else System.out.println("O livro está fechado.");
	}

	@Override
	public void folhear(int p) {
		if (p <= this.totalPag) this.pagAtual = p;
		else System.out.println("O livro tem apenas " + getTotalPag() + " páginas.");
	}

	@Override
	public void avancarPag() {
		if (aberto && (pagAtual < totalPag)) this.pagAtual++;
		else System.out.println("O livro está fechado. Impossível avançar página");
	}

	@Override
	public void voltarPag() {
		if (aberto && (pagAtual > 0)) this.pagAtual--;
		else System.out.println("O livro está fechado. Impossível retornar página");
	}
}