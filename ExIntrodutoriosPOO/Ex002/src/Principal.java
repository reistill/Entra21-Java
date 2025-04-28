/*Crie 3 objetos da classe Mercado chamados:
unidadeDeBlumenau
unidadeDeJoinville
unidadeDeFlorianopolis
Atribua valores a esses objetos
*/

public class Principal {
	
	public static void main(String[] args) {
		
		//objeto
		Mercado unidade1 = new Mercado();
		
		//instânciando objeto
		unidade1.nome = "Blumenau";
		unidade1.precoMaca = 2.50;
		unidade1.macaPorAno = 4000;
		unidade1.precolaran = 3.00;
		unidade1.laranPorAno = 3500;
		
		//objeto2
		Mercado unidade2 = new Mercado();
		
		//instânciando objeto2
		unidade2.nome = "Joinville";
		unidade2.precoMaca = 2.80;
		unidade2.macaPorAno = 6000;
		unidade2.precolaran = 3.50;
		unidade2.laranPorAno = 5500;
		
		//objeto3
		Mercado unidade3 = new Mercado();
		
		//instânciando objeto3
		unidade3.nome = "Florianópolis";
		unidade3.precoMaca = 3.50;
		unidade3.macaPorAno = 8000;
		unidade3.precolaran = 3.80;
		unidade3.laranPorAno = 6500;
	}
	
}
