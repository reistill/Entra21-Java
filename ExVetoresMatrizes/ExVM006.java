
/*
Faça um algoritmo que inverta a ordem de uma array
(o primeiro elemento vai se tornar o último elemento
*/
public class ExVM006 {
	public static void main(String[] args) {
		//vetores
		String elemento1[] = {"água", "terra", "fogo", "ar"};
		String elemento2[] = new String[elemento1.length];
		
		for (int i = (elemento1.length-1), j = 0; i >= 0; i--) {
			//utilizando o i para percorrer a lista normal e o j para percorrer a lista ao contrário 
			elemento2[j] = elemento1[i];
			j++;
		}
		//percorrer a lista e printar
		for (int i = 0; i < elemento2.length; i++) {
			System.out.println("O elemento do vetor original:" + elemento1[i] + "\n" + "Elemento do vetor ao contrário:"  + elemento2[i]);
		}
	}
}
