package calculofatorial;

import java.util.Scanner;

public class fatorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner tec = new Scanner(System.in);
		System.out.println(" __/!\\__ Sistema fatorial __/!\\__");
		System.out.println("|                                |");
		System.out.println("|   Para sair digite 0 (zero)    |");
		System.out.println("|________________________________|");
		
		String formula = "";
		
		do {
			int fat = 1;
			System.out.println("");
			System.out.print("Para saber o fatorial, digite o número: ");
			num = Integer.parseInt(tec.nextLine());
			
			// calcula o fatorial do numero digitado
			 for (int i = num; i > 1; i-- ) {
				fat *= i;
				formula += i + " x ";
				
			}
			
			// Mostra o fatorial do numero digitado
			System.out.println(" __________________");
			System.out.println("|                  \\");
			System.out.println("| O fatorial de " + num + " é : " + formula + "1 = " + fat);
			System.out.println("|__________________/");
			
		} while (num != 0);
		
	}
}
