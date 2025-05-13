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

public class Produto {
	private String nome, descricao;
	private double preco, volume, peso;
	private int qntdEstoque;
	
	public Produto(String nome, String descricao, double preco, double volume, double peso, int qntdEstoque) {
		setNome(nome);
		setDescricao(descricao);
		setPreco(preco);
		setVolume(volume);
		setPeso(peso);
		setQntdEstoque(qntdEstoque);
	}
	
	public void adicionarEstoque(Double qntd) {
		if (qntd <=0) {
			throw new IllegalArgumentException("Não é possível adicionar!");
		}
		qntdEstoque += qntd; 
	}
	
	public void venderProdutoPromocao (double desconto, int qntd) {
		if (qntd > qntdEstoque) {
			throw new IllegalArgumentException("Quantidade exigida maior que atual do estoque!");
		}
		preco -= ( preco * (desconto / 100) );
		qntdEstoque -= qntd;
	}
	
	public void venderProduto(int qntd) {
		if (qntd > qntdEstoque) {
			throw new IllegalArgumentException("Quantidade exigida maior que atual do estoque!");
		}
		qntdEstoque -= qntd;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.isBlank() || nome == null) {
			throw new IllegalArgumentException("O nome não pode ser vazio!");
		}
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if (descricao.isBlank() || descricao == null) {
			throw new IllegalArgumentException("A descrição não pode ser vazia!");
		}
		this.descricao = descricao;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if (preco <= 0) {
			throw new IllegalArgumentException("O preço não pode ser menor que 0!"); 
		}
		this.preco = preco;
	}
	
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		if (volume <= 0) {
			throw new IllegalArgumentException("O volume não pode ser menor que 0!"); 
		}
		this.volume = volume;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if (peso <= 0) {
			throw new IllegalArgumentException("O peso não pode ser menor que 0!"); 
		}
		this.peso = peso;
	}
	
	public int getQntdEstoque() {
		return qntdEstoque;
	}
	public void setQntdEstoque(int qntdEstoque) {
		if (preco < 0) {
			throw new IllegalArgumentException("A quantidade em estoque não pode ser menor que 0!"); 
		}
		this.qntdEstoque = qntdEstoque;
	}

	@Override
	public String toString() {
		return "\nNome:" + nome + "\nDescricao: " + descricao + "\nPreco: " + preco + " R$\nVolume: " + volume
				+ " m³\nPeso: " + peso + " Kg\nQuantidade em estoque: " + qntdEstoque + " unidades\n";
	}
}
