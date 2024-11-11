public class Main {
    public static void main(String[] args){
        System.out.println("Teste 1: Divisão válida");
        Opreracao op = new Opreracao(10,2);
        try {
            System.out.println(op.dividir(10,2));
        } catch (DivisaoPorZeroException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nTeste 2: Divisão por zero");
        try {
            op.iniciarOperacao(10, 0);
        } catch (DivisaoPorZeroException e) {
            throw new RuntimeException(e);
        }
    }
}