import java.util.Scanner;

/*
Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos 
números ímpares entre 1 e 100.
 */
public class ExLR002 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int somaI = 0;
		int somaP = 0;
		
		for (int i = 1; i <= 100; i++ ) {
			if (i % 2 == 0) {
				somaP += i;
				System.out.printf("A soma dos pares é: %d \n", somaP);
			} else {
				somaI += i;
				System.out.printf("A soma dos ímpares é: %d \n", somaI);
			}
		}
	input.close();
	}
}
