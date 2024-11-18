public class Main {
    public static void main(String[] args) {
        System.out.printf("No conceito de associação, os objetos são independentes? ");
        System.out.println("Sim.");
        System.out.printf("No conceito de agregação ,os objetos são independentes? ");
        System.out.println("Sim.");
        System.out.printf("No conceito de composição , o que acontece com o objeto parte ao remover um objeto todo? ");
        System.out.println("Se o todo é destruído as partes são destruidas também.");

        Veiculos [] veiculos = new Veiculos[3];
            veiculos[0] = new Veiculos("HB20", "GPT4607","Branca");
            veiculos[1] = new Veiculos("Creta", "PRA1616", "Preto");
            veiculos[2] = new Veiculos("FordK", "COP2324" , "Azul");

        Proprietario pablo = new Proprietario("Pablo Moraes",veiculos,"18/05/2001" );

        System.out.printf("%s\n", pablo.imprimir());

        ItemPedido[] item = new ItemPedido[3];
        item[0] = new ItemPedido("Agua",2,2.50);
        item[1] = new ItemPedido("Batata Frita",1,7.00);
        item[2] = new ItemPedido("Carne", 2, 15.00);

        Pedido p = new Pedido(3,"25/09/2024",item);

        System.out.printf("%s\n", p.imprimirpedido());

        Mesa m = new Mesa(4,"quadrada");
        Sala s = new Sala(3.75,2.00,m);

        System.out.printf("%s\n", s.imprimesala());
    }
}