/*
George Lucas utiliza uma fórmula para criar os nomes dos personagens em suas 
histórias (Jar Jar Binks, ObiWan Kenobi, etc).
A fórmula, supostamente, é:

Seu primeiro nome na série Star Wars:
i.Pegue as três primeiras letras de seu sobrenome
ii.Adicione a ele as duas primeiras letras de seu nome

Seu sobrenome na série Star Wars:
i.Pegue as duas primeiras letras do sobrenome de solteira de sua mãe
ii.Adicione a ele as três primeiras letras do nome da cidade onde você nasceu

Crie um método chamado generateStarWarsName que gera um nome completo Star 
Wars conforme descrito.
Imprima o seu nome Star Wars
As entradas serão os nomes completos.
Para separar, por exemplo as três primeiras letras do seu sobrenome, use o atributo
.charAt() das Strings
*/

import java.util.Scanner;

public class ExMet007 {
	
	public static void generateStarWarsName(String nome, String sobrenome, String nomeCidade, String sobrenomeMae) {
		
		//variáveis
		String nomeSW2Letra = "";
		String sobrenomeSW3Letra = "";
		String nomeCidadeSW3Letra = "";
		String sobrenomeMaeSW2Letra = "";
		
		//pega as 3 primeiras letras sobrenome e cidade
		for (int i = 0; i < 3; i++) {
			sobrenomeSW3Letra += sobrenome.charAt(i);
			nomeCidadeSW3Letra += nomeCidade.charAt(i);
		}
		
		//pega as 2 primeiras letras do nome e sobrenome
		for (int i = 0; i < 2; i++) {
			nomeSW2Letra += nome.charAt(i);
			sobrenomeMaeSW2Letra += sobrenomeMae.charAt(i);
		}
		
		System.out.println("Seu nome de Jedi é: " + (sobrenomeSW3Letra+nomeSW2Letra) + " " + (sobrenomeMaeSW2Letra+nomeCidadeSW3Letra) + ". Que a força esteja com você!");
	}
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro nome: ");
		String nome = input.next();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = input.next();
		
		System.out.println("Digite o nome da sua cidade: ");
		String nomeCidade = input.next();
		
		System.out.println("Digite o sobrenome de solteira da Mãe: ");
		String sobrenomeMae = input.next();
		
		generateStarWarsName(nome, sobrenome, nomeCidade, sobrenomeMae);
		
		input.close();
	}
}
