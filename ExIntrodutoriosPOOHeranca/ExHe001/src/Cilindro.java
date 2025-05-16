public class Cilindro extends Circulo{
	private double altura;

	public Cilindro(String cor, double raio, double altura) {
		super(cor, raio);
		setAltura(altura);
	}
	
	public double calcularVolume() {
		return super.calcularArea() * altura;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if (altura < 0) {
			throw new IllegalArgumentException("A altura não pode ser menor que 0!");
		}
		this.altura = altura;
	}

	@Override
	public String toString() {
		return  "Cilindro \nCor: " + getCor() + "\nRaio: " + getRaio() + "\nAltura:" + altura + "\n";
	}
}
