
public class Principal {
	public static void main(String[] args) {
		
		Notebook n1 =  new Notebook("Acer Aspire E5 - nvidia series", 8, 240, 2);
		System.out.println(n1);
		
		Smartphone s1 = new Smartphone("Samsung S23", 8, 512, 8486, false);
		System.out.println(s1);
		
		System.out.println("A ligação deu certo: " + s1.ligar(843116092));
		System.out.println("O smartphone conseguiu abrir o aplicativo? " + s1.rodarAplicacao("pichau.apk"));
		System.out.println("O smartphone vai" + s1.tirarSelfie());
	}
}
