import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do candidato: ");
        String nome = sc.nextLine();
        System.out.println("Digite a data de nascimento: ");
        String data = sc.nextLine();
        System.out.println("Digite o genero: ");
        String genero = sc.nextLine();
        System.out.println("Digite a quantidade de bens: ");
        double bens = sc.nextDouble();
        System.out.println("O candidato está se reelegendo?(sim/nao)");
        boolean reeleicao = sc.nextBoolean();
        System.out.println("Digite o número: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do vice: ");
        String nomevice = sc.nextLine();
        System.out.println("Digite o partido: ");
        String partido = sc.nextLine();

        System.out.println("\nO candidato a prefeito é :");
        CandidatoPrefeito candidato = new CandidatoPrefeito(nome,data,genero,bens,reeleicao,num,nomevice,partido);
        System.out.printf("%s", candidato.imprimirCandidatos());

        System.out.println("Digite o nome do candidato: ");
        String nomeV = sc.nextLine();
        System.out.println("Digite a data de nascimento: ");
        String dataV = sc.nextLine();
        System.out.println("Digite o genero: ");
        String generoV = sc.nextLine();
        System.out.println("Digite a quantidade de bens: ");
        double beensV = sc.nextDouble();
        System.out.println("O candidato está se reelegendo?(sim/nao)");
        boolean reeleicaoV = sc.nextBoolean();
        System.out.println("Digite o número do partido: ");
        int numpartidoV = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o bairro onde reside o candidato: ");
        String bairroV = sc.nextLine();
        System.out.println("Digite o numero do candidato:");
        int numV = sc.nextInt();

        System.out.println("\nO candidato a vereador é: ");
        CandidatoVereador candidatoV = new CandidatoVereador(nomeV,dataV,generoV,beensV,reeleicaoV,numpartidoV,bairroV,numV);
        System.out.printf("%s", candidatoV.imprimevereador());
    }
}