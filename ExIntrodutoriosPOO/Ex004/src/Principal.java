/*
Crie uma classe chamada Circulo que tenha o atributo raio
Calcule a área de 5 objetos diferentes de Circulo
Para obter o valor de PI, use a função Math.PI do Java
*/

public class Principal {
	public static void main(String[] args) {
		
		Circulo c1 = new Circulo();
		c1.raio = 2.0;
		
		System.out.printf("A área do círculo de raio %f é: %f! \n", c1.raio, c1.calcularAreaCirculo());
		
		Circulo c2 = new Circulo();
		c2.raio = 2.5;
		
		System.out.printf("A área do círculo de raio %f é: %f! \n", c2.raio, c2.calcularAreaCirculo());
		
		Circulo c3 = new Circulo();
		c3.raio = 4.5;
		
		System.out.printf("A área do círculo de raio %f é: %f! \n", c3.raio, c3.calcularAreaCirculo());
		
		Circulo c4 = new Circulo();
		c4.raio = 5.0;
		
		System.out.printf("A área do círculo de raio %f é: %f! \n", c4.raio, c4.calcularAreaCirculo());
		
		Circulo c5 = new Circulo();
		c5.raio = 1.0;
		
		System.out.printf("A área do círculo de raio %f é: %f! \n", c5.raio, c5.calcularAreaCirculo());
	}
}
