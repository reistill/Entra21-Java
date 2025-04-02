/*
Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça cada um 
respondeu um questionário com 5 perguntas:
- Gosta de música sertaneja?
- Gosta de futebol?
- Gosta de seriados?
- Gosta de redes sociais?
- Gosta da Oktoberfest?
A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice de afinidade é 
medido da seguinte maneira:
- se ambos deram a mesma resposta soma-se 3 pontos ao índice;
- se um respondeu IND e o outro SIM ou NÃO soma-se 1;
- se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as respostas 
da moça. Por fim, escreva a afinidade considerando os seguintes intervalos:
| Afinidade | Mensagem |
|-----------|-----------------------------------|
| 15 | “Casem! |
| 10 a 14 | “Vocês têm muita coisa em comum!” |
| 5 a 9 | “Talvez não dê certo :(” |
| 0 a 4 | “Vale um encontro.” |
| -1 a -9 | “Melhor não perder tempo” |
| -10 | “Vocês se odeiam!” |
*/

import java.util.Scanner;

public class ExVM010 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//vetores
		String rapaz[];
		String moca[];
		
		//variável
		int indice = 0;
		
		//entrada de usuário
		for (int i = 0; i < 2; i++) {
			
			System.out.println("Você gosta de música sertaneja?");
			String resposta1 = input.next();
			
			System.out.println("Você gosta de futebol?");
			String resposta2 = input.next();
		
			System.out.println("Você gosta de seriados?");
			String resposta3 = input.next();
		
			System.out.println("Você gosta de redes sociais?");
			String resposta4 = input.next();
		
			System.out.println("Você gosta de Oktoberfest?");
			String resposta5 = input.next();
		}
		
		input.close();
	}
}
