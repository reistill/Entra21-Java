/*
Uma grande loja de departamentos paga aos vendedores um salário variável com base 
nas vendas efetuadas durante o mês, que é igual a 17% de comissão sobre o preço de 
cada produto vendido. Cada vendedor, em um determinado mês, vende n reais em 
produtos.
Deseja-se obter um relatório com: nome, total de vendas (em R$) e salário base de cada 
vendedor. Descreva um algoritmo que gere o relatório desejado.
Para prosseguir com a entrada de um novo vendedor o algoritmo deve apresentar a 
seguinte mensagem: “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)”.
*/

import java.util.Scanner;

public class ExAva002 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Deseja inserir os dados de um vendedor? s (SIM) / n (NÃO): ");
		char opcao = input.next().charAt(0);
		
		double comissao = 0.17;
		
		while (opcao == 's') {
			
			System.out.println("Digite o nome do vendedor: ");
			String nome = input.next();
			
			System.out.println("Digite o salário base do " + nome + ":");
			double salarioBase = input.nextDouble();
			
			System.out.println("Digite quantos reais " + nome + " vendeu no mês: ");
			double totalVenda = input.nextDouble();
		
			double salarioFinal = salarioBase + (totalVenda * comissao);
			
			System.out.printf("O Vendedor %s vendeu: %f R$ em produtos! Seu salário é: %f R$! \n", nome, totalVenda, salarioFinal);
			
			System.out.println("Deseja inserir os dados de mais vendedores? s (SIM) / n (NÃO): ");
			char opcaoWhile = input.next().charAt(0);
			
			//parar o código while
			if (opcaoWhile == 'n') {
				System.out.println("Você escolheu parar o código!");
				break;
			} 
		}
		
		input.close();
	}
}
