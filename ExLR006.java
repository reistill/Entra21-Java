import java.text.DecimalFormat;
import java.util.Scanner;
/*
Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar com o número 0
Calcule a média de altura delas
*/
public class ExLR006 {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		DecimalFormat dF = new DecimalFormat("0.00");
		double altura = 0;
		int i = 1;
		
		while (true) {
			
			//perguntando as alturas
			System.out.printf("Digite a altura da %d° pessoa: ", i);
			double pAltura = input.nextDouble();
			
			if (pAltura != 0) {
				System.out.println("Sua altura é: " + pAltura + "!");
				//adicionando as alturas
				altura += pAltura;
				i++;
			} else {
				System.err.println("Você escolheu parar de escrever as alturas!");
				double media = altura / (i - 1);
				System.out.println("Aqui está a média de alturas: " + dF.format(media) + "!");
				input.close();
				break;
			}
		}
	}
}
