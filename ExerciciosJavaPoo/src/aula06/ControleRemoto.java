package aula06;

import java.lang.reflect.Array;

public class ControleRemoto implements Controlador {
	//
	/// Atributos
	//
	private boolean ligado, tocando;
	private int volume;
	private int[] st = new int[3];
	
	//
	/// Metodo Construtor
	//
	public ControleRemoto() {
		ligado = false;
		tocando = false;
		volume = 5;
	}
	
	//
	/// Metodos Getters e Setters
	//
	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	//
	/// Metodos sobrescritos da interface Controlador 
	//
	@Override
	public void liga() {
		setLigado(true);
	}

	@Override
	public void desliga() {
		setLigado(false);
		setTocando(false);
	}

	@Override
	public void abrirMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maisVolume() {
		if (volume < 15) volume++;
	}

	@Override
	public void menosVolume() {
		if (volume > 0) volume--;
	}

	@Override
	public void ligarMudo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desligarMudo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tocar() {
		tocando = true;
	}

	@Override
	public void parar() {
		tocando = false;
	}

	//
	/// Metodo conversor de boolean para int ( true = 1 / false = 0 ). Retorna um array[3] com os valores convertidos
	//
	@Override
	public int[] status() {
		st[0] = (ligado)?1:0;
		st[1] = (tocando)?1:0;
		st[2] = volume;
		return st;
	}
}
