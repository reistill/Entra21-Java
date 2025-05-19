/*
Notebook:
O método aumentarRam deve aumentar a quantidade de memória a partir do parâmetro passado no método.
• método rodarAplicacao deve retornar true caso o aplicativo termine em .exe
 */

public class Notebook extends Computador{
	private double peso;
	
	
	public Notebook(String modelo, double ram, double armazenamento, double peso) {
		super(modelo, ram, armazenamento);
		setPeso(peso);
	}

	@Override
	public boolean rodarAplicacao(String tipo) {
		return tipo.contains(".exe");
	}
	
	@Override
	public void aumentarRam(double ram) {
		super.setRam(super.getRam() + ram);
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if (peso < 0) {
			throw new IllegalArgumentException("Peso não pode ser 0!");
		}
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Peso:" + peso + "\n";
	}
}
