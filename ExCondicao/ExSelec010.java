import java.util.Scanner;
/*
Faça uma calculadora.
O usuário entra com dois números e depois com a operação desejada.
Caso o número da operação seja 1: some os dois números.
Caso seja 2: subtraia os dois números.
Caso seja 3: multiplique os dois números.
Caso seja 4: divida os dois números
*/

public class ExSelec010 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//entrada usuário
		System.out.println("Digite o primeiro número: ");
		double n1 = input.nextDouble();
		System.out.println("Digite o segundo número: ");
		double n2 = input.nextDouble();
		//processamento
		System.out.println("Digite a operação desejada [1]Soma [2]Subtração [3]Multiplicação [4]Divisão:");
		int operacao = input.nextInt();
		input.close();
		if (operacao == 1) {
			double soma = n1 + n2;
			System.out.println("Resultado da soma é: " + soma);
		} else if (operacao == 2) {
			double subtracao = n1 - n2;
			System.out.println("Resultado da subtração é: " + subtracao);
		} else if (operacao == 3) {
			double multiplicacao = n1 * n2;
			System.out.println("Resultado da multiplicação é: " + multiplicacao);
		} else {
			double divisao = n1 / n2;
			System.out.println("Resultado da divisão é: " + divisao);
		}
	}
}
