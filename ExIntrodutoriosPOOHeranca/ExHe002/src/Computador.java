/*
Computador:
O método ligarOuDesligar deve retornar "Ligando" caso o parâmetro for true e
"Desligando" caso seja false.

Notebook:
O método aumentarRam deve aumentar a quantidade de memória a partir do parâmetro passado no método.
• método rodarAplicacao deve retornar true caso o aplicativo termine em .exe

Smartphone:
O método tirarSelfie deve retornar true caso o atributo cameraFrontal seja true e falso caso camerafrontal for false
O método ligar deve retornar true caso o primeiro número do parâmetro for igual ao número do atributo da operadora e false caso não seja.
O método rodarAplicação deve retomar true caso o aplicativo termine em apk
 */

public abstract class Computador {
	private String modelo;
	private double ram;
	private double armazenamento;
	
	public Computador(String modelo, double ram, double armazenamento) {
		super();
		setModelo(modelo);
		setRam(ram);
		setArmazenamento(armazenamento);
	}
	
	public String ligarOUDesligar(boolean condicao) {
		if (condicao) {
			return "Ligando";
		}
		return "Desligando";
	}
	
	public abstract boolean rodarAplicacao(String tipo);
	
	public abstract void aumentarRam(double ram);
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if (modelo.isBlank() || modelo == null) {
			throw new IllegalArgumentException("Modelo não pode ficar vazio!");
		}
		this.modelo = modelo;
	}
	
	public double getRam() {
		return ram;
	}
	public void setRam(double ram) {
		if (ram < 0) {
			throw new IllegalArgumentException("Ram não pode ser negativa!");
		}
		this.ram = ram;
	}
	
	public double getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(double armazenamento) {
		if (armazenamento < 0) {
			throw new IllegalArgumentException("Armazenamento não pode ser negativo!");
		}
		this.armazenamento = armazenamento;
	}
	
	@Override
	public String toString() {
		return "\nModelo:" + modelo + "\nRam: " + ram + "\nArmazenamento: " + armazenamento + "\n";
	}
}
