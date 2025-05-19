import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar produtos
        Produto p1 = new Produto(1, "X-Salada", 15.00);
        Produto p2 = new Produto(2, "Batata Frita", 10.00);
        Produto p3 = new Produto(3, "Refrigerante", 6.00);
        List<Produto> cardapio = Arrays.asList(p1, p2, p3);

        // Criar mesas
        Mesa m1 = new Mesa(1);
        Mesa m2 = new Mesa(2);

        // Cadastro cliente
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        Cliente cliente = new Cliente(1, nome);

        // Escolha da comanda
        System.out.print("Você deseja comanda assistida? (s/n): ");
        String tipo = scanner.nextLine();
        boolean assistida = tipo.equalsIgnoreCase("s");

        Smartcomanda comanda = new Smartcomanda(1, assistida);
        comanda.setCliente(cliente);

        // Conectar em uma mesa
        System.out.print("Escolha a mesa (1 ou 2): ");
        int numMesa = scanner.nextInt();
        Mesa mesaSelecionada = (numMesa == 1) ? m1 : m2;
        comanda.conectarNaMesa(mesaSelecionada);

        // Criar pedido
        Pedido pedido = new Pedido();
        boolean pedidoAtivo = true;

        while (pedidoAtivo) {
            System.out.println("\nMENU:");
            System.out.println("1 - Ver cardápio");
            System.out.println("2 - Adicionar item");
            System.out.println("3 - Ver pedido");
            System.out.println("4 - Chamar garçom");
            System.out.println("5 - Finalizar pedido e pagar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nCARDÁPIO:");
                    for (Produto prod : cardapio) {
                        System.out.printf("%d - %s (R$ %.2f)\n", prod.getId(), prod.getNome(), prod.getPreco());
                    }
                    break;

                case 2:
                    System.out.print("Digite o ID do produto: ");
                    int idProd = scanner.nextInt();
                    System.out.print("Quantidade: ");
                    int qtd = scanner.nextInt();
                    Produto escolhido = cardapio.get(idProd - 1);
                    pedido.adicionarItem(new ItemPedido(escolhido, qtd));
                    System.out.println("Item adicionado!");
                    break;

                case 3:
                    System.out.println("\nPEDIDO:");
                    for (ItemPedido item : pedido.getItens()) {
                        System.out.printf("%s x%d - R$ %.2f\n",
                                item.getProduto().getNome(),
                                item.getQuantidade(),
                                item.getSubtotal());
                    }
                    System.out.printf("Total: R$ %.2f\n", pedido.calcularTotal());
                    break;

                case 4:
                    comanda.chamarGarcom();
                    break;

                case 5:
                    System.out.printf("Total a pagar: R$ %.2f\n", pedido.calcularTotal());
                    System.out.println("Pagamento realizado com sucesso!");
                    pedidoAtivo = false;
                    break;
            }
        }

        comanda.desconectarDaMesa();
        System.out.println("Obrigado por usar a Smartcomanda!");
    }
}
