package aula07;

import java.util.Random;

public class Luta {
	//
	/// Atributos
	//
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	//
	/// Metodo construtor
	//
	public Luta() {
		this.aprovada = false;
	}

	//
	/// Getters e Setters
	//
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}	
	
	//
	/// Metodos de uma luta
	//
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			aprovada = true;
			setDesafiado(l1);
			setDesafiante(l2);
		} else {
			aprovada = false;
			setDesafiante(null);
			setDesafiado(null);
		}
	}
	
	// Calcula a sorte do lutador na luta (Metodo para gerar um numero aleatorio)
	public double sorte() {
		double sorte = (Math.random() * 10);
		return sorte;
	}
	
	// Calcula o IMC do lutador
	public double imc(Lutador l) {
		double imc = (l.getPeso()/(l.getAltura()*l.getAltura()));
		return imc;
	}
	
	public void lutar(int rounds) {
		setRounds(rounds);
		if (aprovada) {			
			for (int i = 0; i < rounds; i++) {		// Os lutadores combatem o numero de vezes informado ao chamar o metodo lutar()
				// Define a forca dos lutadores somando o IMC com a Sorte no dia da luta
				int f1 = (int) (sorte() + imc(desafiado));
				int f2 = (int) (sorte() + imc(desafiante));
			
				if (f1 > f2) { 						// Caso o desafiado ganhe
					System.out.println(desafiado.getNome() + " ganhou!");
					desafiado.ganharLuta();
					desafiante.perderLuta();
				} else if (f1 < f2) {				// Caso o desafiante ganhe
					System.out.println(desafiante.getNome() + " ganhou!");
					desafiado.perderLuta();
					desafiante.ganharLuta();
				} else {							// Caso seja empate
					desafiado.empatarLuta();
					desafiante.empatarLuta();
					System.out.println(" -- A luta foi empate -- ");
				} 	// fim else	
				}	// fim for		
			} else {
				System.out.println("A luta não pode acontecer");
			}
	}
}
