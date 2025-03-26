import java.util.Scanner;
/*
Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre 
homens e mulheres sempre serão diferentes).
Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o 
produto das idades do homem mais novo com a mulher mais velha.
 */

public class ExSelec013 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//entrada de usuário
		System.out.println("Digite sua idade: ");
		int idadeH1 = input.nextInt();
		System.out.println("Digite outra idade: ");
		int idadeH2 = input.nextInt();
		System.out.println("Digite mais idade: ");
		int idadeM1 = input.nextInt();
		System.out.println("Digite mais uma idade: ");
		int idadeM2 = input.nextInt();
		input.close();
		
		
		//processamento
		if (idadeH1 == idadeM1 || idadeH1 == idadeM2 || idadeH2 == idadeM1 || idadeH2 == idadeM2) {
			System.out.println("As idades precisam ser difentes entre os sexos.");
		}
		
		//variáveis
		int hVelho, hNovo, mNova, mVelha;
		
		//idade homem 
		if (idadeH1 < idadeH2) {
			 hVelho = idadeH2;
			 hNovo = idadeH1;
		} else {
			 hVelho = idadeH1;
			 hNovo = idadeH2;
		}
		
		//idade mulher
		if (idadeM1 < idadeM2) {
			 mNova = idadeM1;
			 mVelha = idadeM2;
		} else {
			 mNova = idadeM2;
			 mVelha = idadeM1;
		}
		
		int soma = hVelho + mNova;
		int produto = hNovo * mVelha;
		System.out.printf("A soma é: %d \n", soma);
		System.out.printf("O produto é: %d", produto);
	}   
}
