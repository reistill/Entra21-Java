/*
Smartphone:
O método tirarSelfie deve retornar true caso o atributo cameraFrontal seja true e falso caso camerafrontal for false
O método ligar deve retornar true caso o primeiro número do parâmetro for igual ao número do atributo da operadora e false caso não seja.
O método rodarAplicação deve retomar true caso o aplicativo termine em apk
 */

public class Smartphone extends Computador{
	private int operadora;
	private boolean cameraFrontal;
	
	public Smartphone(String modelo, double ram, double armazenamento, int operadora, boolean cameraFrontal) {
		super(modelo, ram, armazenamento);
		setOperadora(operadora);
		setCameraFrontal(cameraFrontal);
	}

	public boolean tirarSelfie () {
		return cameraFrontal;
	}
	
	public boolean ligar(int numero) {
		String numerotelefone = Integer.toString(numero);
		String operadoratelefone = Integer.toString(operadora);
		if (numerotelefone.charAt(0) == operadoratelefone.charAt(0)) {
			return true;
		}
		return false;
	}
	
	@Override
	public void aumentarRam(double ram) {
		super.setRam(super.getRam() + ram);
	}
	
	@Override
	public boolean rodarAplicacao(String tipo) {
		return tipo.contains(".apk");
	}
	
	public int getOperadora() {
		return operadora;
	}
	public void setOperadora(int operadora) {
		this.operadora = operadora;
	}
	
	public boolean isCameraFrontal() {
		return cameraFrontal;
	}
	public void setCameraFrontal(boolean cameraFrontal) {
		this.cameraFrontal = cameraFrontal;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Operadora: " + operadora + "\nCâmera Frontal: " + cameraFrontal + "\n";
	}
}
