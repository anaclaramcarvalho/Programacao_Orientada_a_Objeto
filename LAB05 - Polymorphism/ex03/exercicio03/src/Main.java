import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante [] estudante = new Estudante[3];

        estudante[0] = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        estudante[1] = new EstudanteMestrado("Carla","Rua Primavera","Medicina", "Vacinas de RNA", "academico","Anticorpos");
        estudante[2] = new EstudanteDoutorado("Bruno","Rua Inverno", "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        int g = 0,m = 0,d = 0;
        System.out.printf("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-\n");
        //LETRA A
        for (Estudante i : estudante){
            i.print();
            if (i instanceof EstudanteGraduacao){
                System.out.println("\n");
                ((EstudanteGraduacao) i).getTituloTCC();
                g++;
            }
            if (i instanceof EstudanteMestrado){
                System.out.println("\n");
                ((EstudanteMestrado) i).getTipo();
                ((EstudanteMestrado) i).getTituloDissertacao();
                m++;
            }
            if (i instanceof EstudanteDoutorado){
                System.out.println("\n");
                ((EstudanteDoutorado) i).getTituloTese();
                d++;
            }
        }
        System.out.printf("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-");
        System.out.printf("\n");
        System.out.printf("A quantidade de estudantes de graduação cadastrados é: %d", g);
        System.out.printf("\nA quantidade de estudantes de mestrado cadastrados é: %d", m);
        System.out.printf("\nA quantidade de estudantes de doutorado cadastrados é: %d", d);
        System.out.printf("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-");
        //LETRA B
        System.out.printf("\n");
        for(Estudante i : estudante) {
            System.out.println(i.getNome());
            if(i instanceof EstudanteDoutorado){
                System.out.printf("O titulo da tese é ");
                System.out.println(((EstudanteDoutorado)i).getTituloTese());
                System.out.printf("A linha de pesquisa é ");
                System.out.println(((EstudanteDoutorado)i).getLinhaDePesquisa());
            }
        }
        System.out.printf("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-");
        //LETRA C
        System.out.println("\n");
        Estudante[] estupos = new Estudante[2];
        int j = 0;
        for(Estudante i : estudante){
            if(i instanceof EstudantePosGrad){
                estupos[j] = (EstudantePosGrad)i;
                j++;
            }
        }
        for(int i = 0; i < estupos.length;i++){
            estupos[i].print();
            System.out.println("\n");
        }
        System.out.printf("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-");
        //LETRA D
        System.out.println("\n");
        estudante[0].print(true);
        System.out.println("\n");
        estudante[0].print(false);
        System.out.println("\n");
        estudante[1].print(true);
        System.out.println("\n");
        estudante[1].print(false);
        System.out.println("\n");
        estudante[2].print(true);
        System.out.println("\n");
        estudante[2].print(false);
        System.out.printf("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-");
        //LETRA E
        System.out.println("Referente ao exercício anterior, é possível utilizar o recém criado método print(boolean) em um polimorfismo tendo como base um vetor da classe Estudante?");
        System.out.println("Sim é possivel.");
        System.out.printf("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-");
    }
}