import java.text.DecimalFormat;
import java.util.Scanner;
//Uma pessoa foi até uma casa de câmbio trocar dólares por reais.
//Para isto ela entregou um valor em dólares para o atendente.
//Calcule quantos reais o atendente deve devolver para a pessoa.

public class ExIntro007 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat dF = new DecimalFormat("0.00");
		//entrada usuário
		System.out.println("Digite quantos dólares: ");
		double dolares = input.nextDouble();
		input.close();
		//processamento
		double cotacao = 5.81;
		double cambio = dolares * cotacao;
		//saída
		System.out.printf("O atendente deve devolver: " + dF.format(cambio) + "R$ para o cliente!");
	}
}
