/*
Faça um programa que receba 2 números do usuário.
Faça um método que descubra qual dos números é maior e retorne esse valor.
Se os dois números forem iguais, retorne: número iguais.
*/

import java.util.Scanner;

public class ExMet011 {
	
	public static String maiorNumero(double num1, double num2) {
		
		if (num1 > num2) {
			return "O número " + num1 + " é o maior!";
		} else if (num2 > num1){
			return "O número " + num2 + " é o maior!";
		} else {
			return "Os dois números são iguais!";
		}
		
	}
				
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double numero1 = input.nextDouble();
		System.out.println("Digite mais um número: "); 
		double numero2 = input.nextDouble();
		
		System.out.println( maiorNumero(numero1, numero2) );
		
		input.close();
	}
}
