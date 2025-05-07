/*
Crie 5 objetos da classe Contribuinte e coloque-os em um vetor.
Calcule:
a) Quem mais paga imposto.
b) Quem menos paga imposto.
c) Qual o total de imposto pago entre os 5 contribuintes?
*/

public class Principal {
	public static void main(String[] args) {
		
		ReceitaFederal p1 = new ReceitaFederal("Marcos", "013.463.310-09", "SC", 4200.00);
		
		ReceitaFederal p2 = new ReceitaFederal("Tonho", "213.643.013-12", "SC", 2200.00);
		
		ReceitaFederal p3 = new ReceitaFederal("Luana", "130.375.098-33", "PA", 1200.00);
		
		ReceitaFederal p4 = new ReceitaFederal("Marcia", "310.463.310-09", "RS", 8200.00);
		
		ReceitaFederal p5 = new ReceitaFederal("Gustavo", "983.789.407-68", "RS", 16000.00);
		
		ReceitaFederal vetor[] = {p1, p2, p3, p4, p5};
		
		//varáveis
		double maiorImposto = Double.MIN_VALUE;
		double menorImposto = Double.MAX_VALUE;
		double totalArrecadado = 0;
		
		//encontrar o maior pagador de impostos
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].ImpostoPagar() > maiorImposto) {
				maiorImposto = vetor[i].ImpostoPagar();
			}
		}
		
		//imprimir o maior pagador
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].ImpostoPagar() == maiorImposto) {
				System.out.println("O maior imposto pago é: " + maiorImposto + "R$ do contribuinte " + vetor[i].getNome() + "!");
			}
		}
		
		//encontrar o menor pagador de impostos
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].ImpostoPagar() < menorImposto) {
				menorImposto = vetor[i].ImpostoPagar();
			}
		}
		
		//imprimir o menor pagador
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].ImpostoPagar() == menorImposto) {
				System.out.println("O menor imposto pago é: " + menorImposto + "R$ do contribuinte " + vetor[i].getNome() + "!");
			}
		}
				
		
		//total de imposto pago entre os contribuintes
		for (int i = 0; i < vetor.length; i++) {
			totalArrecadado += vetor[i].ImpostoPagar();
		}
		
		System.out.println("O total de imposto foi: " + totalArrecadado + "R$");
	}
}
