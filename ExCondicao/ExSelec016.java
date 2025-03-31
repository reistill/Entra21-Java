import java.util.Scanner;
/*
Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, descreva 
um algoritmo que calcule a média de aproveitamento e o conceito do aluno.
Usando a fórmula: média de aproveitamento = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + 
notaExercicios) / 7
A atribuição dos conceitos obedece à tabela abaixo:
média de aproveitamento conceito
>= 9.0 A
>= 7.5 e < 9.0 B
>= 6.0 e < 7.5 C
>= 4.0 e < 6.0 D
< 4.0 E
O algoritmo deve escrever a média de aproveitamento, o conceito correspondente e 
a mensagem ‘aprovado’ caso o conceito seja A, B ou C, e ‘reprovado’ caso o conceito 
seja D ou E
 */
public class ExSelec016 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//entrada de usuário
		System.out.println("Digite a nota da primeira prova: ");
		double nota1 = input.nextDouble();
		System.out.println("Digite a nota da segunda prova: ");
		double nota2 = input.nextDouble();
		System.out.println("Digite a nota da terceira prova: ");
		double nota3 = input.nextDouble();
		System.out.println("Digite a média dos exercícios você fez: ");
		double mEx = input.nextDouble();
		input.close();
		
		//processamento
		double aproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + mEx) /7;
		
		//variáveis 
		char conceito = ' ';
		
		if (aproveitamento >= 9) {
			conceito = 'A';
		} else if (aproveitamento >= 7.5 && aproveitamento < 9) {
			conceito = 'B';
		} else if (aproveitamento >= 6 && aproveitamento < 7.5) {
			conceito = 'C';		
		} else if (aproveitamento >= 4 && aproveitamento < 6) {
			conceito = 'D'; 
		} else {
			conceito = 'E';
		}
		
		if (conceito == 'D' || conceito == 'E') {
			System.out.printf("Sua média de aproveitamento foi: %f, conceito %c. Você está Reprovado!", aproveitamento, conceito);
		} else {
			System.out.printf("Sua média de aproveitamento foi: %f, conceito %c. Você está Aprovado!", aproveitamento, conceito);
		}
		
	}
}