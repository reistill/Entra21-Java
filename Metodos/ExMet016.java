/*
Faça um programa que descubra:
a) O maior elemento de um vetor
b) O menor elemento
c) A média dos valores
Retorne esses valores
*/

import java.util.Scanner;

public class ExMet016 {
	
	public static String maior(double vetor[]) {
		double maior = Double.MIN_VALUE;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		
		return "Esse é o maior: " + maior + "!";
	}
	
	public static String menor(double vetor[]) {
		double menor = Double.MAX_VALUE;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		
		return "Esse é o menor: " + menor + "!";
	}
	
	public static String media(double vetor[]) {
		double soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i]; 
		}
		
		return "Essa é a média: " + (soma/vetor.length) + "!";
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
		
		System.out.println( maior(vetor) );
		System.out.println( menor(vetor) );
		System.out.println( media(vetor) );
		
		input.close();
	}
}