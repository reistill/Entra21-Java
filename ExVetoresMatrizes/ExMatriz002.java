/*
Calcule o determinante da matriz abaixo:
4 12
2 -3
*/

public class ExMatriz002 {
	public static void main(String[] args) {
		
		int matriz[][] = 
			{
				{4, 12},
				{2, -3}
							};
		
		int detMatriz = (4 * -3) - (12 * 2);
		int dMatriz = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
		
		System.out.println("O determinante da Matriz 2x2(usando índice) é: " + dMatriz + "!");
		System.out.println("O determinante da Matriz 2x2(usando matemática) é: " + detMatriz + "!");
	}
}
