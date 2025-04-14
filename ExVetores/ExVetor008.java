/*
Descreva um algoritmo que leia 5 valores e os coloque em um vetor de 5 posições
Imprima quais valores desses informados são maiores que a média dos valores
*/

import java.util.Scanner;

public class ExVM008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//vetor
		double numero[] = new double[5];
		//variável
		double soma = 0;
		double media = 0;
		
		for (int i = 0; i < 5; i++) {
			
			//entrada de usuário
			System.out.println("Digite um número: ");
			double num = input.nextDouble();
			
			//adicionando número no vetor
			numero[i] = num;
			
			//somando valores
			soma += num;
		}
		
		input.close();
		
		media = soma/numero.length;
		
		for (int i = 0; i < 5; i++) {
			if (numero[i] > media) {
				System.out.println("O " + numero[i] + " está acima da média: " + media + "!");
			}
		}
	}
}
