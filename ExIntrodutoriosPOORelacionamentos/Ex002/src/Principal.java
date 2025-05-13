/*
a) Qual a flor mais cara?
b) Se a loja teve uma receita maior vendendo flores para presente ou não
*/

public class Principal {
	public static void main(String[] args) {
		
		Flor f1 = new Flor("cannabis", 100, "Guilherme Sérgio", false);
		
		Flor f2 = new Flor("rabo de burro", 80, "Sousa", false);
		
		Flor f3 = new Flor("guanxuma", 360, "Mauro", true);
		
		Flor f4 = new Flor("bromélias", 50, "Rodrigo", true);
		
		Floricultura doVerde =  new Floricultura();
		
		doVerde.adicionarFlor(f1);
		doVerde.adicionarFlor(f2);
		doVerde.adicionarFlor(f3);
		doVerde.adicionarFlor(f4);
		
		System.out.println("Flor mais Cara!" + doVerde.florMaisCara()); 
		
		System.out.println(doVerde.maiorReceita());
	}
}
