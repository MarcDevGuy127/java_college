package application;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int n = 1;
		long fatorial = 1;
		
		for (int i = n; i <= 40; i++) {
			
			fatorial *= i;
			
			System.out.printf("%d - %d %n", i, fatorial);
		}
		
		System.out.printf("Resultado: %d %n", fatorial);
	}

}
