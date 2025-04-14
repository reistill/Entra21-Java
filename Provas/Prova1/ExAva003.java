/*
Crie um programa Java para encontrar a primeira sequência de números seguidos em um 
vetor.
Por exemplo, o vetor {6, 0, 1, 2, 1, 2, 3, 4, 5, 1, 6} tem a primeira sequência sendo {0, 1, 2}.
Exiba essa sequência.
Peça para o usuário inserir os valores em um vetor de 8 posições.
*/

import java.util.Scanner;

public class ExAva003 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero[] = new int[8];
		
		for (int i = 0; i < numero.length; i++) {
			
			//entrada usuário
			System.out.printf("Digite o %d° valor de um vetor de 8 posições: \n", i+1);
			int num = input.nextInt();
			
			//adicionando num em numero
			numero[i] = num;
		}
		
		input.close();
		
		//imprime o vetor numero
		for (int i = 0; i < numero.length; i++) {
			System.out.print(numero[i] + " ");
		}
		
		System.out.println();
		
		//percorre vetor numero
		for (int i = 0; i < numero.length; i++) {
			//verifica se o número + 1 é igual ao próximo número do vetor, ou seja, uma sequência
			if(numero[i] + 1 == numero[i+1] && i != (numero.length - 1)) {
				System.out.print(numero[i] + " ");
			}
		}
	}
}
