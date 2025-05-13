// Crie 5 objetos de Retangulo.

public class Principal {
	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo(2, 4);
		
		Retangulo r2 = new Retangulo(0.1, 4.1);
		
		Retangulo r3 = new Retangulo(1, 4.5);
		
		Retangulo r4 = new Retangulo(1, 6.8);
		
		Retangulo r5 = new Retangulo(1.6, 3.4);
		
		Paralelograma p1 = new Paralelograma();
		p1.adicionarRetangulo(r1);
		p1.adicionarRetangulo(r2);
		p1.adicionarRetangulo(r3);
		p1.adicionarRetangulo(r4);
		p1.adicionarRetangulo(r5);
		
		System.out.println("Maior Area: " + p1.encontrarMaiorAreaRetangulo());
		System.out.println("Maior perímetro: " + p1.encontrarMaiorPerimetroRetangulo());
		
	}
}
