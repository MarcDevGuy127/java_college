package application;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int n = 1;
		int fatorial = 1;
		
		for (int i = n; i <= 10; i++) {
			
			fatorial *= i;
			
			System.out.printf("%d - %d %n", i, fatorial);
		}
		
		System.out.printf("Resultado: %d %n", fatorial);
	}

}
