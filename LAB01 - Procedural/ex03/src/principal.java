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
    public static void ex07() {
        Scanner x = new Scanner(System.in);

        float[] array7 = new float[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
            array7[i] = x.nextFloat();

            if(array7[i] > 50){
                System.out.println("Nota inválida!");
                i--;
            }
        }

        for(int i = 0; i < 5; i++){
            System.out.println("Nota do aluno " + (i + 1) + ": " + array7[i]);
        }

        for(int i = 0; i < 5; i++){
            array7[i] *= 2;
        }

        System.out.println("Nota dos alunos depois da normalização: ");
        for(int i = 0; i < 5; i++){
            System.out.println("\nNota do aluno " + (i + 1) + ": " + array7[i]);
        }
    }
    public static void ex08() {
        Scanner x = new Scanner(System.in);

        float[] array8 = new float[5];

        System.out.println("Digite 5 valores: ");

        for(int i = 0; i < 5; i++){
            array8[i] = x.nextFloat();
        }

        float media = 0;

        for(int i = 0; i < 5; i++){
            media += array8[i];
        }

        media = media / 5;

        System.out.println("\nO valor da média é: " + media);

        float dp = 0;

        for(int i = 0; i < 5; i++){
            dp += (float) Math.pow(array8[i] - media, 2);
        }

        dp = dp / (5 - 1);

        dp = (float) Math.sqrt(dp);
        System.out.println("\nO valor do desvio padrão é: " + dp);
    }
    public static void ex09() {
        Scanner x = new Scanner(System.in);

        int n = 0;
        float s = 0;
        int c = 0;

        while(c < 1) {
            System.out.println("Digite o número de alunos de uma classe: ");
            n = x.nextInt();

            if (n > 100) {
                System.out.println("\nDigite um número de alunos menor do que 100!");
            }
            else{
                c++;
            }
        }
        float[] array9 = new float[n];

        System.out.println("Digite as notas de cada aluno: ");
        for(int i = 0; i < n; i++){
            System.out.printf("Aluno " + (i + 1) + ": ");
            array9[i] = x.nextFloat();
        }

        System.out.println("\n");

        for(int i = 0; i < n; i++){
            System.out.println("A nota do aluno " + (i + 1) + " eh: " + array9[i]);
            s += array9[i];
        }

        System.out.printf("\n");

        s = s / n;

        System.out.println("A média das notas eh: " + s);
    }
    public static void ex10() {
        Scanner x = new Scanner(System.in);

        int[] array10 = new int[3];
        int[] array10s = new int[3];
        int[] array10t = new int[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Digite um valor para a posição " + i + " do vetor A: ");
            array10[i] = x.nextInt();
            System.out.println("Digite um valor para a posição " + i + " do vetor B: ");
            array10s[i] = x.nextInt();

            System.out.println();

            array10t[i] = 0;

            array10t[i] = array10[i] - array10s[i];
        }
        System.out.printf("Array A: " + "|");
        for(int i = 0; i < 3; i++){
            System.out.printf(array10[i] + "|");
        }
        System.out.println("\n");

        System.out.printf("Array B: " + "|");
        for(int i = 0; i < 3; i++){
            System.out.printf(array10s[i] + "|");
        }
        System.out.println("\n");

        System.out.println("O vetor C, definido como A-B eh: ");
        System.out.printf("Array C: " + "|");
        for(int i = 0; i < 3; i++){
            System.out.printf(array10t[i] + "|");
        }
        System.out.println("\n");
    }
    public static void ex11() {
        Scanner x = new Scanner(System.in);

        int[] v = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o " + i + " para o vetor V: ");
            v[i] = x.nextInt();
        }

        int[] v1 = new int[5];
        int[] v2 = new int[5];

        int c1 = 0, c2 = 0;

        for(int i = 0; i < 5; i++){
            if(v[i] % 2 == 0){
                v1[i] = v[i];
                //c1++;
            }
            else{
                v2[i] = v[i];
                //c2++;
            }
        }
        System.out.printf("Array V: " + "|");
        for(int i = 0; i < 5; i++){
            System.out.printf(v[i] + "|");
        }
        System.out.println("\n");

        System.out.printf("Array V1: " + "|");
        for(int i = 0; i < 5; i++){
            if((v1[i] % 2 == 0) && (v1[i] != 0)){
                System.out.printf(v1[i] + "|");
            }
        }
        System.out.println("\n");

        System.out.printf("Array V2: " + "|");
        for(int i = 0; i < 5; i++){
            if(v2[i] % 2 != 0) {
                System.out.printf(v2[i] + "|");
            }
        }
        System.out.println("\n");
    }
    public static void ex12() {
        Scanner x = new Scanner(System.in);

        int[] array12 = new int[4];
        int c = 0;
        int s = 0;
        float me = 0;

        System.out.println("Informe a quantidade de bolinhas numa piscina por cor\n");
        for(int i = 0; i < 4; i++){
            if(c == 0) {
                System.out.println("Digite a quantidade de bolinhas verdes: ");
                array12[i] = x.nextInt();
            }
            if(c == 1) {
                System.out.println("Digite a quantidade de bolinhas azuis: ");
                array12[i] = x.nextInt();
            }
            if(c == 2) {
                System.out.println("Digite a quantidade de bolinhas vermelhas: ");
                array12[i] = x.nextInt();
            }
            if(c == 3) {
                System.out.println("Digite a quantidade de bolinhas amarelas: ");
                array12[i] = x.nextInt();
            }

            c++;
            s += array12[i];
        }

        c = 0;

        int ma = array12[0];

        for(int i = 1; i < 4; i++){
            if(array12[i] > ma){
                ma = array12[i];
            }
        }

        for(int i = 0; i < 4; i++){
            if(c == 0) {
                System.out.println("\nPercentual de bolinhas verdes: " + (me = (float) array12[i] / s));

                if(array12[i] == ma){
                    System.out.println("Verdes tem maior probabilidade");
                }
            }
            if(c == 1) {
                System.out.println("\nPercentual de bolinhas azuis: " + (me = (float) array12[i] / s));

                if(array12[i] == ma){
                    System.out.println("Azuis tem maior probabilidade");
                }
            }
            if(c == 2) {
                System.out.println("\nPercentual de bolinhas vermelhas: " + (me = (float) array12[i] / s));

                if(array12[i] == ma){
                    System.out.println("Vermelhas tem maior probabilidade");
                }
            }
            if(c == 3) {
                System.out.println("\nPercentual de bolinhas amarelas: " + (me = (float) array12[i] / s));

                if(array12[i] == ma){
                    System.out.println("Amarelas tem maior probabilidade");
                }
            }

            c++;
            me = 0;
        }
    }
    public static void ex13() {
        Scanner x = new Scanner(System.in);

        int[] array13 = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o " + i + " de um vetor: ");
            array13[i] = x.nextInt();
        }

        for(int i = 0; i < 5; i++){
            if(array13[i] < 0){
                array13[i] = 0;
            }
        }

        System.out.printf("\nArray sem o(s) elementos negativos: " + "|");
        for(int i = 0; i < 5; i++){
            System.out.printf(array13[i] + "|");
        }
    }

    public static void ex14() {
        Scanner x = new Scanner(System.in);

        System.out.println("Universidade Federal de Uberlândia\n");

        int n = 0;
        boolean b = true;

        while(b){
            System.out.println("Digite quantas alunos você deseja cadastrar: ");
            n = x.nextInt();

            if(n > 10000){
                System.out.println("Número de alunos excedido! Máx.: 10.000\n");
            }
            else if(n <= 0){
                System.out.println("Número de alunos insuficientes! Mín.: 1\n");
            }
            else{
                b = false;
            }
        }

        System.out.println();

        int[] numeroM = new int[n];
        char[] classeS = new char[n];
        double[] cras = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite o número da mátricula do aluno " + (i + 1) + ": ");
            numeroM[i] = x.nextInt();
            System.out.println("Digite a classe social do aluno " + (i + 1) + ": ");
            classeS[i] = x.next().charAt(0);
            System.out.println("Digite o CRA do aluno " + (i + 1) + ": ");
            cras[i] = x.nextDouble();

            System.out.println();
        }

        System.out.println("\n--Alunos Cadastrados--\n");

        for(int i = 0; i < n; i++){
            System.out.println("Matrícula do aluno " + (i + 1) + ": " + numeroM[i]);
            System.out.println("Classe social " + (i + 1) + ": " + classeS[i]);
            System.out.println("CRA " + (i + 1) + ": " + cras[i]);
        }
    }

    public static void ex15() {
        Scanner x = new Scanner(System.in);

        int[] array15 = new int[8];
        int[] array15s = new int[8];

        for(int i = 0; i < 8; i++){
            System.out.println("Digite o " + (i + 1) + " valor do vetor: ");
            array15[i] = x.nextInt();
            array15s[i] = 0;
        }

        for (int i = 0; i < 8; i++) {
            int valor = array15[i];
            boolean b = false;

            for (int j = 0; j < i; j++) {
                if (array15[j] == valor) {
                    b = true;
                    break;
                }
            }

            if (!b) {
                for (int j = i + 1; j < 8; j++) {
                    if (array15[j] == valor) {
                        array15s[i] = valor;
                        break;
                    }
                }
            }
        }

        System.out.printf("\nElementos repetidos no array: " + "|");
        for(int i = 0; i < 8; i++){
            if(array15s[i] != 0){
                System.out.printf(array15s[i] + "|");
            }
        }
    }

    public static void ex16() {
        Scanner x = new Scanner(System.in);

        int[] array16 = new int[8];

        for(int i = 0; i < 8; i++){
            System.out.println("Digite o valor da posicao " + i + " vetor: ");
            array16[i] = x.nextInt();
        }

        for(int i = 0; i < 8; i++){
            int valorA = array16[i];
            int c = 0;

            for(int j = 0; j < 8; j++){
                if(array16[j] == valorA){
                    c++;
                }
            }

            if (c > 1){
                System.out.println("O valor " + valorA + " aparece " + c + " vezes!");
            }
        }
    }


    public static void main(String[] args){
        //ex01();
        //ex02();
        //ex03();
        //ex04();
        //ex05();
        //ex06();
        //ex07();
        //ex08();
        //ex09();
        //ex10();
        //ex11();
        //ex12();
        //ex13();
        //ex14();
        //ex15();
        ex16();
    }


}