/*
Faça um código que receba duas entradas do usuário
Imprima essas duas entradas ao cubo se:
Algum dos dois números for 5 ou a soma deles for 5 ou a diferença deles for 5
Se nenhuma dessas condições forem satisfeitas, imprima o quadrado dos números.
*/

import java.util.Scanner;

public class ExMet005 {
	
	public static void ehCinco(double num1, double num2) {
		if (num1 == 5 || num2 == 5) {
			System.out.println("Um dos números é 5! Os números ao cubo³ são: " + Math.pow(num1, 3) + " , " + Math.pow(num2, 3));
		}
	}
	
	public static void soma(double num1, double num2) {
		if ( (num1 + num2) == 5 ) {
			System.out.println("A soma dos números é 5! Os números ao cubo³ são: " + Math.pow(num1, 3) + " , " + Math.pow(num2, 3));
		}
	}
	
	public static void diferenca(double num1, double num2) {
		if ( (num1 - num2) == 5 || (num1 - num2) == -5 ) {
			System.out.println("A diferença dos números é de 5! Os números ao cubo³ são: " + Math.pow(num1, 3) + " , " + Math.pow(num2, 3));
		}
	}
	
	public static void quadrado(double num1, double num2) {
		System.out.println("Os números ao quadrado² são: " + Math.pow(num1, 2) + " , " + Math.pow(num2, 2));
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double numero1 = input.nextDouble();
		System.out.println("Digite outro número: ");
		double numero2 = input.nextDouble();
		
		ehCinco(numero1, numero2);
		soma(numero1, numero2);
		diferenca(numero1, numero2);
		quadrado(numero1, numero2);
		
		input.close();
	}
}
