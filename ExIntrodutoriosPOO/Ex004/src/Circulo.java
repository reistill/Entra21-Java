/*
Crie uma classe chamada Circulo que tenha o atributo raio
Calcule a área de 5 objetos diferentes de Circulo
Para obter o valor de PI, use a função Math.PI do Java
*/
public class Circulo {
	double raio;
	
	public double calcularAreaCirculo() {
		return ( Math.PI * Math.pow(raio, 2) );
	}
}
