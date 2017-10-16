package vetor;

import java.util.Arrays;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[] = {5, 6, 5, 12, 98, 8852, 1 };
		
		// Colocar em ordem
		Arrays.sort(v);
		
		// Procura o valor 12
		int valor = 12;
		int pos = Arrays.binarySearch(v, valor);
		System.out.println("O valor " + valor + " está na posição: [" + --pos + "] do vetor.");
		
		for (int vetor: v) {
			System.out.println(vetor);
		}
	}

}
