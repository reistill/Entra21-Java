import java.util.Scanner;
/*
Uma turma tem n alunos.
Dado n, o nome (somente o primeiro nome) e idade de cada aluno descreva:
a) os nomes dos alunos que tem 18 anos
b) a quantidade de alunos que tem idade acima de 20 anos.
 */
public class ExLR010 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//perguntando a quantidade de alunos
		System.out.println("Digite quantos alunos tem na turma:");
		int aluno = input.nextInt();
		
		for (int i = 1, j = 0; i < aluno; i++) {
			
			//perguntando nome e idade dos alunos
			System.out.printf("Digite o nome do aluno %d: \n", i);
			String nome = input.next();
			System.out.println("Digite a idade do " + nome + ":");
			int idade = input.nextInt();
			
			if (idade == 18) {
				System.out.printf("O aluno %s tem %d anos! \n", nome, idade);
			} else if (idade > 20){
				System.out.printf("O aluno %s tem %d anos! \n", nome, idade);
				j++;
				System.out.printf("A quantidade de alunos acima 20 anos é: %d! \n", j);
			} else {
				System.err.println("Idade inválida!");
			}
		}
		input.close();
	}
}
