import java.text.DecimalFormat;
import java.util.Scanner;
/*
 O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma 
pessoa está no peso ideal. O IMC é determinado pela divisão da massa do indivíduo pelo 
quadrado de sua altura, onde a massa está em quilogramas e a altura está em metros, de 
acordo com a fórmula:
IMC = Massa / Altura²
Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, de acordo 
com a seguinte tabela:
< 18.5 Magreza
18.5 – 24.9 Saudável
25.0 – 29.9 Sobrepeso
30.0 – 34.9 Obesidade Grau I
35.0 – 39.9 Obesidade Grau II (severa)
> 40.0 Obesidade Grau III (morbida)
 */
public class ExSelec015 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat dF = new DecimalFormat("0.00");
		
		//entrada usuário
		System.out.println("Digite sua altura: ");
		double altura = input.nextDouble();
		System.out.println("Digite sua massa: ");
		double massa = input.nextDouble();
		input.close();
		
		//processamento
		double imc =  massa / Math.pow(altura, 2);
		
		if (imc < 18.5) {
			System.out.print("Seu IMC é: " + dF.format(imc) + "\n considerado Magreza!");
		} else if (imc >= 18.5 && imc < 24.9) {
			System.out.print("Seu IMC é: " + dF.format(imc) + "\n considerado Saudável!");
		} else if (imc >= 25 && imc < 29.9) {
			System.out.print("Seu IMC é: " + dF.format(imc) + "\n considerado Sobrepeso!");
		} else if (imc >= 30 && imc < 34.9) {
			System.out.print("Seu IMC é: " + dF.format(imc) + "\n considerado Obesidade Grau I!");
		} else if (imc >= 35 && imc < 39.9) {
			System.out.print("Seu IMC é: " + dF.format(imc) + "\n considerado Obesidade Grau II! (severa)");
		} else {
			System.out.print("Seu IMC é: " + dF.format(imc) + "\n considerado Obesidade Grau III (mórbida)!");
		}
	}
}
