import java.util.Scanner;
/*
Dados dois números inteiros distintos descreva um algoritmo para informar qual deles tem o 
maior valor 
*/
public class ExSelec001 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//entrada usuário
		System.out.println("Digite um número: ");
		int n1 = input.nextInt();
		System.out.println("Digite outro número: ");
		int n2 = input.nextInt();
		input.close();
		//processamento
		if (n1 > n2) {
			System.out.printf("%d é maior que %d!", n1, n2);
		} else {
			System.out.printf("%d é maior que %d!", n2, n1);
		}
	}
}
