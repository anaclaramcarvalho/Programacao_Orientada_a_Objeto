public class Main {
    public static void main(String[] args) {
        Estudante [] estudante = new Estudante[3];

        estudante[0] = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        estudante[1] = new EstudanteMestrado("Carla","Rua Primavera","Medicina", "Vacinas de RNA", "academico","Anticorpos");
        estudante[2] = new EstudanteDoutorado("Bruno","Rua Inverno", "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        int g = 0,m = 0,d = 0;
        System.out.printf("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-\n");
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


    }
}