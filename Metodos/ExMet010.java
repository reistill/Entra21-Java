/*
Faça um método booleano que retorne true se o número passado como parâmetro seja 
par.
Retorne false caso seja ímpar.
*/

import java.util.Scanner;

public class ExMet010 {
	
	public static boolean parImpar(double num) {
		
		if (num % 2 == 0) {
			return true;
		}	
		
		return false;
		
	}
	//pelo método ser booleano ele precisa devolver um valor true or false, por causa da comparação " == " no return ele nos devolve esses valores
	public static boolean parImparExpert(double num) {
		return num % 2 == 0;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double numero = input.nextDouble();
		System.out.println( parImpar(numero) );
		
		input.close();
	}
}
