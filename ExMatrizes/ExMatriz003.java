/*
Faça um código que some duas matrizes de inteiros de tamanhos iguais
*/

public class ExMatriz003 {
	public static void main(String[] args) {
		
		int matriz1[][] = 
			{ 
				{12, 724}, 
				{1, 862}, 
				{7, 200} 
							};
		
		int matriz2[][] = 
			{ 
				{51, 176}, 
				{2, 8}, 
				{60, 1800}
							};
		//matrizSoma recebe o tamanho de linhas e de colunas da matriz1
		int matrizSoma[][] = new int[matriz1.length][matriz1[0].length];
		
		//percorre a matriz1 e matriz2 e coloca na matrizSoma a soma dos valores no índice das respectivas matrizes
		for (int i = 0; i < matrizSoma.length; i++) {
			for (int j = 0; j < matrizSoma[0].length; j++) {
				matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j]; 
			}
		}
		//percorrer e mostrar a matrizSoma
		for (int i = 0; i < matrizSoma.length; i++) {
			for (int j = 0; j < matrizSoma[0].length; j++) {
				System.out.print(matrizSoma[i][j] + " ");
			}
		System.out.println();
		}
	}
}
