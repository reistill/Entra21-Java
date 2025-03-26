import java.util.Scanner;

public class ExSelec003 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String orignome = "Joel";
		//entrada de usuário
		System.out.println("Digite um nome: ");
		String nome = input.next();
		input.close();
		//procesamento
		if (nome.equalsIgnoreCase(orignome)) {
			System.out.println("Parabéns, você acertou o nome!!");
		} else {
			System.out.println("Você errou!! DICA (começa com J!)");
		}
	}
}