/*
Faça uma classe chamada Retangulo, com os atributos altura e largura.
Faça um método para descobrir a área e outro para descobrir o perímetro.
Crie 5 objetos de Retangulo.
Crie uma lista em outra classe para armazenar todos os objetos de Retangulo
Faça um método que encontre o Retangulo com a maior área e outro que encontre o Retangulo 
com o maior perímetro
Imprima o toString desses Retangulos
*/

public class Retangulo {
	private double altura;
	private double largura;
	
	public Retangulo(double altura, double largura) {
		setAltura(altura);
		setLargura(largura);
	}
	
	public double calcularArea() {
		return largura * altura;
	}
	
	public double calcularPerimetro() {
		return 2 * (largura + altura);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura < 0) {
			throw new IllegalArgumentException("Altura não pode ser menor que 0!");
		}
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if (largura < 0) {
			throw new IllegalArgumentException("Largura não pode ser menor que 0!"); 
		}
		this.largura = largura;
	}

	@Override
	public String toString() {
		return "Retangulo\n Altura: " + altura + "\nLargura: " + largura + "\n";
	}
}
