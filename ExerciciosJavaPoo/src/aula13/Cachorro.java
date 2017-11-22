package aula13;

public class Cachorro extends Lobo {
	private String latir = "Latindo";
	private String abanar = "Abanando";
	private String rosnar = "Rosnando";
	private String ignorar = "Ignorando";
	
	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}
	
	public void reagir(String frase) {
		if (frase.equalsIgnoreCase("comida") || frase.equalsIgnoreCase("olá")) System.out.println(abanar + " e " + latir);
		else System.out.println(rosnar);
	}
	
	public void reagir(int hora, int minuto) {
		if (hora < 12) {
			System.out.println(abanar);
		} else if (hora >= 18) {
			System.out.println(ignorar);
		} else {
			System.out.println(abanar + " e " + latir);
		}
	}
	
	public void reagir(boolean dono) {
		if (dono) System.out.println(abanar);
		else System.out.println(rosnar + " e " + latir);
	}
	
	public void reagir(int idade, float peso) {
		if (idade < 5) {
			if (peso < 10) System.out.println(abanar);
			else System.out.println(latir);
		} else
			if (peso < 10) System.out.println(rosnar);
			else System.out.println(ignorar);
	}
}
