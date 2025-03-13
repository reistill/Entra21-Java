import java.util.Scanner;

//Leia quatro valores inteiros A, B, C e D
//A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D
public class ExIntro003 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//entrada do usuário
		System.out.println("Digite o primeiro número: ");
		int nA = input.nextInt();
		System.out.println("Digite o segundo número: ");
		int nB = input.nextInt();
		System.out.println("Digite o terceiro número: ");
		int nC = input.nextInt();
		System.out.println("Digite o quarto número: ");
		int nD = input.nextInt();
		input.close();
		//processamento do sistema
		int multiplicaAB = nA * nB;
		int multiplicaCD = nC * nD;
		int diferenca = multiplicaAB - multiplicaCD;
		//saída do sistema
		System.out.printf("O produto de %d * %d é: %d! \n", nA, nB, multiplicaAB);
		System.out.printf("O produto de %d * %d é: %d! \n", nC, nD, multiplicaCD);
		System.out.printf("A diferença entre eles é: %d!", diferenca);
	}
}
