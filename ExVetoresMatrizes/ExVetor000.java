import java.util.Scanner;

public class ExVM000 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//entrada de usuário
		System.out.println("Digite a quantidade de familiares: ");
		int familiares = input.nextInt();
		
		//vetor recebe o número de familiares
		int idades[] = new int[familiares];
		
		//
		for (int i = 0; i < familiares; i++) {
			System.out.printf("Digite as idades dos seus %d familiares:", familiares);
			idades[i] = input.nextInt();
			System.out.printf("A idade do %d° familiar  é: %d \n", i+1, idades[i]);
		}
		
		input.close();
	}
}
