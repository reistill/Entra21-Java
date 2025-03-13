import java.text.DecimalFormat;
import java.util.Scanner;

//Escreva um programa que leia o número de um funcionário, seu nome, sua quantidade de 
//horas trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário.
//A seguir, mostre o número, nome e o salário do funcionário, com duas casas decimais
public class ExIntro004 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat dF = new DecimalFormat("0.00");
		//entrada do usuário
		System.out.println("Digite o seu cpf na empresa: ");
		String numero = input.next();
		System.out.println("Digite o seu primeiro nome: ");
		String nome = input.next();
		System.out.println("Digite quantas horas você trabalha: ");
		double horas = input.nextInt();
		System.out.println("Digite o valor da sua hora trabalhada: ");
		double valorHora = input.nextDouble();
		input.close();
		//processamento do sistema
		double salario = (horas * valorHora);
		//saída do sistema
		System.out.printf("O funcionário número: %s, de nome: %s e salário: " + dF.format(salario) + "!", numero, nome);
	}
}
