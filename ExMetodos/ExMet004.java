/*
Faça um programa que descubra:
a) O maior elemento de um vetor
b) O menor elemento de um vetor
c) A média dos valores
*/

import java.util.Scanner;

public class ExMet004 {
	
	public static void maior(double vetor[]) {
		double maior = Double.MIN_VALUE;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		
		System.out.println("Esse é o maior: " + maior + "!" );
	}
	
	public static void menor(double vetor[]) {
		double menor = Double.MAX_VALUE;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		
		System.out.println("Esse é o menor: " + menor + "!" );
	}
	
	public static void media(double vetor[]) {
		double soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i]; 
		}
		
		System.out.println("Essa é a média: " + (soma/vetor.length) + "!" );
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do seu vetor:");
		int tamanho = input.nextInt();
		
		double vetor[] = new double[tamanho];
		
		//preeencher vetor
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.println("Digite o " + (i + 1) + "° número: ");
			double numero = input.nextDouble();
			
			vetor[i] = numero;
		}
		
		maior(vetor);
		menor(vetor);
		media(vetor);
		
		input.close();
	}
}
