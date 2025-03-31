import java.util.Scanner;

//Leia dois valores decimais (double) e calcule a média ponderada sabendo que a nota A tem 
//peso 3.5 e nota B 6.5
public class ExIntro005 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//entrada usuário
		System.out.println("Digite sua primeira nota: ");
		double nA = input.nextDouble();
		System.out.println("Digite sua segunda nota: ");
		double nB = input.nextDouble();
		input.close();
		//processo
		double mediaPon = ((nA * 3.5) + (nB * 6.5)) / (3.5 + 6.5);
		//saída
		System.out.println("A média ponderada é: " + mediaPon + "!");
	}	
}
