package vetor;

import java.util.Calendar;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Vetor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		System.out.println("-- Veja se o ano é bisexto --");
		System.out.print("Digite o ano a ser verificado: ");
		int ano = tec.nextInt();
		
		boolean bis = false;
		
		String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// Verifica se o ano é bixesto
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			bis = true;
		}
		
		String bool;
		if (bis) {
			bool = " é ";
			tot[1] = 29;
		}
			else bool = " não é ";
		
		System.out.println("");
		System.out.println("O ano " + ano + bool +  "bissexto.");
		System.out.println("");
		
		for (int i = 0; i < mes.length; i++) {
			System.out.println("O mês de " + mes[i] + " tem " + tot[i] + " dias");
		}
	}

}