import java.util.Scanner;
/*
Escreva um algoritmo em que o usuário entre 5 valores de 0 a 1000
Começando com o laço (while ou for) em 0
Escreva os números que o usuário entro
*/
public class ExLR004 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//entrada de usuário
		for (int i = 0, j = 1; i <= 4; i++, j++) {
			System.out.printf("Digite o %d° número: \n", j);
			double numero = input.nextDouble();
			if (numero > 1000 || numero < 0) {
				System.err.printf("O número %f não é válido! \n", numero);
			} else {
				System.out.printf("O número digitado foi %f! \n", numero);
			}
		}
		input.close();
	}
}
