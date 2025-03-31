import java.util.Scanner;

//Leia 2 valores inteiros e imprima sua soma e produto
public class ExIntro001 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//entrada do usuário
		System.out.println("Digite o primeiro número: ");
		int n1 = input.nextInt();
		System.out.println("Digite o segundo número: ");
		int n2 = input.nextInt();
		input.close();
		//procesamento do sistema
		int soma = n1 + n2;
		int multiplicacao = n1 * n2;
		//saída do sistema
		System.out.printf("A soma de %d + %d é: %d! \n", n1, n2, soma);
		System.out.printf("A multiplicação de %d + %d é: %d!", n1, n2, multiplicacao);
	}
}
