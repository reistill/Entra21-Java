/*
a) Quem teve a maior receita vendendo maçãs?
b) Quem teve a maior receita vendendo laranjas?
c) Qual das lojas teve a maior receita?
d) Qual das lojas teve a menor receita?
e) Qual das lojas ficou no "meio" em termos de receita?
f) Juntando as 3 lojas, a franquia teve uma receita maior vendendo maçãs ou laranjas?
*/

public class Mercado {
	String nome;
	int macaPorAno;
	double precoMaca;
	int laranPorAno;
	double precoLaran;
	
	public Mercado(String nome, int macaPorAno, double precoMaca, int laranPorAno, double precoLaran) {
		this.nome = nome;
		this.macaPorAno = macaPorAno;
		this.precoMaca = precoMaca;
		this.laranPorAno = laranPorAno;
		this.precoLaran = precoLaran;
	}

	public double receitaMaca() {
		return macaPorAno * precoMaca;
	}
	
	public double receitaLaranja() {
		return laranPorAno * precoLaran;
	}
	
	public double receitaTotal() {
		return receitaMaca() + receitaLaranja();
	}
	
}