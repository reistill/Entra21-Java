import java.util.Scanner;
/*Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante ele está 
localizado no plano cartesiano
*/
public class ExSelec007 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//entrada usuário
		System.out.println("Digite o valor de x no plano cartesiano: ");
		double x = input.nextDouble();
		System.out.println("Digite o valor de y no plano cartesiano: ");
		double y = input.nextDouble();
		input.close();
		//processamento
		if (x >= 0 && y >=0) {
			System.out.println("Primeiro quadrante!");
		} else if (x <= 0 && y >=0) {
			System.out.println("Segundo quadrante!");
		} else if (x <= 0 && y <=0) {
			System.out.println("Terceiro quadrante!");
		} else {
			System.out.println("Quarto quadrante!");
		}
	}
}
