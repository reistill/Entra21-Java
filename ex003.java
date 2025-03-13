import java.util.Scanner;

public class ex003 {
	public static void main(String[] args) {
		//criando variavel input com a função de receber entrada do teclado
		Scanner input = new Scanner(System.in);
		
		//entrada do usuário
		System.out.println("Insira seu primeiro nome: ");
		String nome = input.next();
		System.out.println("Insira o seu sobrenome: ");
		String sobrenome = input.next();
		//fechando o input
		input.close();
		//saída
		System.out.println("Seu nome é: " + nome + " " + sobrenome + "!");
		System.out.printf("Seu nome é: %s %s!", nome, sobrenome);
	}
}
