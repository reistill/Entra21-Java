/*
Crie uma array de 5 elementos e descubra:
a) Qual o maior elemento
b) Qual o menor elemento
c) A média dos elementos
*/

public class ExVM002 {
	public static void main(String[] args) {
		
		double numero[] = {9, 16, 24, 44, 33};
		
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;
		double soma = 0;
		
		for (int i = 0; i < numero.length; i++) {
			
			//maior
			if (numero[i] > maior) {
				maior = numero[i];
			}
			//menor
			if (numero[i] < menor) {
				menor = numero[i];
			}
			
			soma += numero[i];
		}
		//saída
		System.out.printf("O maior número é %f! e o menor é: %f! ", maior, menor);
		System.out.printf("A média dos números é: " + soma/(numero.length) + "!");
	}
}
