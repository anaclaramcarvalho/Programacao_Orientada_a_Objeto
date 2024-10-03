public class Main {
    public static void main(String[] args){
        Ponto p = new Ponto (2.5,4.5);
        Ponto p2 = new Ponto(5.5,4.5);//poderia ser qualquer valor
        System.out.println(p);

        System.out.printf("Circulo 01\n");
        Circulo c = new Circulo(1.0 ,p);
        System.out.println(c);
        System.out.printf("Circulo 02\n");
        Circulo c2 = new Circulo(1.5,p2);

        p.setX(0.0);//altera o valor de X , colocando todos os centros com o novo valor de X, pois ambos apontam para o mesmo lugar
        System.out.println(c);
        System.out.println(c2);

        //quando usava uma cordenada para 2 circulo , porém não era tão bom pois se voce quiser alterar o valor de um , muda o outro tbm
        //Quando você quer criar o ponto dentro do construtor de circulo
        System.out.printf("Circulo 03\n");
        Circulo c3 = new Circulo(3.0,p);
        System.out.println(c3);
    }
}