/*
Coloque 5 elementos em uma Array List e ordene-os
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExAL001 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//List é uma classe       ArrayList também
		List<Double> Lista = new ArrayList<Double>();
		
		//pergunta e adiciona 5 elementos na lista
		for (int i = 1; i < 6; i++) {
			System.out.printf("Digite o %d° elemento: \n", i);
			Double elementos = input.nextDouble();
			Lista.add(elementos);	
		}
		
		System.out.println("Essa é sua lista: " + Lista);
		input.close();
	}
}
