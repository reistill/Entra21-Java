/*
Faça um método que receba um número, esse será o número "base"
Dentro do método, faça o usuário entrar com mais dois números
Imprima qual dos dois últimos números está mais perto do primeiro número "base"
*/

import java.util.Scanner;

public class ExMet006 {
	
	public static void advinho(double base) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double num1 = input.nextDouble();
		System.out.println("Digite outro número: ");
		double num2 = input.nextDouble();
		
		input.close();
		
		if ( Math.abs((base-num1)) > Math.abs((base-num2)) ) {
			System.out.println("O número " + num2 + " está mais perto do " + base + "!");
		} else {
			System.out.println("O número " + num1 + " está mais perto do " + base + "!");
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número base:");
		double numeroBase = input.nextDouble();
		
		advinho(numeroBase);
		
		input.close();
	}
}
