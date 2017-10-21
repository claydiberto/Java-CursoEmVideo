package aula07;

import java.text.NumberFormat;

public class Lutador {
	//
	/// Atributos
	//
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//
	/// Metodo construtor
	//
	public Lutador (String no, String na, int id, double al, double pe, int vi, int de, int em) {
		nome = no;
		nacionalidade = na;
		idade = id;
		altura = al;
		setPeso(pe);
		vitorias = vi;
		derrotas = de;
		empates = em;
	}

	//
	/// Getters e Setters
	//
	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getNacionalidade() {
		return nacionalidade;
	}

	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	private int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	private double getAltura() {
		return altura;
	}

	private void setAltura(double altura) {
		this.altura = altura;
	}

	private double getPeso() {
		return peso;
	}

	private void setPeso(double peso) {
		this.peso = peso;
		if (peso < 52.2) {
			setCategoria("Inválida");
		} else if (peso <= 70.3) {
			setCategoria("Leve");
		} else if (peso <= 83.9) {
			setCategoria("Médio");
		} else if (peso <= 120.2) {
			setCategoria("Pesado");
		} else {
			setCategoria("Inválida");
		}
		
	}

	private String getCategoria() {
		return categoria;
	}

	private void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	private int getVitorias() {
		return vitorias;
	}

	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	private int getDerrotas() {
		return derrotas;
	}

	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	private int getEmpates() {
		return empates;
	}

	private void setEmpates(int empates) {
		this.empates = empates;
	}
	
	//
	/// Metodos de um lutador
	//
	public void apresentar( ) {
		System.out.println("____________________________");
		System.out.println("#----# CHEGOU A HORA #----#");
		System.out.println("Apresentamos o lutador " + this.nome);
		System.out.println("Diretamente de " + this.nacionalidade);
		System.out.println("com " + this.idade + " anos e " + this.altura + " de altura");
		System.out.println("pesando " + this.peso + "Kg");
		System.out.println(this.vitorias + " vitoras");
		System.out.println(this.derrotas + " derrotas");
		System.out.println(this.empates + " empates");
		System.out.println("____________________________");
	}
	
	public void status() {
		System.out.println("");
		System.out.println(this.nome + " é um peso " + this.categoria);
		System.out.println("Ganhou " + this.vitorias + " vezes");
		System.out.println("Perdeu " + this.derrotas + " vezes");
		System.out.println("Empatou " + this.empates + " vezes");
	}
	
	public void ganharLuta() {
		setVitorias(++this.vitorias);
	}
	
	public void perderLuta() {
		setDerrotas(++this.derrotas);
	}
	
	public void empatarLuta() {
		setEmpates(++this.empates);
	}
}
