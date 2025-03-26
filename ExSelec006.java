import java.util.Scanner;

/*Dada a idade de um nadador descreva um algoritmo que o classifique em uma das seguintes 
categorias:
pré-mirim 5 - 7 anos
mirim 8 - 10 anos
infantil 11 - 13 anos
infanto-juvenil 14 - 17 anos
juvenil 18 - 20 anos
adulto maiores de 21 anos
*/
public class ExSelec006 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//entrada de usuário
		System.out.println("Digite a idade de um nadador:");
		int idade = input.nextInt();
		input.close();
		//processamento
		if (idade >= 5 && idade <=7) {
			System.out.println("Pré-mirim");
		} else if (idade >= 8 && idade <=10) {
			System.out.println("Mirim");
		} else if (idade >= 11 && idade <=13) {
			System.out.println("Infantil");
		} else if (idade >= 14 && idade <=17) {
			System.out.println("Infanto-Juvenil");
		} else if (idade >= 18 && idade <=21) {
			System.out.println("Juvenil");
		} else {
			System.out.println("Adulto");
		}
	}
}
