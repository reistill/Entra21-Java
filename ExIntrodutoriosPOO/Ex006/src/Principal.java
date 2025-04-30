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
		
		//variáveis
		double maiorReceita = Double.MIN_VALUE;
		double menorReceita = Double.MAX_VALUE;
		double maiorReceitaLaranja = Double.MIN_VALUE;
		double maiorReceitaMaca = Double.MAX_VALUE;
		double totalLaranja3Franquia = unidade1.receitaLaranja() + unidade2.receitaLaranja() + unidade3.receitaLaranja();
		double totalMaca3Franquia = unidade1.receitaMaca() + unidade2.receitaMaca() + unidade3.receitaMaca();
		
		//maior receita
		if (unidade1.receitaTotal() > unidade2.receitaTotal() && unidade1.receitaTotal() > unidade3.receitaTotal()) {
			maiorReceita = unidade1.receitaTotal();
			System.out.println("O mercado com maior receita foi a unidade de Blumenau com: " + maiorReceita + " R$ !");
		} else if (unidade2.receitaTotal() > unidade1.receitaTotal() && unidade2.receitaTotal() > unidade3.receitaTotal()) {
			maiorReceita = unidade2.receitaTotal();
			System.out.println("O mercado com maior receita foi a unidade de Joinville com: " + maiorReceita + " R$ !");
		} else {
			maiorReceita = unidade3.receitaTotal();
			System.out.println("O mercado com maior receita foi a unidade de Florianópolis com: " + maiorReceita + " R$ !");
		}
		
		//menor receita
		if (unidade1.receitaTotal() < unidade2.receitaTotal() && unidade1.receitaTotal() < unidade3.receitaTotal()) {
			menorReceita = unidade1.receitaTotal();
			System.out.println("O mercado com menor receita foi a unidade de Blumenau com: " + menorReceita + " R$ !");
		} else if (unidade2.receitaTotal() < unidade1.receitaTotal() && unidade2.receitaTotal() < unidade3.receitaTotal()) {
			menorReceita = unidade2.receitaTotal();
			System.out.println("O mercado com menor receita foi a unidade de Joinville com: " + menorReceita + " R$ !");
		} else {
			menorReceita = unidade3.receitaTotal();
			System.out.println("O mercado com menor receita foi a unidade de Florianópolis com: " + menorReceita + " R$ !");
		}
		
		//receita do "meio"
		if (unidade1.receitaTotal() != maiorReceita && unidade1.receitaTotal() != menorReceita) {
			System.out.println("O mercado entre a maior e menor receita é " + unidade1.nome + "!");
		} else if (unidade2.receitaTotal() != maiorReceita && unidade2.receitaTotal() != menorReceita) {
			System.out.println("O mercado entre a maior e menor receita é " + unidade2.nome + "!");
		} else {
			System.out.println("O mercado entre a maior e menor receita é " + unidade3.nome + "!");
		}
		
		//maior receita laranjas
		if (unidade1.receitaLaranja() > unidade2.receitaLaranja() && unidade1.receitaLaranja() > unidade3.receitaLaranja()) {
			maiorReceitaLaranja = unidade1.receitaLaranja();
			System.out.printf("O mercado de %s teve a maior receita de Laranjas com: %f R$ !", unidade1.nome, maiorReceitaLaranja);
		} else if (unidade2.receitaLaranja() > unidade1.receitaLaranja() && unidade2.receitaLaranja() > unidade3.receitaLaranja()) {
			maiorReceitaLaranja = unidade2.receitaLaranja();
			System.out.printf("O mercado de %s teve a maior receita de Laranjas com: %f R$ !", unidade2.nome, maiorReceitaLaranja);
		} else {
			maiorReceitaLaranja = unidade3.receitaLaranja();
			System.out.printf("O mercado de %s teve a maior receita de Laranjas com: %f R$ !", unidade3.nome, maiorReceitaLaranja);
		}
		
		//maior receita Maças
		if (unidade1.receitaMaca() > unidade2.receitaMaca() && unidade1.receitaMaca() > unidade3.receitaMaca()) {
			maiorReceitaMaca = unidade1.receitaMaca();
			System.out.printf("\nO mercado de %s teve a maior receita de Maças com: %f R$ !", unidade1.nome, maiorReceitaMaca);
		} else if (unidade2.receitaMaca() > unidade1.receitaMaca() && unidade2.receitaMaca() > unidade3.receitaMaca()) {
			maiorReceitaMaca = unidade2.receitaMaca();
			System.out.printf("\nO mercado de %s teve a maior receita de Maças com: %f R$ !", unidade2.nome, maiorReceitaMaca);
		} else {
			maiorReceitaMaca = unidade3.receitaMaca();
			System.out.printf("\nO mercado de %s teve a maior receita de Maças com: %f R$ !", unidade3.nome, maiorReceitaMaca);
		}
		
		//quem vendeus mais 3 franquias somadas, laranja ou maça 
		if (totalLaranja3Franquia > totalMaca3Franquia) {
			System.out.printf("\nA receita de Laranja somada das 3 Franquias é: %f R$", totalLaranja3Franquia);
		} else {
			System.out.printf("\nA receita de Maça somada das 3 Franquias é: %f R$", totalMaca3Franquia);
		}
	}
}