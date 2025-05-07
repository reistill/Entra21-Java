/*
Crie uma classe Empregado que terá como atributos:
Identificação
Nome
Sobrenome
Salário (mensal)
Crie métodos para:
Saber o salário anual do empregado
Saber o nome completo do empregado
Modificar o salário, o parâmetro do método deve ser o percentual de aumento
*/

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Empregado e1 = new Empregado();
		e1.id = "0001582";
		e1.nome = "João Ribeiro";
		e1.sobrenome = "Da Silva";
		e1.salarioMensal = 1500;
		
		System.out.println("Digite o número em porcento de aumento do funcionário " + e1.nomeCompleto() + ": ");
		double aumento = input.nextDouble();
		
		input.close();
		
		System.out.printf("\nO empregado " + e1.nomeCompleto() + " recebeu %f de aumento, seu salário Mensal agora é: %f R$", aumento, e1.modificarSalario(aumento));
		
	}
}
