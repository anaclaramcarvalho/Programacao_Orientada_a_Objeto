import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EstudanteGraduacao [] estudanteG = new EstudanteGraduacao[3];
        EstudantePos [] estudanteP = new EstudantePos[3];
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.printf(" Cadastro do Estudante \n");
        System.out.printf("CPF: ");
        int cpf = sc.nextInt();
        sc.nextLine();
        System.out.printf("Nome: ");
        String nome = sc.nextLine();
        System.out.printf("Data de Nascimento: ");
        String datadenascimento = sc.nextLine();
        System.out.printf("CRA: ");
        double cra = sc.nextDouble();
        sc.nextLine();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Esse estudante é da graduação?(sim/não)");
        String resposta = sc.nextLine();
        if(resposta == "sim"){
            System.out.println("Fez estagio supervisionado?(sim/não)");
            boolean estagio = sc.nextBoolean();
            estudanteG[0] = new EstudanteGraduacao(cpf,nome,datadenascimento,cra,estagio);
        }else{
            System.out.println("Esse estudante é da pós graduação?(sim/não)");
            String resposta2 = sc.nextLine();
            if(resposta2 == "sim"){
                System.out.println("Tem tema de pesquisa?(sim/não)");
                boolean tema = sc.nextBoolean();
                estudanteP[0] = new EstudantePos(cpf,nome,datadenascimento,cra,tema);
            }
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}