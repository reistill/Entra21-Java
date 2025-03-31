import java.util.Scanner;

/*
Descreva um algoritmo que leia 5 números inteiros e escreva, para cada número lido, se ele é 
par ou ímpar.
 */

public class ExLR001 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			//entrada de usuário
			System.out.printf("Digite o %d° número: ", i);
			double numero = input.nextDouble();
			if (numero % 2 == 0) {
				System.out.println("O número é Par!");
			} else {
				System.out.println("O número é ímpar!");
			}
		}
		input.close();
	}
}
