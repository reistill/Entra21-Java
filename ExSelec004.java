import java.util.Scanner;

/*
Faça um algoritmo que leia um caractere.
Caso seja digitada a letra 'M' escreva “Masculino”.
Se for digitada a letra 'F' escreva “Feminino”.
Se for informado 'I' escreva “Não Informado”.
Qualquer outra letra digitada escreva “Entrada Incorreta”.
*/
public class ExSelec004 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//entrada usuário
		System.out.println("Digite seu sexo (M ou H): ");
		char sexo = input.next().charAt(0);
		input.close();
		//processamento
		if (sexo == 'H') {
			System.out.println("Você é Homem!");
		} else if (sexo == 'M') {
			System.out.println("Você é Mulher!");
		} else {
			System.out.println("Entrada Inválida!");
		}
	}
}
