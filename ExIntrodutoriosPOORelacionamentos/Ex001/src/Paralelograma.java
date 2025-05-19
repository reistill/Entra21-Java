/*
Crie uma lista em outra classe para armazenar todos os objetos de Retangulo
Faça um método que encontre o Retangulo com a maior área e outro que encontre o Retangulo 
com o maior perímetro
*/

import java.util.ArrayList;
import java.util.List;

public class Paralelograma {
	//criando uma arraylist do objeto retângulo
	private List<Retangulo> listaRetangulos;
	
	public Paralelograma() {
		listaRetangulos = new ArrayList<Retangulo>();
	}
	
	public void adicionarRetangulo(Retangulo ret) {
		listaRetangulos.add(ret);
	}
	
	public Retangulo encontrarMaiorAreaRetangulo() {
		Retangulo retanguloMaiorArea = null;
		double maiorArea = 0;
		
		//encontra o retangulo com a maior area na lista de retangulos
		for (Retangulo ret : listaRetangulos) {
			if (ret.calcularArea() > maiorArea) {
				maiorArea = ret.calcularArea();
				retanguloMaiorArea = ret;
			}
		}
		return retanguloMaiorArea;
	}
	
	public Retangulo encontrarMaiorPerimetroRetangulo() {
		Retangulo retanguloMaiorPerimetro = null;
		double maiorPerimetro = 0;
		
		//encontra o retangulo com o maior Perimetro na lista de retangulos
		for (Retangulo ret : listaRetangulos) {
			if (ret.calcularPerimetro() > maiorPerimetro) {
				maiorPerimetro = ret.calcularPerimetro();
				retanguloMaiorPerimetro = ret;
			}
		}
		return retanguloMaiorPerimetro;
	}
}
