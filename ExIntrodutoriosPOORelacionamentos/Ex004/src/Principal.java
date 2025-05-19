
public class Principal {
	public static void main(String[] args) {
		
		Conta c1 = new Conta("James Rodrigues", 900000.00);
		c1.sacarDinheiro(100000);
		
		Conta c2 = new Conta("Sami Jorge", 122578.00);
		
		Conta c3 = new Conta("Ricardo Juarez", 510781.00);
		c3.transferirDinheiro(c2, 2);
		
		Conta c4 = new Conta("Duda Reis", 150.25);
		c4.depositarDinheiro(1000);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
