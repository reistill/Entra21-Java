/*
Crie uma matriz com 12 linhas e 2 colunas
A primeira coluna corresponde aos meses do ano
A segunda corresponde ao lucro que a loja teve no mês.
Imprima o seu resultado no formato:
No mês 1 a loja teve 2000 de lucro
No mês 2 a loja teve 1500 de lucro..
*/

public class ExMatriz001 {
	public static void main(String[] args) {

		int matriz[][] = 
			{ 
				{1, 37342}, 
				{2, 12420}, 
				{3, 16747}, 
				{4, 57985}, 
				{5, 34720}, 
				{6, 21363}, 
				{7, 24689}, 
				{8, 2468}, 
				{9, 2542}, 
				{10, 2875}, 
				{11, 9822}, 
				{12, 2090} 
								};
		
		for(int i = 0; i < matriz.length; i++) {
			System.out.println("No mês " + matriz[i][0] + " a loja teve " + matriz[i][1] + " lucro!");
		}
			System.out.println();
		}
}