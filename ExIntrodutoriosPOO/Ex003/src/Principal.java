/*
produto1: Produto
nome = “Caderno”
descricao = “Caderno em espiral tamanho médio”
precoUnitario = 4.50
desconto = 15

produto2: Produto
nome = “Caneta ESF”
descricao = “Caneta esferográfica 5mm”
precoUnitario = 1.20
desconto = 2

produto3: Produto 
nome = “Esquadro”
descricao = “Esquadro de acrílico 20 cm”
precoUnitario = 2.35
desconto = 10
 */

public class Principal {
	public static void main(String[] args) {
		
		Produto prod1 = new Produto(); 
		prod1.nome = "Caderno";
		prod1.descri = "Caderno em espiral tamanho médio";
		prod1.precoUnidade = 4.50;
		prod1.desconto = 15;
		
		System.out.printf("Nome: %s! \nDescrição: %s \nPreço Unitário: %f \nDesconto: %d \n", prod1.nome, prod1.descri, prod1.precoUnidade, prod1.desconto);
		
		Produto prod2 = new Produto();
		prod2.nome = "Caneta ESF";
		prod2.descri = "Caneta esferográfica 5mm";
		prod2.precoUnidade = 1.20;
		prod2.desconto = 2;
		
		System.out.printf("\nNome: %s! \nDescrição: %s \nPreço Unitário: %f \nDesconto: %d \n", prod2.nome, prod2.descri, prod2.precoUnidade, prod2.desconto);
		
		Produto prod3 = new Produto();
		prod3.nome = "Esquadro";
		prod3.descri = "Esquadro de acrílico 20 cm";
		prod3.precoUnidade = 2.35;
		prod3.desconto = 10;
		
		System.out.printf("\nNome: %s! \nDescrição: %s \nPreço Unitário: %f \nDesconto: %d \n", prod3.nome, prod3.descri, prod3.precoUnidade, prod3.desconto);
	}
}
