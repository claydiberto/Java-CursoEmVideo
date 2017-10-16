package repeticaofor;

public class RepeticaoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 3; i++) {
			for (int j = 0; j < 3; j+=2) {
				System.out.println(i + " " + j);
			}
		}
	}
}