/*
Faça um método que receba 4 números como parâmetros, some os 4 números.
Retorne a soma.
*/

import java.util.Scanner;

public class ExMet009 {
	
	public static double somarquatro(double num1, double num2, double num3, double num4) {
		return (num1 + num2) + (num3 + num4);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double numero1 = input.nextDouble();
		System.out.println("Digite o segundo número: ");
		double numero2 = input.nextDouble();
		System.out.println("Digite mais um número: ");
		double numero3 = input.nextDouble();
		System.out.println("Digite o quarto número: ");
		double numero4 = input.nextDouble();
		
		System.out.println( somarquatro(numero1, numero2, numero3, numero4) );
		
		input.close();
	}
}
