import java.util.Scanner;

//Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
//Em seguida, calcule e mostre: 
//a) a área do triângulo retângulo que tem base A e altura C. 
//b) a área do círculo de raio C. 
//c) a área do trapézio que tem A e B por bases e C por altura. 
//d) a área do quadrado que tem lado B. 
//e) a área do retângulo que tem lados A e B
public class ExIntro008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//entrada usuário
		System.out.println("Digite o valor de A: ");
		double vA = input.nextDouble();
		System.out.println("Digite o valor de B: ");
		double vB = input.nextDouble();
		System.out.println("Digite valor de C: ");
		double vC = input.nextDouble();
		input.close();
		//processamento
		double areaTri = (vA * vC) / 2;
		double areaC = (Math.PI * Math.pow(vC, 2));
		double areaTra = (vA + vB) * (vC/2);
		double areaQ = (Math.pow(vB, 2));
		double areaR = vA * vB;
		//saída
		System.out.printf("Aqui estão as áreas!!! \n do Triângulo: "+ (areaTri) +" \n do Círculo: "+ (areaC) +" \n "
				+ "do Trapézio: "+ (areaTra) +" \n do Quadrado: "+ (areaQ) +" \n do Retângulo: "+ (areaR));
	}	
}
