public class Main {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[]{
                new Cliente("Carlos"),
                new Cliente("Ana"),
                new Cliente("Bruno")};

        Produto[] produtos = new Produto[]{
                new Produto(10),
                new Produto(5),
                new Produto(15)};

        Servico[] servicos = new Servico[]{
                new Servico(100.0),
                new Servico(50.0),
                new Servico(150.0)};

        Classificador classificador = new Classificador();
        classificador.ordena(clientes);
        classificador.ordena(produtos);
        classificador.ordena(servicos);

        System.out.println("Clientes ordenados por nome:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }

        System.out.println("\nProdutos ordenados por código:");
        for (Produto produto : produtos) {
            System.out.println(produto.getCodigo());
        }

        System.out.println("\nServiços ordenados por preço:");
        for (Servico servico : servicos) {
            System.out.println(servico.getPreco());
        }
    }
}