import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         Jogador j = new Jogador("Duda", 19,1.72,65);
         Jogador j2= new Jogador("Ana Patricia", 22,1.86,75);
         Jogador j3 = new Jogador("Gabriela",20,1.80,70);
        //System.out.printf("\n%s",j.imprimeJogador());
        // System.out.printf("\n%s",j2.imprimeJogador());
       // System.out.printf("\n%s",j3.imprimeJogador());

    Time t = new Time("Praia Clube",j,j2,j3);
        System.out.printf("\n%s\n", t.imprimetime());
        System.out.printf("\nA média das idades das jogadoras e da substituta é  %.2f.", t.media());

    int n = 0;
        System.out.printf("\nQuantos times deseja cadastrar? ");
        n = sc.nextInt();
        sc.nextLine();

    Time[] times = new Time[n];
    for(int i = 0;i < n;i++){
        System.out.printf("Nome do time: ");
        String nome = sc.nextLine();

        System.out.printf("Nome da titular: ");
        String titular = sc.nextLine();
        System.out.printf("Idade da titular: ");
        int i1 = sc.nextInt();
        System.out.printf("Altura da titular: ");
        double a1 = sc.nextDouble();
        System.out.printf("Peso da titular: ");
        double p1 = sc.nextDouble();
        Jogador a = new Jogador(titular,i1,a1,p1);
        sc.nextLine();

        System.out.printf("Nome da titular: ");
        String titular2 = sc.nextLine();
        System.out.printf("Idade da titular: ");
        int i2 = sc.nextInt();
        System.out.printf("Altura da titular: ");
        double a2 = sc.nextDouble();
        System.out.printf("Peso da titular: ");
        double p2 = sc.nextDouble();
        Jogador b = new Jogador(titular2, i2,a2,p2);
        sc.nextLine();

        System.out.printf("Esse time tem substituto? (sim/nao)");
        String resposta = sc.nextLine();
        if(resposta.equals("sim")) {
            System.out.printf("Nome da substituta: ");
            String substituta = sc.nextLine();
            System.out.printf("Idade da substituta: ");
            int i3 = sc.nextInt();
            System.out.printf("Altura da substituta: ");
            double a3 = sc.nextDouble();
            System.out.printf("Peso da substituta: ");
            double p3 = sc.nextDouble();
            Jogador c = new Jogador(substituta,i3,a3,p3);
            times[i] = new Time(nome,a,b,c);
            sc.nextLine();
        } else {
            times[i] = new Time(nome,a,b);
        }
    }
    System.out.printf("_________________________________________________________________");
    for(int i = 0; i < n;i++){
        System.out.printf("\n%s",times[i].imprimetime());
    }
    System.out.println();
    System.out.printf("_________________________________________________________________");

    float maiormedia = 0;
    int num = 0;
    for(int i = 0; i < n; i++){
        if(maiormedia < times[i].media()){
            maiormedia = times[i].media();
            num = i;
        }
    }
        System.out.printf("\nA maior média é %.2f do time: %s",times[num].media(), times[num].imprimetime());

    for(int i = 0;i < n; i++){
        times[i] = null;
     }
        System.out.println("Todos os times foram removidos.");
    }
}