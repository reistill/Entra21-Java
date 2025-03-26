import java.util.Scanner;
/*
Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu 
salário. A empresa irá conceder 5% de reajuste para o funcionário que for admitido há menos 
de 12 meses. Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste. O 
seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que o funcionário foi 
admitido
 */
public class ExSelec018 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//entrada de usuário
		System.out.println("Digite o seu salário:");
		double salario = input.nextDouble();
		System.out.println("Digite há quantos meses você trabalha aqui:");
		double meses = input.nextDouble();
		input.close();
		
		//processamento
		if (meses < 12 && meses >=1) {
			double reajuste = 0.05 * salario;
			double novoSalario = salario + reajuste;
			System.out.printf("O seu novo salário é: %f! Você teve %f de aumento! Reajuste de 0.05!", novoSalario, reajuste);
		} else if (meses >= 13 && meses <=48) {
			double reajuste = 0.07 * salario;
			double novoSalario = salario + reajuste;
			System.out.printf("O seu novo salário é: %f! Você teve %f de aumento! Reajuste de 0.07!", novoSalario, reajuste);
		} else {
			System.out.println("Mês inválido!");
		}
	}
}
