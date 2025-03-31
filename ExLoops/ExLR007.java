import java.util.Scanner;
/*
Escreva um algoritmo que leia o número de inscrição e a altura de um atleta e informe: 
• O número de inscrição e a altura do atleta mais alto; 
• O número de inscrição e a altura do atleta mais baixo; 
• A altura média do grupo de atletas.
• A quantidade de atletas cadastrados
A leitura deve ser finalizada ao digitar 0 para o número de inscrição.
*/
public class ExLR007 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//variáveis
		double altura = 0;
		int i = 1;
		double atletaBaixo = Double.MAX_VALUE;
		double atletaAlto = Double.MIN_VALUE;
		String inscrAlto = "";
		String inscrBaixo = "";
		
		String inscri = "1";
		// inserir enquanto iscri != 0 na condição do While
		// para fazer isso precima criar os inputs fora
		while (true) {
			//perguntando inscrições
			System.out.printf("Digite o número de inscrição do %d° Atleta: ", i);
			inscri = input.next();
			
			//validando
			if (inscri.equals("0")) {
				System.err.println("Você escolheu parar o código!");
				input.close();
				//saída
				System.out.println("Aqui está a média de alturas dos Atletas: " + altura / (i - 1) + " metros!");
				System.out.println("A quantidade de atletas cadastrado foi: " + (i-1));
				System.out.printf("O atleta mais alto é o de inscrição: %s e Altura: %f metros\n", inscrAlto, atletaAlto);
				System.out.printf("O atleta mais baixo é o de inscrição: %s e Altura: %f metros", inscrBaixo, atletaBaixo);
				break;
			} else {
				//perguntando alturas
				System.out.printf("Digite a altura do %d° Atleta: ", i);
				double pAltura = input.nextDouble();
				System.out.printf("%d° atleta de inscrição: %s e Altura: %f metros! \n", i, inscri, pAltura);
				
				//encontrar o atleta alto
				if (pAltura > atletaBaixo) {
					atletaAlto = pAltura;
					inscrAlto = inscri;
				} else if (pAltura < atletaBaixo) {
					atletaBaixo = pAltura;
					inscrBaixo = inscri;
				}
				
				altura += pAltura;
				i++;
			}
		}
	}
}
