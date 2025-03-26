import java.util.Scanner;
/*
Leia uma data (dia, mês e ano) e determine se ela é válida.
Lembre dos anos bissextos!
Faça com que o programe informe que a data é inválida assim que o usuário informar um valor 
inexistente.
Por exemplo, assim que o usuário informar o dia 50 o programa já deve parar e não deve 
receber o mês e ano
 */
public class ExSelec017 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//entrada usuário
		System.out.println("Digite o ano: ");
		int ano = input.nextInt();
		System.out.println("Digite o mês: ");
		int mes= input.nextInt();
		System.out.println("Digite o dia: ");
		int dia = input.nextInt();
		input.close();
		
		//processamento
		
		//variáveis
		boolean bissexto;
		int diasfev;
		
		//ano bissexto
		if (ano % 4 == 0 || ano % 400 == 0) {
			bissexto = true;
			System.out.println("O ano é bissexto!");
		} else {
			bissexto = false;
		}
		
		if (mes > 12 || mes < 1) {
			System.err.print("Não existe mês maior que 12, nem menor que 1!");
		} else if (mes >= 1 && mes <=12) {
			if (dia < 1 || dia > 31) {
				System.err.print("Não existem dias maiores que 31, nem menores que 1!");
			} else if (dia >= 1 && dia <= 31 && mes == 2 && bissexto == true) {
				diasfev = 29;
				if (dia > diasfev) {
					System.err.print("Não existem dias maiores que 29 no mês de fevereiro em ano bissexto!");
				} else {
					System.out.printf("Dia %d / Mês %d / Ano %d", dia, mes, ano);
				}
			} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30){
				System.err.print("Não existem dias menores que 1 nem maiores que 30 nesse mês!");
			} else {
				System.out.printf("Dia %d / Mês %d / Ano %d", dia, mes, ano);
			}
		}
	}
}
