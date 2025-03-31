import java.util.Scanner;

/*
 Faça um programa que funciona como um conversor universal.
Primeiro o usuário escolhe se ele quer converter: temperatura, peso, comprimento ou volume.
Depois, ele escolhe qual a unidade do valor que ele deseja converter
Após isso, o usuário entra com o valor desejado
Depois, ele escolhe para qual ele quer converter.
As opções de temperatura, são: celsius, fahrenheit e kelvin.
As opções de peso são: quilos, libras e onças
As opções de comprimento são: metros, pés e polegadas
As opções de volume são: litros, galão líquido e onças líquidas
*/

public class ExSelec012 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//entrada usuário
		System.out.println("Escolha [1]Temperatura [2]Peso [3]Comprimento [4]Volume: ");
		int grandeza = input.nextInt();
		//Temperatura
		if (grandeza == 1) {
			System.out.println("Você escolheu Temperatura!");
			System.out.println("Escolha a unidade que você converterá [1]Celsius [2]Fahrenheit [3]Kelvin: ");
			int unidade = input.nextInt();
			//Celsius
			if (unidade == 1) {
				System.out.println("Você escolhu Celsius°!");
				System.out.println("Agora, digite o valor em Celsius:");
				double celsius = input.nextDouble();
				System.out.println("Escolha para qual unidade você converterá [2]Fahrenheit [3]Kelvin:");
				int unidade2 = input.nextInt();
				if (unidade2 == 2) {
					System.out.println("Você converterá de Celsius para Fahrenheit!");
					double celsFahre = (celsius * 9/5) + 32;
					System.out.printf("%f para Fahrenheit é igual á = %f", celsius, celsFahre);
				} else {
					System.out.println("Você converterá de Celsius para Kelvin!");
					double celsKel = celsius + 273.15;
					System.out.printf("%f para Kelvin é igual á = %f", celsius, celsKel);
				}
			//Fahrenheit	
			} else if (unidade == 2) {
				System.out.println("Você escolhu Fahrenheit°!");
				System.out.println("Agora, digite o valor em Fahrenheit:");
				double fahrenheit = input.nextDouble();
				System.out.println("Escolha para qual unidade você converterá [2]Celsius [3]Kelvin:");
				int unidade2 = input.nextInt();
				if (unidade2 == 2) {
					System.out.println("Você converterá de Fahrenheit para Celsius!");
					double fahreCel = (fahrenheit-32) / 1.8;
					System.out.printf("%f para Celsius é igual á = %f", fahrenheit, fahreCel);
				} else {
					System.out.println("Você converterá de Fahrenheit para Kelvin!");
					double celsKel = 5/9 * (fahrenheit + 459.67);
					System.out.printf("%f para Kelvin é igual á = %f", fahrenheit, celsKel);
				}
			//Kelvin
			} else {
				System.out.println("Você escolhu Kelvin°!");
				System.out.println("Agora, digite o valor em Kelvin:");
				double kelvin = input.nextDouble();
				System.out.println("Escolha para qual unidade você converterá [2]Fahrenheit [3]Celsius:");
				int unidade2 = input.nextInt();
				if (unidade2 == 2) {
					System.out.println("Você converterá de Kelvin para Fahrenheit!");
					double kelFahre = 1.8 * kelvin - 459.67;
					System.out.printf("%f para Fahrenheit é igual á = %f", kelvin, kelFahre);
				} else {
					System.out.println("Você converterá de Kelvin para Celsius!");
					double kelCels = kelvin - 273.15;
					System.out.printf("%f para Celsius é igual á = %f", kelvin, kelCels);
				}
			}
			input.close();}
	}
}