/*
Faça um método que calcule o perímetro e outro que calcule a área de um retângulo
passando a altura e largura como parâmetros
Retornar os valores calculados

*/

import java.util.Scanner;

public class ExMet013 {
	
	public static double perimetroRetangulo(double base, double altura) {
		return (2 * (base + altura) );
	}
	
	public static double areaRetangulo(double base, double altura) {
		return (base * altura);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma largura: ");
		double largura = input.nextDouble();
		System.out.println("Digite uma altura :");
		double altura = input.nextDouble();
		
		System.out.println("O perímetro é: " + perimetroRetangulo(largura, altura));
		System.out.println("A área é: " + areaRetangulo(largura, altura));
		
		input.close();
	}
}
