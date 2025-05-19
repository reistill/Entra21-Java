/*
Em um sistema de uma floricultura deve se guardar o nome da flor, o preço, o nome do cliente 
que comprou a flor e um boolean que determina se a flor é para presente ou não
Descubra:
a) Qual a flor mais cara?
b) Se a loja teve uma receita maior vendendo flores para presente ou não
*/

import java.util.ArrayList;
import java.util.List;

public class Floricultura {
	List<Flor> listaFlor;
	
	public Floricultura() {
		listaFlor = new ArrayList<Flor>();
	}
	
	public void adicionarFlor(Flor flor) {
		listaFlor.add(flor);
	}
	
	public Flor florMaisCara() {
		Flor florMaisCara = null;
		double maisCara = 0;
		
		for(Flor flor : listaFlor) {
			if (flor.getPreco() > maisCara ) {
				maisCara = flor.getPreco();
				florMaisCara = flor;
			}
		}
		return florMaisCara;
	}
	
	public String maiorReceita() {
		double receitaPresente = 0;
		double receitaFlorPropria = 0;
		
		//somas as receitas
		for(Flor flor : listaFlor) {
			if (flor.isPresente()) {
				receitaPresente += flor.getPreco();
			} else {
				receitaFlorPropria += flor.getPreco();
			}
		}
		
		if (receitaPresente > receitaFlorPropria) {
			return "A floricultura teve uma receita maior em flores de presente, com " + receitaPresente + "R$" ;
		}
		return "A floricultura teve uma receita maior em flores próprias, com " + receitaFlorPropria + "R$" ;
	}
}
