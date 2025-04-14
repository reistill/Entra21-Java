/*
Faça um algoritmo que atribua valores a um vetor de 100 posições de acordo com o quadrado 
do seu índice.
Ex:
[0] = 0
[1] = 1
[2] = 4
[3] = 9
*/
public class ExVM004 {
	public static void main(String[] args) {
		
		double quadrado;
		int cem[] = new int[100];
		
		 for (int k = 0, i = 0; i < cem.length; i++) {
			 //atribuindp o valor k no vetor cem
			 cem[i] = k; 
			 k++;
			 
			 //potenciando o valor k em 2
			 quadrado = Math.pow(cem[i], 2);
			 
			 //saída
			 System.out.println("O quadrado² de " + cem[i] + " é: " + quadrado + "!");
		 }
		
	}
}
