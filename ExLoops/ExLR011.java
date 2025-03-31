import java.util.Scanner;
/*
Escreva um programa para calcular o fatorial de um número
 */
public class ExLR011 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//entrada usuário
		System.out.println("Digite um número inteiro: ");
		int numero = input.nextInt();
		
		input.close();
		
		int fatorial = numero;
		for (int i = 1; i < numero; i++) {
			fatorial *= i;
		}
		
		//saída
		System.out.printf("O fatorial de %d é %d! \n", numero, fatorial);
		
	}
}
