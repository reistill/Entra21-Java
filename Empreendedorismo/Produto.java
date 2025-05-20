public class Produto {
    private int id;
    private String nome;
    private double preco;
    
    // Construtor
    public Produto(int id, String nome, double preco) {
        setId(id);
        setNome(nome);
        setPreco(preco);
        }
    
        // Getter and Setter methods
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            if (id < 0) {
                throw new IllegalArgumentException("O ID do produto deve ser um número inteiro maior que zero!.");
            }
            this.id = id;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            if (nome == null || nome.isBlank()) {
                throw new IllegalArgumentException("O nome do produto deve ser preenchido!");
            }
            this.nome = nome;
        }
    
        public double getPreco() {
            return preco;
        }
    
        public void setPreco(double preco) {
            if (preco < 0) {
                throw new IllegalArgumentException("O preço do produto deve ser maior que zero!.");
            }
            this.preco = preco;
        }
    }
}
