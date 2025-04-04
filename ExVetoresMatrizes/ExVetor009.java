/*
Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 
elementos.
Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições 
respectivas dos vetores originais.
Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9].
Exiba, ao final, os três vetores na tela.
*/

import java.util.Scanner;

public class ExVM009 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int vetor1[] = new int[10];
		int vetor2[] = new int[10];
		int vetor3[] = new int[10];
		
		for (int i = 0, j = 1; i < vetor1.length; j++, i++) {
			//entrada usuário
			System.out.printf("Digite o %d° número do vetor1: \n", j);
			int num1 = input.nextInt();
			//adicionando o o valor num no vetor1
			vetor1[i] = num1;
		}
		
		for(int i = 0, j = 1; i < vetor2.length; j++, i++) {
				
			System.out.printf("Digite o %d° número do vetor2: \n", j);
			int num2 = input.nextInt();
			vetor2[i] = num2;
		}
		
		//adicionando a soma no vetor 3
		for(int i = 0; i < vetor3.length; i++) {
			vetor3[i] = (vetor1[i] + vetor2[i]);
		}
	
		input.close();
		
		System.out.println();
		
		System.out.println("Vetor 1!");
		//exibir vetor1
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print("[" + vetor1[i] + "]");
		}
		
		System.out.println();
		
		System.out.println("Vetor 2!");
		//exibir o vetor2
		for (int i = 0; i < vetor2.length; i++) {
			System.out.print("[" + vetor2[i] + "]");
		}
		
		System.out.println();
		
		System.out.println("Vetor 3!");
		//exibir o vetor3
		for (int i = 0; i < vetor3.length; i++) {
			System.out.print("[" + vetor3[i] + "]");
		}
	}
}
