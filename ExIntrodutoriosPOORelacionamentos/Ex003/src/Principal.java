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

public class Principal {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("martelo", "martelo com cabo de madeira", 27.5, 0.15, 1.5, 12);
		p1.adicionarEstoque(8.0);
		
		Produto p2 = new Produto("serrote", "serrote com cabo de madeira, dentes afiado", 31, 0.30, 1.0, 8);
		
		Produto p3 = new Produto("cimento", "cimento secagem rápida, alta aderência", 22.22, 1, 25, 100);
		p3.venderProdutoPromocao(10, 25);
		
		Produto p4 = new Produto("carrinho de mão", "carrinho de aço inoxidável", 450.7, 3.5, 5, 20);
		p4.venderProduto(2);
		
		MaterialConstrucao m1 = new MaterialConstrucao();
		
		m1.adicionarProduto(p1);
		m1.adicionarProduto(p2);
		m1.adicionarProduto(p3);
		m1.adicionarProduto(p4);
		
		System.out.println("Produto mais caro! " + m1.materialMaisCaro()); 
		System.out.println("Produto mais caro por metro cúbico! " + m1.materialMaisCaroPorMetroCubico());
		System.out.println("Produto mais Denso! " + m1.materialMaisDenso());
		System.out.println("Produto que mais ocupa espaço! " + m1.materialMaisOcupaEspaco());
	}
}