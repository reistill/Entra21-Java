import java.util.Scanner;
/*Faça um algoritmo que o usuário entre com um char.
Determine se esse char é uma consoante ou vogal. 
*/

public class ExSelec005 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//entrada de usuário
		System.out.println("Digite uma letra do alfabeto (Maiúscula):");
		char letra = input.next().charAt(0);
		input.close();
		//processamento
		if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
			System.out.printf("Sua letra é %c e é uma vogal!", letra);
		} else {
			System.out.printf("Sua letra é %c e é uma consoante!", letra);
		} 
	}		
}
