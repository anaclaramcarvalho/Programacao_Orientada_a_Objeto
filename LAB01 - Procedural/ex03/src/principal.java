import java.util.Scanner;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);
    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner x = new Scanner(System.in);

        int[] array3 = new int[6];

        System.out.println("Escreva 6 números inteiros: ");

        for(int i = 0; i < 6; i++){
            array3[i] = x.nextInt();
        }

        System.out.println("Números digitados: ");
        for(int i = 0; i < 6; i++){
            System.out.printf(array3[i] + "|");
        }

        System.out.println("\n");

        System.out.println("Ordem inversa dos números digitados: " );
        for(int i = 5; i >= 1; i--){
            System.out.printf(array3[i] + "|");
        }
    }
    public static void ex04() {
        Scanner x = new Scanner(System.in);

        float[] array4 = new float[6];

        int c = 0;

        while(c < 6){
            System.out.println("Digite o " + (c + 1) + " número par: ");
            array4[c] = x.nextFloat();

            if(array4[c] % 2 != 0){
                System.out.println("Número inválido!");
            }
            else{
                c++;
            }
        }

        System.out.printf("Números pares digitados: " + "|");
        for(int i = 0; i < 6; i++){
            System.out.printf(array4[i] + "|");
        }
    }

    public static void ex05() {
        Scanner x = new Scanner(System.in);

        float[] array5 = new float[5];

        System.out.println("Digite 5 valores: ");
        for(int i = 0; i < 5; i++) {
            array5[i] = x.nextFloat();
        }

        System.out.printf("Números digitados: " + "|");
        for(int i = 0; i < 5; i++){
            System.out.printf(array5[i] + "|");
        }

        float ma = array5[0];

        for(int i = 1; i < 5; i++) {
            if(array5[i] > ma){
                ma = array5[i];
            }
        }

        System.out.println("\n");

        System.out.println("O maior número do vetor eh: " + ma);

        float me = array5[0];
        for(int i = 1; i < 5; i ++){
            if(array5[i] < me){
                me = array5[i];
            }
        }

        System.out.println("O menor número do vetor eh: " + me);
    }

    public static void ex06() {
        Scanner x = new Scanner(System.in);

        float[] array6 = new float[5];

        System.out.println("Digite 5 valores: ");
        for(int i = 0; i < 5; i++) {
            array6[i] = x.nextFloat();
        }

        System.out.printf("Números digitados: " + "|");
        for(int i = 0; i < 5; i++){
            System.out.printf(array6[i] + "|");
        }

        System.out.println("\n");

        float ma = array6[0];

        for(int i = 1; i < 5; i++) {
            if(array6[i] > ma){
                ma = array6[i];
            }
        }

        for(int i = 0; i < 5; i++){
            if(array6[i] == ma){
                System.out.println("O maior número do vetor eh: " + ma + " e sua posição no vetor eh [" + i + "]");
            }
        }
        float me = array6[0];

        for(int i = 1; i < 5; i ++){
            if(array6[i] < me){
                me = array6[i];
            }
        }

        for(int i = 0; i < 5; i++){
            if(array6[i] == me){
                System.out.println("O menor número do vetor eh: " + me + " e sua posição no vetor eh [" + i + "]");
            }
        }
    }
    public static void main(String[] args) {
        //ex01();
        ex02();
        //ex03();
    }


}
