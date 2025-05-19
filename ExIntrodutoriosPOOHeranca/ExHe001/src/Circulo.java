public class Circulo {
	private String cor;
	private double raio;
	
	public Circulo(String cor, double raio) {
		setCor(cor);
		setRaio(raio);
	}

	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		if (cor.isBlank() || cor == null) {
			throw new IllegalArgumentException("A cor não deve ser vazia!");
		}
		this.cor = cor;
	}

	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		if (raio < 0) {
			throw new IllegalArgumentException("O raio não deve ser menor que 0!");
		}
		this.raio = raio;
	}
	
	@Override
	public String toString() {
		return "Circulo\nCor: " + cor + "\nRaio:" + raio + "\n";
	}
}
