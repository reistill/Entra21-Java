/*
Faça um método para seus colegas mais próximos
O método deve imprimir:
O nome dele(a) é [nome]
Ele(a) tem [idade] anos
Ele(a) é estudante do Entra21
(Em prints separados)
Faça com que o método seja o nome do seu colega.
O usuário deve entrar com o nome da pessoa para escolher um dos métodos a ser 
executado.
*/

import java.util.Scanner;

public class ExMet002 {
	//criando o método Laura e Mayara
	public static void laura() {
		System.out.println("Laura");		
		System.out.println("Laura tem 21 anos!");
		System.out.println("Laura é estudante do Entra21!");
	}
	
	public static void mayara() {
		System.out.println("Mayara");		
		System.out.println("Mayara tem 16 anos!");
		System.out.println("Mayara é estudante do Entra21!");
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome de um dos colegas:");
		String nome = input.next();
		
		if (nome.equalsIgnoreCase("Laura")) {
			laura();
		} else if (nome.equalsIgnoreCase("Mayara")) {
			mayara();
		} else {
			System.out.println("Entrada inválida!");
		}
		
		input.close();
		
	}
}
