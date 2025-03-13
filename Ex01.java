import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//atribuindo a variável input o método Scanner
		Scanner input = new Scanner(System.in);
		//entrada de dados
		System.out.println("Digite a largura do seu retângulo: ");
		double largura = input.nextDouble();
		System.out.println("Digite a altura do seu retângulo: ");
		double altura = input.nextDouble();
		//fechar o scanner do teclado
		input.close();
		//processamento de dados
		double area = largura * altura;
		double perimetro = 2 * (largura + altura);
		//saída de dados
		System.out.printf("Essa é a área: %f! \n", area);
		System.out.printf("Esse é o perímetro: %f!", perimetro);
	}
}
