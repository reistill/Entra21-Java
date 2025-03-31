import java.util.Scanner;
/*
Descreva um algoritmo que leia a altura de 5 pessoas e calcule a média de altura delas.

*/
public class ExLR005 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double altura = 0;
		//perguntando e adicionando as alturas
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Digite a altura da %d° pessoa: ", i);
			double pAltura = input.nextDouble();
			System.out.println("Sua altura é: " + pAltura + "!");
			altura += pAltura;
		}
		
		input.close();
		
		//calculo altura
		double media = altura / 5;
		System.out.println("A média de alturas foi: " + media + "!");
	}	
}
