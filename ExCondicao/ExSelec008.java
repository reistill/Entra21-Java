import java.util.Scanner;

/*Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma mensagem que 
indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS.
Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos 
demais, e apenas irmãos se todas as idades forem diferentes.
*/
public class ExSelec008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//entrada usuário
		System.out.println("Digite o ano de nascimento: ");
		int irmao1 = input.nextInt();
		System.out.println("Digite outro ano de nascimento: ");
		int irmao2 = input.nextInt();
		System.out.println("Digite mais um ano de nascimento: ");
		int irmao3 = input.nextInt();
		input.close();
		//procesamento
		if (irmao1 != irmao2 && irmao1 != irmao3 && irmao2 != irmao3) {
			System.out.println("Apenas irmãos!");
		} else if (irmao1 == irmao2 && irmao1 == irmao3) {
			System.out.println("Trigêmeos!");
		} else {
			System.out.println("Gêmeos!");
		}
	}
}
