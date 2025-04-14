import java.util.Scanner;
/*
Descreva um algoritmo que leia 10 valores e os coloque em um vetor de 10 posições
Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam 
aumentados em 5% e os das posições pares sejam aumentados em 2%.
Imprima o vetor resultante
*/
public class ExVM007 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double dez[] = new double[10];
		
		for (int i = 0; i < dez.length; i++) {
			
			//entrada de usuário
			System.out.println("Digite um número: ");
			double num = input.nextDouble();
			
			//checando se o índice é par e adicionando ao vetor dez (se usar double usar números com , ao realizar operações)
			if (i%2 == 0) {
				dez[i] = num + (num * (2.0 / 100.00));
			} else {
				dez[i] = num + (num* (5.0/100.00));
			}
		}
		
		input.close();
		
		//imorime a lista normal
		for (int i = 0; i < dez.length; i++) {
			System.out.println(dez[i]);
		}
	}
}
