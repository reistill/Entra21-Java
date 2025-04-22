/*
Faça um programa que calcule o quadrado de um número caso esse número seja par e
o dobro desse número caso esse número seja ímpar.
Retorne o resultado
*/

import java.util.Scanner;

public class ExMet012 {
	
	public static double quadradoDobro(double num) {
		
		if (num % 2 == 0) {
			return Math.pow(num, 2);
		} else {
			return (num * 2);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double numero = input.nextDouble();
		
		System.out.println( quadradoDobro(numero) );
		
		input.close();
	}
	
}
