/*
Crie um sistema para uma loja de materiais de construção
Os objetos terão os atributos:
Nome, descrição, preço, volume (tamanho), peso e quantidade em estoque
Crie métodos para:

Adicionar mais unidades da peça ao estoque

Vender um produto, podendo ser vendido até o mesmo número de peças que tem no estoque

Colocar o produto em promoção, o parâmetro do método deve ser a porcentagem do desconto
Descubra:

a) Qual o material mais caro
b) Qual o material mais caro por metro cúbico
c) Qual o material mais denso
d) Qual o material que mais ocupa espaço no estoque
*/

import java.util.ArrayList;
import java.util.List;

public class MaterialConstrucao {
	List<Produto> listaProdutos;
	
	public MaterialConstrucao () {
		listaProdutos = new ArrayList<Produto>();
	}
	
	public void adicionarProduto(Produto produto) {
		listaProdutos.add(produto);
	}

	public Produto materialMaisCaro () {
		double maiorPreco = Double.MIN_VALUE;
		Produto produtoMaisCaro = null;
		
		for (Produto material : listaProdutos) {
			if (material.getPreco() > maiorPreco) {
				maiorPreco = material.getPreco();
				produtoMaisCaro = material;
			}
		}
		return produtoMaisCaro;
	}
	
	public Produto materialMaisCaroPorMetroCubico () {
		double maiorPreco = Double.MIN_VALUE;
		Produto produtoMaisCaro = null;
		
		for (Produto material : listaProdutos) {
			if (material.getPreco() / material.getVolume() > maiorPreco) {
				maiorPreco = ( material.getPreco() / material.getVolume() );
				produtoMaisCaro = material;
			}
		}
		return produtoMaisCaro;
	}
	
	public Produto materialMaisDenso () {
		double maisDenso = Double.MIN_VALUE;
		Produto produtoMaisDenso = null;

		for (Produto material : listaProdutos) {
			if (material.getPeso() / material.getVolume() > maisDenso) {
				maisDenso = ( material.getPeso() / material.getVolume() );
				produtoMaisDenso = material;
			}
		}
		return produtoMaisDenso;
	}
	
	public Produto materialMaisOcupaEspaco () {
		double maisEspacoso = Double.MIN_VALUE;
		Produto produtoMaisEspacoso = null;

		for (Produto material : listaProdutos) {
			if (material.getQntdEstoque() *  material.getVolume() > maisEspacoso) {
				maisEspacoso = ( material.getQntdEstoque() *  material.getVolume() );
				produtoMaisEspacoso = material;
			}
		}
		return produtoMaisEspacoso;
	}
	
	@Override
	public String toString() {
		return "Material de Construção \nLista de Produtos! \n" + listaProdutos + "\n";
	}
}
