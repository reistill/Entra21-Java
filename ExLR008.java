import java.util.Scanner;

/*
Dada uma turma de alunos, contendo seu nome e nota de duas provas.
Descreva um algoritmo para informar a média de cada aluno.
Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”.
 */
public class ExLR008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			//perguntando nomes
			System.out.println("Digite o nome do aluno: ");
			String nome = input.next();
			
			//validando
			if (nome.equals("fim")) {
				System.err.println("Você escolheu parar!");
				input.close();
				break;
			} else {
				//perguntando notas
				System.out.println("Digite a 1° nota: ");
				double nota1 = input.nextDouble();
				System.out.println("Digite a 2° nota: ");
				double nota2 = input.nextDouble();
				//calculo da média de cada aluno
				double media = (nota1 + nota2) / 2;
				System.out.printf("O aluno: %s de notas: %f + %f tem uma média de %f! \n", nome, nota1, nota2, media);
			}
		}
	}
}
