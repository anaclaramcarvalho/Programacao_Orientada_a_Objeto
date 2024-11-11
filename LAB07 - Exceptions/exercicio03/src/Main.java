public class Main {
    public static void main(String[] args) {
        System.out.println("Qual a diferença entre o throw e throws ? Justifique explicado o que cada comando faz");
        System.out.printf("\n");
        System.out.println("Em Java, throw e throws são mecanismos distintos para lidar com exceções, que são eventos inesperados que podem ocorrer durante a execução de um programa.");
        System.out.printf("throw:\n" +
                "Lança uma exceção explicitamente." +
                "É usado dentro de um bloco de código para indicar que ocorreu um erro ou condição inesperada e que o fluxo normal do programa deve ser interrompido.\n");
        System.out.printf("\nthrows:\n" +
                "Declara que um método pode lançar uma exceção." +
                "É usado na assinatura do método, após a lista de parâmetros, para indicar quais exceções o método pode potencialmente lançar.\n");
        System.out.printf("=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=--=-=-=-=-=");
        System.out.println("\nIndique a diferença entre checked e uncheked exceptions.");
        System.out.printf("\n");
        System.out.printf("Em Java, as exceções são divididas em duas categorias principais: checked exceptions e unchecked exceptions. A principal diferença entre elas reside em como o compilador lida com elas.");
        System.out.printf("Checked Exceptions:\n" +
                "São exceções que o compilador força o programador a tratar. Ou seja, você precisa usar um bloco try-catch para lidar com essas exceções, ou declarar na assinatura do método que ele as lança (usando throws)." +
                "Geralmente representam erros que são externos ao seu código, como problemas de rede, erros de banco de dados ou arquivos não encontrados. O compilador as considera importantes o suficiente para exigir tratamento explícito, garantindo que seu código lidará com essas situações de forma segura.");
        System.out.printf("\nUnchecked Exceptions:\n" +
                "São exceções que o compilador não obriga você a tratar. Você pode ignorá-las, e o programa pode continuar a executar, embora geralmente isso resulte em comportamento inesperado ou até mesmo falhas." +
                "Motivo: Geralmente representam erros que são internos ao seu código, como tentar acessar um objeto nulo, acessar um índice inválido de um array, ou realizar uma divisão por zero. O compilador não as considera tão importantes quanto as checked exceptions, pois geralmente são causadas por erros de programação.");
        System.out.printf("Quando usar checked exceptions:\n" +
                "Quando a exceção for causada por um erro externo que pode ser resolvido pelo usuário, como um arquivo ausente ou uma conexão com o banco de dados interrompida." +
                "Quando você quer garantir que o usuário seja notificado sobre um erro e tenha a chance de tomar uma ação." +
                "\n" +
                "Quando usar unchecked exceptions:\n" +
                "Quando a exceção for causada por um erro de programação que não pode ser facilmente previsto, como acessar um índice inválido de um array." +
                "Quando você quer que o programa termine abruptamente se uma condição de erro for encontrada.\n" +
                "\n");
        System.out.printf("=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=--=-=-=-=-=");
    }
}