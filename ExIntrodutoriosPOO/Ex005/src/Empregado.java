/*
Crie uma classe Empregado que terá como atributos:
Identificação
Nome
Sobrenome
Salário (mensal)
Crie métodos para:
Saber o salário anual do empregado
Saber o nome completo do empregado
Modificar o salário, o parâmetro do método deve ser o percentual de aumento
*/

public class Empregado {
	String id;
	String nome;
	String sobrenome;
	double salarioMensal;
	
	public double salarioAnual() {
		return salarioMensal * 12;
	}
	
	public String nomeCompleto() {
		return nome + " " + sobrenome;
	}
	
	public double modificarSalario(double porcentual) {
		return salarioMensal + (salarioMensal * porcentual);
	}
}
