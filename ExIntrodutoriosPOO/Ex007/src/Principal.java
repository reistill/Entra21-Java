/*
Crie 4 objetos de sua preferência.
Calcule:
a) Qual aeronave leva o maior número de passageiros?
b) Qual das aeronaves pode ficar no ar por mais tempo?
c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais 
longe?
*/

public class Principal {
	public static void main(String[] args) {
		
		Aeronave a1 = new Aeronave("Bell 505", 5, 231.37, 321, 1.33);
		
		Aeronave a2 = new Aeronave("Cessna 172 Skyhawk", 4, 302, 211, 0.69);
		
		Aeronave a3 = new Aeronave("LZ 127 Graf Zeppelin", 60, 128.78, 105.000, 0.01);
		
		Aeronave a4 = new Aeronave("Concorde", 128, 2179, 119.500, 86);
		
		Aeronave vetor[] = {a1, a2, a3, a4};
		
		//variáveis
		int maiorQntdPassageiros = Integer.MIN_VALUE;
		double maiorAutonomia = Double.MIN_VALUE;
		
		//encontrar a aeronave com mais passageiros
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].passageiros > maiorQntdPassageiros) {
				maiorQntdPassageiros = vetor[i].passageiros;
			}
		}
		
		//vai imprimir aeronave com mais passageiros
		for (int i = 0; i < vetor.length; i++) {
			if (maiorQntdPassageiros == vetor[i].passageiros)
			System.out.println("A aeronave " + vetor[i].modelo + " é a maior em capacidade de passageiros, com: " + maiorQntdPassageiros);
		}
		
		//encontrar a aeronave com mais autonomia
		for (int i = 0; i < vetor.length; i ++) {
			if (vetor[i].autonomiaAeronave() > maiorAutonomia) {
				maiorAutonomia = vetor[i].autonomiaAeronave();
			}
		}
		
		//vai imprimir aeronave com mais autonomia
		for (int i = 0; i < vetor.length; i++) {
			if (maiorAutonomia == vetor[i].autonomiaAeronave())
			System.out.println("A aeronave " + vetor[i].modelo + " é a maior em Autonomia, com: " + maiorAutonomia);
		}
		
		
	}
	
}
