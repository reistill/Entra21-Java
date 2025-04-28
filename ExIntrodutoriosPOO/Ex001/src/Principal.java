
public class Principal {
	public static void main(String[] args) {
		//jorge é o objeto também chamado como (!Handler!)
		Pessoa jorge = new Pessoa();
		
		//atribuindo ao atributo nome do objeto jorge o valor "Jorge".
		jorge.nome = "Jorge O Pexirico";
		//atribuindo os valores restantes nos atributos
		jorge.sexo = 'M';
		jorge.dataNascimento = "07/06/2006";
		jorge.estadoCivil = "Viúvo";
		
		System.out.printf("Nome: %s! \nSexo: %c \nNascimento: %s \nEstado Civil: %s", jorge.nome, jorge.sexo, jorge.dataNascimento, jorge.estadoCivil);
	}
}
