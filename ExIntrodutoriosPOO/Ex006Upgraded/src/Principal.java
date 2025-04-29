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
		
		//objeto
		Mercado unidade1 = new Mercado();
		
		//instânciando objeto
		unidade1.nome = "Blumenau";
		unidade1.precoMaca = 2.50;
		unidade1.macaPorAno = 4000;
		unidade1.precoLaran = 3.00;
		unidade1.laranPorAno = 3500;
		
		//objeto2
		Mercado unidade2 = new Mercado();
		
		//instânciando objeto2
		unidade2.nome = "Joinville";
		unidade2.precoMaca = 2.80;
		unidade2.macaPorAno = 6000;
		unidade2.precoLaran = 3.50;
		unidade2.laranPorAno = 5500;
		
		//objeto3
		Mercado unidade3 = new Mercado();
		
		//instânciando objeto3
		unidade3.nome = "Florianópolis";
		unidade3.precoMaca = 3.50;
		unidade3.macaPorAno = 8000;
		unidade3.precoLaran = 3.80;
		unidade3.laranPorAno = 6500;
		
		Mercado vetor[] = {unidade1, unidade2, unidade3};
		
		//variáveis
		double maiorReceita = Double.MIN_VALUE;
		double menorReceita = Double.MAX_VALUE;
		
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
			
		}
		
		
		//maior receita maças
		
		/* Percorre o vetor e exibe os objetos 
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.println("\n" + vetor[i].nome + "\nPreço Laranja:" + vetor[i].precoLaran +"\nLaranjas vendidas por ano:" + vetor[i].laranPorAno + 
					"\nPreço Maça:" + vetor[i].precoMaca + "\nMaças vendidas por ano:" + vetor[i].macaPorAno);
		}
		*/
		
	}	
}
