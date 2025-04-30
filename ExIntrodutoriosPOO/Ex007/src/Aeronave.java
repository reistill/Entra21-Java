/*
Faça uma classe chamada Aeronave.
Com os atributos:
• Modelo
• Passageiros
• Velocidade máxima
• Capacidade de combustível
• Queima de combustível por minuto
Crie 4 objetos de sua preferência.
Calcule:
a) Qual aeronave leva o maior número de passageiros?
b) Qual das aeronaves pode ficar no ar por mais tempo?
c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais 
longe?
*/

public class Aeronave {
	String modelo;
	int passageiros;
	double velocidadeMaxima;
	double capacidadeCombustivel;
	double queimaCombustivelMinuto;
	
	public Aeronave(String modelo, int passageiros, double velocidadeMaxima, double capacidadeCombustivel, double queimaCombustivelMinuto) {
		this.modelo = modelo;
		this.passageiros = passageiros;
		this.velocidadeMaxima = velocidadeMaxima;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.queimaCombustivelMinuto = queimaCombustivelMinuto;
	}
	
	public double autonomiaAeronave() {
		return capacidadeCombustivel/queimaCombustivelMinuto;
	}
	
	public double distanciaMax() {
		return autonomiaAeronave() * velocidadeMaxima;
	}
	
}
