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
	private String modelo;
	private int passageiros;
	private double velocidadeMaxima;
	private double capacidadeCombustivel;
	private double queimaCombustivelMinuto;
	
	public Aeronave(String modelo, int passageiros, double velocidadeMaxima, double capacidadeCombustivel, double queimaCombustivelMinuto) {
		setModelo(modelo);
		setPassageiros(passageiros);
		setVelocidadeMaxima(velocidadeMaxima);
		setCapacidadeCombustivel(capacidadeCombustivel);
		setQueimaCombustivelMinuto(queimaCombustivelMinuto);
	}
	
	public double autonomiaAeronave() {
		return capacidadeCombustivel/queimaCombustivelMinuto;
	}
	
	public double distanciaMax() {
		return autonomiaAeronave() * velocidadeMaxima / 60;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo == null || modelo.isBlank()) {
			System.err.println("Não existem modelo vazio ou em branco!");
		} else {
			this.modelo = modelo;
		}
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		if (passageiros < 0) {
			System.err.println("Não existe quantidade negativa de passageiros!"); 
		} else {
			this.passageiros = passageiros;
		}
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		if (velocidadeMaxima < 0) {
			System.err.println("Não existe velocidade negativa!"); 
		} else {
			this.velocidadeMaxima = velocidadeMaxima;
		}
	}
	

	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}

	public double getQueimaCombustivelMinuto() {
		return queimaCombustivelMinuto;
	}

	public void setQueimaCombustivelMinuto(double queimaCombustivelMinuto) {
		this.queimaCombustivelMinuto = queimaCombustivelMinuto;
	}

	@Override
	public String toString() {
		return "Aeronave: " + modelo + "; \npassageiros: " + passageiros + "; \nvelocidadeMaxima: " + velocidadeMaxima
				+ "; \ncapacidadeCombustivel: " + capacidadeCombustivel + "; \nqueimaCombustivelMinuto: "
				+ queimaCombustivelMinuto + ";\n";
	}
	
	
}
