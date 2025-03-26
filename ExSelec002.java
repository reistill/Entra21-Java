import java.util.Scanner;
/*
Dados dois valores inteiros, escreva um algoritmo que informe se o primeiro número é múltiplo 
do segundo
*/
public class ExSelec002 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//entrada usuário
		System.out.println("Digite um número inteiro: ");
		int n1 = input.nextInt();
		System.out.println("Digite outro número inteiro: ");
		int n2 = input.nextInt();
		input.close();
		//processamento
		if (n1 % n2 == 0 ) {
			System.out.printf("O número %d é multíplo de %d!", n1, n2);
		} else {
			System.out.printf("O número %d não é multíplo de %d!", n1, n2);
		}
	}	
	
}
