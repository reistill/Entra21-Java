/*
A primeira coluna é o tamanho da casa
A segunda coluna é a quantidade de quartos
A terceira coluna é o preço
Determinar:
a) Qual é a média dos preços das casas?
b) Quanto custa a menor casa?
c) Quantos quartos tem a casa mais cara?
d) Qual a diferença de tamanho da casa com o maior número de quartos para a casa com o 
menor número de quartos?
e) Qual a média do tamanho das casas que custam mais de 300.000 mil?
*/

public class ExMatriz004 {
	public static void main(String[] args) {
		
		int[][] matriz = 
			{
				 {2104, 3, 399900},
				 {1600, 3, 329900},
				 {2400, 3, 369000},
				 {1416, 2, 232000},
				 {3000, 4, 539900},
				 {1985, 4, 299900},
				 {1534, 3, 314900},
				 {1427, 3, 199000},
				 {1380, 3, 212000},
				 {1494, 3, 242500},
				 {1940, 4, 240000},
				 {2000, 3, 347000},
				 {1890, 3, 330000},
				 {4478, 5, 699900},
				 {1268, 3, 259900}
				 						};
		
		//variáveis
		int menorCasa = Integer.MAX_VALUE;
		int precoMenorCasa = 0;
		int casaMaisCara = Integer.MIN_VALUE;
		int qntdQuartosMaisCara = 0;
		int menorqntdQuartos = Integer.MAX_VALUE;
		double soma = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				
				//verifica se o indice está no valor(2) e adiciona o valor na variável soma
				if (matriz[i][j] == matriz[i][2]) {
					soma += matriz[i][j];
				}
				
				//encontra a menor casa
				if (matriz[i][0] < menorCasa) {
					menorCasa = matriz[i][0];
					precoMenorCasa = matriz[i][2];
				}
				
				//encontra a casa mais cara
				if (matriz[i][2] > casaMaisCara) {
					casaMaisCara= matriz[i][2];
					qntdQuartosMaisCara = matriz[i][1];
				}
				
				//encontra a menor quantidade de quartos
				if (matriz[i][1] < menorqntdQuartos)  {
					menorqntdQuartos = matriz[i][1];
				}
			}	
		}
		
		//imprime o valor médio das casas
		System.out.println("A média de preço entre as " + matriz.length + " casas é: " + soma/matriz.length + "R$");
		//imprime o tamanho e valor da menor casa 
		System.out.println("A menor casa tem " + menorCasa + "m²" + ". Seu preço é: " + precoMenorCasa + "R$");
		//imprime o valor da casa mais cara e seus quartos
		System.out.println("A casa com mais quartos tem: " + qntdQuartosMaisCara + " quartos e seu valor é: " + casaMaisCara + "R$");
		//imprime a casa com mais quartos e a casa com menos quartos
		System.out.println("A casa com mais quartos tem: " + qntdQuartosMaisCara + " e a casa com menos quartos tem: " + menorqntdQuartos + " a diferença de quartos é de: " + (qntdQuartosMaisCara-menorqntdQuartos) + " quartos!");
	}
}
