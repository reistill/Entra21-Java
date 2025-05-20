public class Mesa {
    private int numero;
    private boolean ocupada;

    public Mesa(int numero) {
        setNumero(numero);
        setOcupada(false);
    }

    getNumero() {
        return this.numero;
    }
    setNumero(int numero) {
        this.numero = numero;
    }
    getOcupada() {
        return this.ocupada;
    }
    setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}
