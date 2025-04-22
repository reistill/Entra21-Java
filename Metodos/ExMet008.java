/*
Faça um programa em que o usuário entre com um número de 1 a 4
Com o número 1 sendo verão, 2 sendo outono...
Dependendo de o que o usuário informa, retorne:
É verão
E o tempo está quente.
Ou
É inverno
E está frio.
Faça um método para cada estação do ano
*/

import java.util.Scanner;

public class ExMet008 {
	
	public static String estacoes(int numero) {
		if (numero == 1) {
			return "Aí que delicia o Verão! \nEstá quente!";
		} else if (numero == 2) {
			return "É Outono! \nAs folhas estão caindo!";
		} else if (numero == 3) {
			return "Uii, é inverno! \nEstá frio!";
		} else if (numero == 4) {
			return "É primavera! \nAs folhas estão crescendo novamente! ";
		} else {
			return "Entrada inválida!";
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número [1], [2], [3], [4]:");
		int opcao = input.nextInt(); 
		
		System.out.println( estacoes(opcao) );  
		
		input.close();
	}
}
