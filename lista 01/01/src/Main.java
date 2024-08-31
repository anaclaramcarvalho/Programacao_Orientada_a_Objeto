import java.sql.SQLOutput;
import  java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int v1, v2, v3, v4, v5, v6;

        System.out.println("<< Listando um vetor >>");
        System.out.printf("Entre com o número 1:");
        v1 = sc.nextInt();
        System.out.printf("Entre com o número 2:");
        v2 = sc.nextInt();
        System.out.printf("Entre com o número 3:");
        v3 = sc.nextInt();
        System.out.printf("Entre com o número 4:");
        v4 = sc.nextInt();
        System.out.printf("Entre com o número 5:");
        v5 = sc.nextInt();
        System.out.printf("Entre com o número 6:");
        v6 = sc.nextInt();

        System.out.printf("Os valores lidos são:");
        System.out.printf("%d,%d,%d,%d,%d,%d", v1,v2,v3,v4,v5,v6);

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        int i;
        for(i = 0; i < 6;i++){
            System.out.printf("Entre com o número %d: ", i+1);
            vet[i] = sc.nextInt();
        }

        System.out.printf("Os valores lidos são: ");
        for(i = 0;i < 6;i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor em ordem inversa >>");

        int i;
        for(i = 0; i < 6 ;i++){
            System.out.printf("Entre com o número %d: ", i+1);
            vet[i] = sc.nextInt();
        }

        System.out.printf("A ordem inversa dos números é: ");
        for(i = 5;i >= 0;i--){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex04(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        int cont = 0;
        int num;
        System.out.println("<< Listando um vetor de números pares >>");

        while (cont < 6){
            System.out.printf("Entre com o número %d: ", cont+1);
            num = sc.nextInt();
            if (num >= 0 && num % 2 == 0){
                vet[cont] = num;
                cont++;
            }else{
                System.out.println("Erro: Valor inválido");
            }
        }
        System.out.println("\nOs números pares digitados foram:");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }

    }

    public static void ex05(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int i;
        double media = 0;
        int soma = 0;

        System.out.println("<< 5 valores >>");
        for(i = 0;i < 5; i++){
            System.out.printf("Entre com o número %d: ",i + 1);
            vet[i] = sc.nextInt();
            }
        int menor = vet[0];
        int maior = vet[0];
        System.out.printf("Os números digitados são: ");
        for(i = 0;i < 5;i++){
            System.out.printf("%d ",vet[i]);
            if(vet[i] > maior){
                maior = vet[i];
            }
            if(vet[i] < menor){
                menor = vet[i];
            }
            soma+=vet[i];
        }
        System.out.printf("\nO maior valor é %d.\n",maior);
        System.out.printf("O menor valor é %d.\n", menor);
        media = soma/5.0;
        System.out.printf("A média é %.2f.\n",media);
    }

    public static void ex06(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int i, a = 0,b = 0;
        double media = 0;
        int soma = 0;

        System.out.println("<< 5 valores >>");
        for(i = 0;i < 5; i++){
            System.out.printf("Entre com o número %d: ",i + 1);
            vet[i] = sc.nextInt();
        }
        int menor = vet[0];
        int maior = vet[0];
        System.out.printf("Os números digitados são: ");
        for(i = 0;i < 5;i++){
            System.out.printf("%d ",vet[i]);
            if(vet[i] > maior){
                maior = vet[i];
                a = i;
            }
            if(vet[i] < menor){
                menor = vet[i];
                b = i;
            }
            soma+=vet[i];
        }
        System.out.printf("\nO maior valor é %d, localizado na posição %d do vetor.\n",maior,a);
        System.out.printf("O menor valor é %d, localizado na posição %d do vetor.\n", menor,b);

    }

    public static void ex07(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int i;
        double n;

        System.out.println("<< Normalizando as notas >>");
        for( i = 0;i < 5;i++){
            System.out.printf("Entre com a nota do aluno %d: ",i+1);
            vet[i] = sc.nextInt();
        }
        int maior = vet[0];
        for(i = 0;i < 5;i++){
            if(vet[i] > maior){
                maior = vet[i];
            }
        }
        n = 100/maior;
        System.out.println("Notas normalizadas ");
        for(i = 0;i < 5;i++) {
            System.out.printf("A nota do aluno %d é %.2f.\n", i +1, vet[i] * n);
        }
 }

    public static void ex08(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int i;
        double media = 0,desvio = 0;
        int soma = 0;

        System.out.println("<< Média e desvio-padrão >>");
        for(i = 0;i < 5;i++){
            System.out.printf("Digite o valor %d: ", i+1);
            vet[i] = sc.nextInt();
            soma+=vet[i];
        }

        media = soma/5.0;
        System.out.printf("A média é %.2f ",media);
        int r ;
        double somad = 0;
        for(r = 0;r < 5;r++){
            somad += Math.pow((vet[r] - media),2);
        }
        desvio = Math.sqrt(somad/4);
        System.out.printf(" e o desvio- padrão é %f.", desvio);
    }

    public static void ex09(){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("<< Média dos alunos >>");
        System.out.println("MÁXIMO 100 ALUNOS");
        System.out.printf("Entre com o número de alunos: ");
        num = sc.nextInt();
        int[] vet = new int[num];
        int i, soma = 0;
        double media = 0;
        for(i = 0;i < num;i++){
            System.out.printf("Digite a nota do aluno %d: ", i+1);
            vet[i] = sc.nextInt();
        }
        System.out.println("Relatório de Notas");
        for(i = 0;i < num; i++){
            System.out.printf("A nota do aluno %d: %d\n",i,vet[i]);
            soma += vet[i];
        }
        media = soma/(double)num;
        System.out.printf("A média da turma é %.2f.",media);
    }

    public static void ex10(){
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        int [] B = new int[3];
        int i;

        System.out.println("<< Subtração de vetores >>");
        for(i = 0;i < 3;i++) {
            System.out.printf("Digite o valor %d de A: ",i+1);
            A[i] = sc.nextInt();
        }
        for(i = 0;i < 3;i++) {
            System.out.printf("Digite o valor %d de B: ",i+1);
            B[i] = sc.nextInt();
        }

        int[] C = new int[3];
        for(i = 0 ;i < 3;i++){
            C[i] = A[i] - B[i];
        }
        System.out.printf("O vetor C, definido como C = A - B é (");
        for(i = 0;i < 3;i++) {
            System.out.printf(" %d ", C[i]);
        }
        System.out.printf(").");
    }

    public static void ex11(){
        Scanner sc = new Scanner(System.in);
        int [] V = new int[5];
        int i;
        System.out.println("<< Pares e Ìmpares >>");
        for(i = 0;i < 5;i++){
            System.out.printf("Digite o valor %d: ", i+1);
            V[i] = sc.nextInt();
        }
        int[] V1 = new int[5];
        int[] V2 = new int[5];
        int p = 0, a = 0;
        for(i = 0;i < 5;i++){
            if(V[i]%2 != 0){
                V1[a] = V[i];
                a++;
            }else{
                V2[p] = V[i];
                p++;
            }
        }
        System.out.printf("Ímpares:");
        for(int k= 0;k < a;k++) {
            System.out.printf(" %d ", V1[k]);
        }
        System.out.println(" ");
        System.out.printf("Pares:");
        for(int k = 0;k < p;k++){
            System.out.printf(" %d ",V2[k]);
        }
    }

    public static void ex12() {
        Scanner sc = new Scanner(System.in);
        int Verde = 0, Azul = 0, Amarelo = 0, Vermelho = 0;
        System.out.println("<< Probabilidade >>");
        System.out.println("Digite a quantidade de bolinhas");
        System.out.printf("Verdes:");
        Verde = sc.nextInt();
        System.out.printf("Azul:");
        Azul = sc.nextInt();
        System.out.printf("Amarela:");
        Amarelo = sc.nextInt();
        System.out.printf("Vermelha:");
        Vermelho = sc.nextInt();

        int total = 0;
        total = Verde+Azul+Amarelo+Vermelho;
        float v = 0,a = 0,am = 0,vm = 0;
        v = (Verde*100)/(float)total;
        a = (Azul*100)/(float)total;
        am = (Amarelo*100)/(float)total;
        vm = (Vermelho*100)/(float)total;

        float maior = v;
        if(maior < a){
            maior = a;
        }
        if(maior < am){
            maior = am;
        }
        if(vm > maior){
            maior = vm;
        }
        System.out.println("\nProbabilidade");
        if(maior == v) {
            System.out.printf("Verde: %.1f <<Maior probabilidade",v);
        }else {
            System.out.printf("Verde: %.1f", v);
        }
        if(maior == a){
            System.out.printf("\nAzul: %.1f <<Maior probabilidade",a);
        }else {
            System.out.printf("\nAzul: %.1f", a);
        }
        if(maior == am) {
            System.out.printf("\nAmarelo: %.1f <<Maior probabilidade", am);
        }else {
            System.out.printf("\nAmarelo: %.1f", am);

        }
        if(maior == vm){
            System.out.printf("\nVermelha: %.1f <<Maior probabilidade", vm);
        }else{
            System.out.printf("\nVermelha: %.1f", vm);
        }
    }

    public static void ex13(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int i;
        System.out.println("<<Zerando negativos>>");
        for ( i = 0;i < 5;i++){
            System.out.printf("Entre com o número %d: ",i+1);
            vet[i] = sc.nextInt();
        }
        for(i = 0;i < 5;i++){
            if(vet[i] < 0){
                vet[i] = 0;
            }
        }
        System.out.println("Zerando os negativos, obtém-se:");
        for(i = 0;i < 5;i++){
            System.out.printf(" %d ",vet[i]);
        }
    }

    public static void ex14(){
        Scanner sc = new Scanner(System.in);
        int qtdalunos = 0;
        int numerodoaluno = 0;
        double cra = 0;
        char letra = ' ';
        int i;

        System.out.println("<< Universidade X >>");
        do{
            System.out.printf("Quantos alunos serão cadastrados: ");
            qtdalunos = sc.nextInt();
        }while(qtdalunos > 10000); // Vai perguntar primeiro e depois ver...ex (vc digitou 5, 5 é maior que 10000? NAO,então sai );
        Aluno[] vet = new Aluno[qtdalunos];
        for(i = 0;i < qtdalunos;i++){
            Aluno a = new Aluno();
            System.out.printf("Entre com o número do aluno: ");
            numerodoaluno = sc.nextInt();
            a.numerodoaluno = numerodoaluno;
            System.out.printf("Entre com a classe social do aluno %d:",numerodoaluno);
            letra = sc.next().charAt(0);
            a.letra = letra;
            System.out.printf("Entre com o CRA do aluno %d:", numerodoaluno);
            cra = sc.nextDouble();
            a.cra = cra;
            vet[i] = a;
        }
        System.out.println(" ");
        System.out.println("============ALUNOS CADASTRADOS===========");
        for(i = 0;i < qtdalunos;i++){
            System.out.printf("Número: %d Classe social: %c CRA: %.2f.\n",vet[i].numerodoaluno,vet[i].letra,vet[i].cra);
        }

    }

    public static void ex15(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[8];
        int i,j,k;

        System.out.println("<< Valores iguais >>");
        for(i = 0;i < 8;i++){
            System.out.printf("Entre com o %d número: ", i+1);
            vet[i] = sc.nextInt();
        }

        int[] iguais = new int[8];
        boolean[] marcado = new boolean[8];
        for(i = 0, k = 0;i < 8;i++){
            if (!marcado[i]){
                for (j = i + 1; j < 8; j++){
                    if (vet[i] == vet[j]){
                        iguais[k] = vet[i];
                        k++;
                        marcado[j] = true;
                        break;
                    }
                }
            }
        }
        System.out.printf("Valores repetidos: ");
        for(i = 0;i < k;i++) {
            System.out.printf(" %d ",iguais[i]);
        }
    }

    public static void ex16(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[8];
        int[] cont = new int[8];
        int i,j,k;

        System.out.println("<< Valores iguais >>");
        for(i = 0;i < 8;i++){
            System.out.printf("Entre com o %d número: ", i+1);
            vet[i] = sc.nextInt();
        }
        int[] iguais = new int[8];
        boolean[] marcado = new boolean[8];
        for(i = 0, k = 0;i < 8;i++){
            if (!marcado[i]){
                for (j = i + 1; j < 8; j++){
                    if (vet[i] == vet[j]){
                        iguais[k] = vet[i];
                        cont[k] += 1;
                        k++;
                        marcado[j] = true;
                    }
                }
            }
        }
        System.out.printf("Valores repetidos: ");
        for(i = 0;i < k;i++){
            System.out.printf(" %d aparece %d vezes. ", iguais[i],cont[i]+1);
        }
    }


    public static void main(String[] args) {
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