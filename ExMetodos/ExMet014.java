/*
Faça um programa que receba 3 notas do usuário e informe a média aritmética dessas 
notas
Retorne a média
*/

import java.util.Scanner;

public class ExMet014 {
	
	public static double mediaAritmetica(double vetor[]) {
		
		double soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return soma / vetor.length;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a sua primeria nota:");
		double nota1 = input.nextDouble();
		
		System.out.println("Digite a sua segunda nota:");
		double nota2 = input.nextDouble();
		
		System.out.println("Digite a sua terceira nota:");
		double nota3 = input.nextDouble();
		
		double vetor[] = {nota1, nota2, nota3};
		
		System.out.println("A sua média é: " + mediaAritmetica(vetor));
		
		input.close();
	}
	
}
