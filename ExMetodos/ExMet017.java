/*
Faça um código que recebe uma palavra do usuário, se essa palavra tem tamanho par, 
retorne o primeiro caractere dessa palavra.
Caso ela tenha tamanho ímpar, retorne o segundo caractere dessa palavra
*/

import java.util.Scanner;

public class ExMet017 {
	
	public static char palavraTamanhoParImpar(String palavra) {
		
		if (palavra.length() % 2 == 0) {
			return palavra.charAt(0);			
		} 
		
		return palavra.charAt(1);
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = input.next();
		
		System.out.println(palavraTamanhoParImpar(palavra));
		
		input.close();
	}
	
}
