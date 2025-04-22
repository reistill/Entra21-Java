/*
Faça um programa que diz se um número inserido está dentro de um limite imposto 
pelo usuário
Por exemplo:
Usuário inseriu o limite máximo como 100.
Usuário inseriu o limite mínimo como 70.
Depois ele inseriu o número 80.
O retorno deve ser: 80 está nos limites impostos.

*/

import java.util.Scanner;

public class ExMet015 {
	
	public static String limitador(double limite, double minimo, double num) {
		
		if (num < limite && num > minimo) {
			return num + " está nos limites impostos!";
		} else {
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o limite: ");
		double limite = input.nextDouble();
		
		System.out.println("Digite o mínimo: ");
		double minimo = input.nextDouble();
		
		System.out.println("Digite um número: ");
		double numero = input.nextDouble(); 
		
		System.out.println( limitador(limite, minimo, numero) );
		
		input.close();
	}
	
}
