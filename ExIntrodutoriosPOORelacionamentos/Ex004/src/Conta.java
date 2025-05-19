/*
Faça uma classe chamada Conta, com os atributos: nome do titular e saldo.
Faça métodos para:

Sacar dinheiro: o método deve receber a quantidade a ser sacada como parâmetro 

Depositar dinheiro: o método deve receber a quantidade a ser depositada como parâmetro 

Transferir dinheiro de uma conta para outra: o método deve receber como parâmetro o objeto 
que receberá a transferência e a quantidade a ser transferida
*/

public class Conta {
	private String nomeTitular;
	private Double saldo;
	
	public Conta(String nomeTitular, Double saldo) {
		setNomeTitular(nomeTitular);
		setSaldo(saldo);
	}
	
	public void sacarDinheiro(double qntd) {
		if (qntd <= 0) {
			throw new IllegalArgumentException("Não existe saque negativo!");
		}
		if (qntd > saldo) {
			throw new IllegalArgumentException("Saldo insuficiente para este saque!");
		}
		saldo -= qntd;
	}
	
	public void depositarDinheiro(double qntd) {
		if (qntd <= 0) {
			throw new IllegalArgumentException("Não existe deposito negativo!");
		}
		saldo += qntd;
	}
	
	public void transferirDinheiro(Conta destinatario, double qntd) {
		if (qntd <= 0 ) {
			throw new IllegalArgumentException("Não pode transferir valores abaixo de 0!");
		}
		if (qntd >= saldo ) {
			throw new IllegalArgumentException("Não pode transferir valores maiores que seu saldo!");
		}
		saldo -= qntd;
		destinatario.setSaldo(destinatario.getSaldo() + qntd);
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		if (nomeTitular.isBlank() || nomeTitular == null) {
			throw new IllegalArgumentException("O nome do Titular não pode ser vazio!");
		}
		this.nomeTitular = nomeTitular;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double Saldo) {
		saldo = Saldo;
	}

	@Override
	public String toString() {
		return "Conta Bancária \nNome do Titular: " + nomeTitular + "\nSaldo: " + saldo + " R$\n";
	}
}
