import java.util.Scanner;
/*
Faça um algoritmo que descubra se uma array de 5 elementos possui o número que o usuário 
entrou. Imprima também o seu índice
*/
public class ExVM003 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero[] = {3, 5, 15, 76, 99, 10, 7};
		
		//entrada usuário
		System.out.println("Digite um número: ");
		int advinha = input.nextInt();
		input.close();
		
		boolean tem = false;
		
		for (int i = 0; i < numero.length; i++) {
		
			if (advinha == numero[i] ) {
				System.out.println("O número " + numero[i] + " está no vetor! localizado no índice: " + i + "!");
				tem = true;
				break;
			}
		}
		//checa se o tem é verdadeiro
		if (!tem) {
			System.out.println("Número não encontrado, você errou!");
		}
	}
}
