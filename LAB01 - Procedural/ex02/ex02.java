import java.util.Scanner;

public class exc02_resolvido {

    public static void main(String[]args){
        //Para fazer a leitura cria um "objeto" para conseguir lidar com as entradas do teclado
        //Declarar as variáveis

        String[] nome = new String[100]; // em Java ele consegue lê a string por completo, n precisa de ler char por char
        float[] preco = new float[4];
        int[] quantidadeEstoque = new int[4];

        //Scanner sc = new Scanner(System.in); faz só uma vez dentro da função. O "sc" é como se fosse uma variável

        for (int i = 0; i < 4; i++) {
            nome[i] = input("Digite o nome do produto").nextLine();
            preco[i] = input("Digite o preco").nextFloat();
            quantidadeEstoque[i] = input("Digite a quantidade disponivel no estoque:").nextInt();
        }
        System.out.println("Valor do preco com 10% de aumento dos produtos 1 e 2 ");
        alteraPreco(preco[0], 10);
        alteraPreco(preco[1], 10);

        System.out.println("Valor do preco dos produtos 3 com desconto de 15%");
        if (alteraPreco(preco[2], -15) == -1){
            System.out.println("Erro: preco nao alterado. Entre com uma porcentagem valida");
        }else{
            System.out.println("Preco alterado!");
        }

        System.out.println("Alterando o preco do produto 4");
        if(alteraPreco(preco[3], -10)== -1){
            System.out.println("Erro: preco nao alterado. Entre com uma porcentagem valida");
        }

        System.out.println();
        System.out.println("Produtos cadastrados:");
        System.out.println();
        for(int i = 0; i < 4; i++){
            System.out.println("Produto:" + nome);
            System.out.println("Preco:" + preco);
            System.out.println("Quantidade disponivel no estoque:" + quantidadeEstoque);
            System.out.println();
        }

    }

    /*como vou usar o scanner mais vezes resolvi criar uma função que lê do teclado, ainda não entendi mto bem como funciona*/
    public static Scanner input(String message) {
        System.out.println(message);
        return new Scanner(System.in);
    }

    public static int alteraPreco(float preco, float porcentagem){
        float temp; //pelo que eu entendi é o que guarda o valor que a gente usa pra multiplicar com o preco depois e aplicar o desconto (ou o aumento)

        if(porcentagem > -100){
            temp = 1 + (porcentagem/100);
            preco = preco*temp;
            return 0;
        }
        else{
            return -1; // se der algum erro
        }

    }
}
