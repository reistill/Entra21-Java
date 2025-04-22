/*
1)
Faça um programa em que o usuário entre com um número de 1 a 4
Com o número 1 sendo verão, 2 sendo outono...
Dependendo de o que o usuário informa, imprima:
É verão
E o tempo está quente
Ou
É inverno
E está frio
Faça um método para cada estação do ano
*/

import java.util.Scanner;

public class ExMet001 {		
	
	//criando método verão, outono, inverno, primavera
	public static void verao() {
		System.out.println("Aí que delicia o Verão!");
		System.out.println("Está quente!");
	}

	public static void outono() {
		System.out.println("Outono!");
		System.out.println("As folhas estão caindo! :[");
	}
			
	public static void inverno() {
		System.out.println("Uii, é inverno!");
		System.out.println("Está frio!");
	}
		
	public static void primavera() {
		System.out.println("É primavera! :]");
		System.out.println("As folhas estão crescendo novamente!");
	}
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número [1], [2], [3], [4]:");
		int n = input.nextInt();
		
		if (n == 1) {
			verao();
		} else if (n == 2) {
			outono();
		} else if (n == 3) {
			inverno();
		} else if (n == 4) {
			primavera();
		} else {
			System.out.println("Entrada inválida!");
		}
		
		input.close();
	}
}