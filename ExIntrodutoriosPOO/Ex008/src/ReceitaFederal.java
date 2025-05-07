/*
Para efetuar o recolhimento do Imposto de Renda a Receita Federal tem o NOME, CPF, UF (RS, 
PR e SC) e RENDA ANUAL.
EX: 
Nome: João da Silva
CPF: 123.456.789-00
UF: PR
RendaAnual: R$40.000
Para o cálculo do imposto a pagar de cada contribuinte, considere o seguinte:
Nível de Renda Anual Alíquota
        0 a 4.000       0%
        4.001 a 9.000   5,8%
        9.001 a 25.000  15%
        25.001 a 35.000 27,5%
        acima de 35.000 30%
Sendo assim, deve-se calcular o imposto a pagar do seguinte modo:
Imposto a pagar = Renda Anual * Alíquota
Crie 5 objetos da classe Contribuinte e coloque-os em um vetor.
Calcule:
a) Quem mais paga imposto.
b) Quem menos paga imposto.
c) Qual o total de imposto pago entre os 5 contribuintes?
*/

public class ReceitaFederal {
	private String nome;
	private String CPF;
	private String UF;
	private double rendaAnual;
	
	public ReceitaFederal(String nome, String CPF, String UF, double rendaAnual) {
		setNome(nome);
		setCPF(CPF);
		setUF(UF);
		setRendaAnual(rendaAnual);
	}

	public double Aliquota(double rendaAnual) {
		if (rendaAnual <= 4000) {
			return 0;
		} else if (rendaAnual <= 9000) {
			return (5.8 / 100);
		} else if (rendaAnual <= 25000) {
			return (15 / 100);
		} else if (rendaAnual <= 35000) {
			return (27.5 / 100);
		}
			return (30 / 100);
	}
	
	public double ImpostoPagar () {
		return rendaAnual * Aliquota(rendaAnual);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("nome em branco ou vazio!");
		} else {
			this.nome = nome;
		}
	}
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		if (CPF == null || nome.isBlank()) {
			throw new IllegalArgumentException("Erro, CPF em branco ou vazio!");
		} else {
			this.CPF = CPF;
		}
	}
	
	public String getUF() {
		return UF;
	}
	public void setUF(String UF) {
		if (CPF == null || nome.isBlank()) {
			throw new IllegalArgumentException("Erro, UF em branco ou vazio!");
		} else {
			this.UF = UF;
		}
	}
	
	public double getRendaAnual() {
		return rendaAnual;
	}
	public void setRendaAnual(double rendaAnual) {
		if (rendaAnual < 0) {
			throw new IllegalArgumentException("Erro, sua renda anual não pode ser negativa!");
		} else {
			this.rendaAnual = rendaAnual;
		}
	}
	
	@Override
	public String toString() {
		return "Imposto de Renda\n Nome: " + nome + "\nCPF: " + CPF + "\nUF=" + UF + "\nRenda Anual=" + rendaAnual + ";\n";
	}
}
