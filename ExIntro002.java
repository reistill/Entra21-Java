import java.util.Scanner;

//Calcule a área de um círculo a partir do valor do raio
public class ExIntro002 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//entrada do usuário
		System.out.println("Digite o raio do seu círculo: ");
		double raio = input.nextDouble();
		input.close();
		//processamento do sistema
		double areaCirculo = 3.14 * Math.pow(raio, 2);
		//saída do sistema
		System.out.printf("A área do seu círculo de raio %f é: %f!", raio, areaCirculo);
	}
}
