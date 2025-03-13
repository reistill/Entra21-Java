import java.text.DecimalFormat;
import java.util.Scanner;

//Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas 
//efetuadas por ele no mês (em valor).
//Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o 
//total a receber no final do mês, com duas casas decimais.
public class ExIntro006 {
	public static void main(String[] args) {
		//métodos da classe
		Scanner input = new Scanner(System.in);
		DecimalFormat dF = new DecimalFormat("0.00");
		//entrada usuário
		System.out.println("Digite o nome do vendedor: ");
		String nome = input.next();
		System.out.println("Digite o salário fixo: ");
		double salarioFixo = input.nextDouble();
		System.out.println("Digite o valor mensal de vendas: ");
		double totalVendas = input.nextDouble();
		input.close();
		//processamento
		double salarioTotal = salarioFixo + totalVendas * (15.00/100.00);
		//saída
		System.out.printf("O total a receber do vendedor %s, é: " + dF.format(salarioTotal) + "!", nome);
	}
}
