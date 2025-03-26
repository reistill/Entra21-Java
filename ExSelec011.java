import java.util.Scanner;
/*
Escreva um algoritmo em que o usuário entra com um número.
Depois ele escolhe a operação que vai ser feita com esse número
Caso ele escolha a operação 1
Modifique a variável do número entrado e some 10 ao número original
Caso ele escolha a operação 2
Modifique a variável do número entrado e subtraia 10 do número original
Caso ele escolha a operação 3
Modifique a variável do número entrado e multiplique 10 ao número original
Caso ele escolha a operação 4
Modifique a variável do número entrado e divida 10 do número original
*/

public class ExSelec011 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//entrada de usuário
		System.out.println("Digite um número: ");
		double n1 = input.nextDouble();
		System.out.println("Digite a operação [1, 2, 3, 4]: ");
		int escolha = input.nextInt();
		input.close();
		//processamento
		if (escolha == 1) {
			n1 += 10;
			System.out.printf("%f", n1);
		} else if (escolha == 2) {
			n1 -= 10;
			System.out.printf("%f", n1);
		} else if (escolha == 3) {
			n1 *= 10;
			System.out.printf("%f", n1);
		} else if (escolha == 4 ) {
			n1 /= 10;
			System.out.printf("%f", n1);
		}
	}
}
