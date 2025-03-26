import java.util.Scanner;
/*
Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um algoritmo para ler as 
idades dos filhos e exibir quem é o mais velho, o irmão do meio e o caçula da família. Suponha 
que não haja empates.
 */
public class ExSelec014 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//entrada de usuário
		System.out.println("Digite a idade do Marquinho: ");
		int idadeM = input.nextInt();
		System.out.println("Digite a idade do Zezinho: ");
		int idadeZ = input.nextInt();
		System.out.println("Digite a idade da Luluzinha: ");
		int idadeL = input.nextInt();
		input.close();
		
		//processamento
		if (idadeM == idadeZ || idadeM == idadeL  || idadeZ == idadeL) {
			System.out.println("As idades precisam ser difentes entre os irmãos.");
		}
		
		//variáveis
		int velho, meio, cacula;
		String marqui = "Marquinhos";
		String zezi = "Zezinho";
		String lulu = "Luluzinha";
		
		//mais velho
		if (idadeM > idadeZ && idadeM > idadeL) {
			velho = idadeM;
			System.out.printf("O irmão mais velho é: %s com %d anos! \n", marqui, velho);
		} else if (idadeZ > idadeM && idadeZ > idadeL) {
			velho = idadeZ;
			System.out.printf("O irmão mais velho é: %s com %d anos! \n", zezi, velho);
		} else {
			velho = idadeL;
			System.out.printf("O irmão mais velho é: %s com %d anos! \n", lulu, velho);
		}
		
		//caçula
		if (idadeM < idadeZ && idadeM < idadeL) {
			cacula = idadeM;
			System.out.printf("O irmão caçula é: %s com %d anos! \n", marqui, cacula);
		} else if (idadeZ < idadeM && idadeZ < idadeL) {
			cacula = idadeZ;
			System.out.printf("O irmão caçula é: %s com %d anos! \n", zezi, cacula);
		} else {
			cacula = idadeL;
			System.out.printf("O irmão caçula é: %s com %d anos! \n", lulu, cacula);
		}
		
		//meio
		if (idadeM != velho && idadeM != cacula) {
			meio = idadeM;
			System.out.printf("O irmão do meio é: %s com %d anos! \n", marqui, meio);
		} else if (idadeZ != velho && idadeZ != cacula) {
			meio = idadeZ;
			System.out.printf("O irmão do meio é: %s com %d anos! \n", zezi, meio);
		} else {
			meio = idadeL;
			System.out.printf("O irmão do meio é: %s com %d anos! \n", lulu, meio);
		}
		
	}
}
