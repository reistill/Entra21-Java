/*
Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes.
Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino), uma 
nota para o cinema (zero até dez, valor inteiro) e a idade.
Baseado nisto faça um programa que informe:
- qual a nota média recebida pelo cinema;
- qual a nota média atribuída pelos homens;
- qual a nota atribuída pela mulher mais jovem;
- quantas das mulheres com mais de 50 anos deram nota superior à média recebida pelo 
cinema.
Não utilize vetores!!
*/

import java.util.Scanner;

public class ExMatriz005 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		
		//variáveis
		int soma = 0;
		int somaM = 0;
		int m = 0;
		int maisNova = Integer.MAX_VALUE;
		int notaMaisNova = 0;
		int qntdNotasFemMais50 = 0;
		
		//adicionando os valores nos respectivos índices e realizando algumas operações
		for (int i = 0; i < matriz.length; i++) {
			 
			System.out.println("Digite o seu sexo: ");
			int sexo = input.nextInt();
			
			matriz[i][0] = sexo;
			
			System.out.println("Avalie o cinema(0 até 10): ");
			int nota = input.nextInt();
			
			//adicionando as notas para soma
			soma += nota;
				
			//verificas se é homem e adiciona as notas na somaM
			if (sexo == 1) {
				somaM += nota;
				m += 1;
			}
				
			matriz[i][1] = nota;
					
			System.out.println("Digite a sua idade: ");
			int idade = input.nextInt();
			
			matriz[i][2] = idade;
			
			//verificas se é mulher e se ela é a mais jovem, as notas recebe notaMaisNova
			if (sexo == 2 && idade < maisNova) {
				notaMaisNova = nota;
				maisNova = idade;
			}
		}
		
		//percorre a matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				//verifica se é mulher, se tem mais de 50 anos
				if (matriz[i][0] == 2 && matriz[i][2] > 50 && matriz[i][1] > (soma/matriz.length) ) {
					qntdNotasFemMais50 += 1;
				}
			}
		}
		
		input.close();
		System.out.println();
		
		//saída 
		System.out.printf("A média de notas do cinema é: %d! \n", (soma/matriz.length) );
		System.out.printf("A média de notas masculinas do cinema é: %d! \n", (somaM/m) );
		System.out.printf("A mulher mais jovem tem: %d anos! e sua nota foi: %d! \n", maisNova, notaMaisNova);
		System.out.printf("A quantidade de mulheres com mais de 50 anos que avaliaram o cinema acima da média: %d!", qntdNotasFemMais50);

	}
}
