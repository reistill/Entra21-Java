public class Cliente {
    private int id;
    private String nome;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
    public int setId(int id) {
        this.id = id;
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }
}
