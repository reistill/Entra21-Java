
public class Principal {
	public static void main(String[] args) {
		
		Circulo circulo1 = new Circulo("roxo", 1.5);
		System.out.println(circulo1);
		System.out.println("A área do círculo é: "+ circulo1.calcularArea() + "\n");
		
		Cilindro cilindro1 = new Cilindro("rosa", 2.5, 0.30);
		System.out.println(cilindro1);
		System.out.println("A área do cilindro é: " + cilindro1.calcularArea());
		System.out.println("o volume do cilindro é: " + cilindro1.calcularVolume());
	}
}
