package aula14;

public class Visualizacao {
	// Atributos
	private Gafanhoto espectador;
	private Video filme;
	
	// Getters e Setters
	public Gafanhoto getEspectador() {
		return espectador;
	}
	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}
	public Video getFilme() {
		return filme;
	}
	public void setFilme(Video filme) {
		this.filme = filme;
	}
	
	// Construtor
	public Visualizacao(Gafanhoto espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.viuMaisUm();
		this.espectador.ganhaExp();
		this.filme.play();
		this.filme.setViews(this.filme.getViews() + 1);
	}
	
	// Metodos de sobrecarga
	public void avaliar() {
		filme.setAvaliacao(5);
	}
	
	public void avaliar(float nota) {
		this.filme.setAvaliacao((filme.getAvaliacao() + nota) / filme.getViews());
	}
	
	public void avaliar(int porc) {
		int perc = 0;
		if (porc < 30) perc = 3;
		else if (porc <= 60) perc = 6;
		else perc = 10;
	}
}
