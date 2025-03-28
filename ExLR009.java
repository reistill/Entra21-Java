import java.util.Scanner;
/*
Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do
sexo (sexo = 'M' ou 'm' para masculino e sexo = 'F' ou 'f' para feminino) de cada pessoa informe 
a média da altura das mulheres e a média de altura do grupo.
A leitura deve ser finalizada ao digitar 0 para a altura.
 */
public class ExLR009 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		//variáveis
		double altura = 0;
		double alturaF = 0;
		int f = 1;
		int i = 1;
		
		while (true) {
			
			
			
			//pergutnando altura
			System.out.printf("Digite a %d° altura: ", i);
			double pAltura = input.nextDouble();
			
			//validando
			if (pAltura == 0) {
				System.err.println("Você escolheu parar!");
				input.close();
				//saída
				System.out.println("A média de altura feminina foi de: " + alturaF / (f - 1) + "!");
				System.out.println("A média de altura do grupo foi de: " + altura / (i - 1) + "!");
				break;
			} else {
				//perguntando o sexo
				System.out.println("Digite o sexo:");
				char sexo = input.next().charAt(0);
				
				//masculino e feminino
				if (sexo == 'M' || sexo == 'm') {
					altura += pAltura;
				} else {
					altura += pAltura;
					//altura feminina
					alturaF += pAltura;
					f++;
				}
			}
			i++;
		}
	}
}
