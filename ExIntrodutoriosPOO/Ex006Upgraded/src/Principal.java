/*
a) Quem teve a maior receita vendendo maçãs?
b) Quem teve a maior receita vendendo laranjas?
c) Qual das lojas teve a maior receita?
d) Qual das lojas teve a menor receita?
e) Qual das lojas ficou no "meio" em termos de receita?
f) Juntando as 3 lojas, a franquia teve uma receita maior vendendo maçãs ou laranjas?
*/

public class Principal {
	
	public static void main(String[] args) {
		
		//objeto + instânciando
		Mercado unidade1 = new Mercado("Blumenau", 4000, 2.50, 3500, 3);

		
		//objeto2 + instânciando
		Mercado unidade2 = new Mercado("Joinville", 6000, 2.80, 5500, 3.50);

		//objeto3 + instânciando
		Mercado unidade3 = new Mercado("Florianópolis", 8000, 3.50, 6500, 3.80);
		
		Mercado vetor[] = {unidade1, unidade2, unidade3};
		
		//variáveis
		double maiorReceita = Double.MIN_VALUE;
		double menorReceita = Double.MAX_VALUE;
		double maiorReceitaLaranja = Double.MIN_VALUE;
		double maiorReceitaMaca = Double.MIN_VALUE;
		double receitaTotalLaranja = 0;
		double receitaTotalMaca = 0;
		
		
		//Percorre o vetor e exibe os objetos 
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("\n" + vetor[i].nome + "\nPreço Laranja:" + vetor[i].precoLaran +"\nLaranjas vendidas por ano:" + vetor[i].laranPorAno + 
					"\nPreço Maça:" + vetor[i].precoMaca + "\nMaças vendidas por ano:" + vetor[i].macaPorAno+"\n");
		}
		
		//encontrar maior receita
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].receitaTotal() > maiorReceita) {
				maiorReceita = vetor[i].receitaTotal();
				if (i == 2) {
					System.out.println("O mercado de " + vetor[i].nome + " tem a maior receita, sendo: " + vetor[i].receitaTotal() + " R$");
				}
			}
		}
		
		//encontrar menor receita
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].receitaTotal() < menorReceita) {
				menorReceita = vetor[i].receitaTotal();
				System.out.println("O mercado de " + vetor[i].nome + " tem a menor receita, sendo: " + vetor[i].receitaTotal() + " R$");
			}
		}
		
		//encontrar receita do meio
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].receitaTotal() != menorReceita && vetor[i].receitaTotal() != maiorReceita) {
				System.out.println("O mercado do meio é: " + vetor[i].nome + " com uma receita de: " + vetor[i].receitaTotal() + " R$");
			}
		}
		
		//maior receita laranjas
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].receitaLaranja() > maiorReceitaLaranja) {
				maiorReceitaLaranja = vetor[i].receitaLaranja();
				if (i == 2) {
					System.out.println("O mercado de " + vetor[i].nome + " tem a maior receita sobre Laranjas, sendo: " + vetor[i].receitaLaranja() + " R$");
				}
			}
		}
		
		
		//maior receita maças
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].receitaMaca() > maiorReceitaMaca) {
				maiorReceitaMaca = vetor[i].receitaMaca();
				if (i == 2) {
					System.out.println("O mercado de " + vetor[i].nome + " tem a maior receita sobre Maças, sendo: " + vetor[i].receitaMaca() + " R$");
				}
			}
		}
		
		//quem vendeus mais 3 franquias somadas, laranja ou maça
		for (int i = 0; i < vetor.length; i++) {
			receitaTotalLaranja += vetor[i].receitaLaranja();
			receitaTotalMaca += vetor[i].receitaMaca();
		}
		
		System.out.println("O total de receita sobre Maças: " + receitaTotalMaca + " R$");
		System.out.println("O total de receita sobre Laranjas: " + receitaTotalLaranja + " R$");
		
	}	
}
