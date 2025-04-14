/*
Escreva um programa onde o usuário informa os dados dos lados de um triangulo depois 
verifique e imprima se ele é: Equilátero (três lados iguais), Isósceles (dois lados iguais), ou 
Escaleno (três lados diferentes)
*/

import java.util.Scanner;

public class ExAva001 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//entrada de usuário
		System.out.println("Digite um lado do triângulo: ");
		double lado1 = input.nextDouble();
		System.out.println("Digite outro lado do triângulo: ");
		double lado2 = input.nextDouble();
		System.out.println("Digite o terceiro lado do triângulo: ");
		double lado3 = input.nextDouble();
		
		input.close();
		
		//verifica e imprime
		if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("Equilátero!");
		} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			System.out.println("Escaleno!");
		} else {
			System.out.println("Isósceles!");
		}
	}
}