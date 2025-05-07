/*
Crie uma Array List
O usuário vai colocando valores decimais até ele colocar o número 0.
Calcular:
a) Qual o menor número
b) Qual o maior número
c) Calcular a média
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExAL003 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<Double> listaDecimal = new ArrayList<Double>();
		
		System.out.println("Digite quantos elementos deseja inserir: ");
		int quantos = input.nextInt();
		
		for(int i = 1; i < quantos+1; i++) {
			System.out.printf("Digite o %d° elemento: \n", i);
			double elementos = input.nextDouble();
			
			listaDecimal.add(elementos);
		}
		
		
		input.close();
	}
}
