/*
Crie uma Array List e inverta ela
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExAL002 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<String> lista = new ArrayList<String>();
		
		System.out.println("Digite quantos elementos deseja inserir: ");
		int quantos = input.nextInt();
		
		for(int i = 1; i < quantos+1; i++) {
			
			System.out.printf("Digite o %d° elemento: \n", i);
			String elementos = input.next();
			
			lista.add(elementos);
		}
		
		input.close();
		
		System.out.printf("Essa é sua lista: \n" + lista);
		System.out.printf("\nEssa é sua lista invertida: \n" + lista.reversed());
	}
}
