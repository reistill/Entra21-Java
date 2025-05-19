/*
Em um sistema de uma floricultura deve se guardar o nome da flor, o preço, o nome do cliente 
que comprou a flor e um boolean que determina se a flor é para presente ou não
*/

public class Flor {
	private String nomeFlor;
	private double preco;
	private String nomeCliente;
	private boolean presente;
	
	public Flor(String nomeFlor, double preco, String nomeCliente, boolean presente) {
		setNomeFlor(nomeFlor);
		setPreco(preco);
		setNomeCliente(nomeCliente);
		setPresente(presente);
	}
	
	public String getNomeFlor() {
		return nomeFlor;
	}

	public void setNomeFlor(String nomeFlor) {
		if (nomeFlor.isBlank() || nomeFlor == null) {
			throw new IllegalArgumentException("Nome não pode ser vazio!");
		}
		this.nomeFlor = nomeFlor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			throw new IllegalArgumentException("Preço não deve ser menor que 0!");
		}
		this.preco = preco;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		if (nomeCliente.isBlank() || nomeCliente == null) {
			throw new IllegalArgumentException("Nome não pode ser vazio!");
		}
		this.nomeCliente = nomeCliente;
	}

	public boolean isPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}

	@Override
	public String toString() {
		return "\nNome flor: " + nomeFlor + "\nPreço: " + preco + "\nNome cliente: " + nomeCliente
				+ "\nPresente: " + presente + "\n";
	}
}
