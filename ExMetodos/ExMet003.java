/*
Faça um programa que exiba o número que o usuário entrou como parâmetro e os 20 
números que vem após esse número
(O parâmetro do método deve ser o número inserido pelo usuário)
*/

import java.util.Scanner;

public class ExMet003 {
	
	public static void imprimirVinteValores(int numero) {
		for (int i = 1; i < 21; i++) {
			System.out.println( (numero + i) + "!");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = input.nextInt();
		
		imprimirVinteValores(numero);
		
		input.close();
	}
}
