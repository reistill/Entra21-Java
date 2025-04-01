/*
Crie uma array de 5 elementos e imprima os últimos elementos por primeiro
*/
public class ExVM001 {
	public static void main(String[] args) {
		//vetor de string com 5 elementos 
		String elementos[] = {"borracha", "delegrego", "9", "loucura", "olá", "grande sp", "mundo", "mongos"};
		
		int tam = elementos.length-1;
		
		for (int i = tam; i >= 0; i--) {
			System.out.println("Os "+ elementos.length + " elementos  do vetor ao contrário fica: " + elementos[i] + "!");
		}
	}
}
