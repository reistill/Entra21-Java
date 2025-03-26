import java.util.Scanner;

/*
A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar 
mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo 
de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o valor por 
hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso 
tenham sido trabalhadas (considere que o mês possua 4 semanas exatas
 */
public class ExSelec019 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//entrada usuário
		System.out.println("Digite o valor das suas horas trabalhadas: ");
		double valorHora = input.nextDouble();
		System.out.println("Digite quantas horas você trabalhou: ");
		double hora = input.nextDouble();
		input.close();
		//processamento
		double salario = hora * valorHora;
		
		if (hora > 160) {
			double valorExtra = valorHora + (valorHora * 0.5);
			double horaExtra = hora - 160;
			double salarioTotal = salario + (horaExtra * valorExtra);
			System.out.printf("Seu salário total é: %f", salarioTotal);
		} else {
			System.out.printf("Seu salário é: %f", salario);
		}
	}
}
