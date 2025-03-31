import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//entrada de dados
		System.out.println("Digite o seu primeiro nome: ");
		String nome = input.next();
		System.out.println("Digite seus sobrenome: ");
		String sobrenome = input.next();
		input.close();
		//saída de dados
		//jeito usando concatenação
		System.out.println("Seu nome é: " + nome + " " + sobrenome + "!");
		//jeito usando %
		System.out.printf("Seu nome é: %s %s!", nome, sobrenome);
	}
}
