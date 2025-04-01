import java.util.Scanner;
/*
Faça um algoritmo em que o usuário insere um número em um índice específico que ele 
mesmo informou
*/
public class ExVM005 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//vetor
		double numero[] = new double[1000];
		
		//entrada de usuário
		System.out.println("Digite o número: ");
		double num = input.nextDouble();
		System.out.println("Digite o índice que o número ficará: ");
		int indice = input.nextInt();
		input.close();
		
		//validação
		if (indice > numero.length-1) {
			System.err.println("Não há índices maiores que 999 ou menores que -1000!");
		} else {
			numero[indice] = num;
			System.out.println(numero[indice]);
		}
	}
}
