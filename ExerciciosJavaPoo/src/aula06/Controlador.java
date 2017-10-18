package aula06;

public interface Controlador {
	public abstract void liga();
	public abstract void desliga();
	public abstract void abrirMenu();
	public abstract void fecharMenu();
	public abstract void maisVolume();
	public abstract void menosVolume();
	public abstract void ligarMudo();
	public abstract void desligarMudo();
	public abstract void tocar();
	public abstract void parar();
	public abstract int[] status();
}
