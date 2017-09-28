package vetor;

import java.util.Arrays;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[] = {5, 6, 5, 12, 98, 8852, 1 };
		
		// Colocar em ordem
		Arrays.sort(v);
		
		// Procura o valor 12
		int pos = Arrays.binarySearch(v, 12);
		System.out.println(pos);
		
		for (int valor: v) {
			System.out.println(valor);
		}
	}

}
