import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Forma[] f = new Forma[6];

        System.out.printf("--------------------------------------\n");
        System.out.printf("         ÁREA E VOLUMES\n");
        System.out.printf("--------------------------------------\n");
        System.out.printf("Digite o raio do circulo: ");
        double raio = sc.nextDouble();
        f[0] = new Circulo(raio);
        System.out.printf("%s",((Circulo)f[0]).imprimeArea());

        System.out.printf("\nDigite o lado do quadrado: ");
        double lado = sc.nextDouble();
        f[1] = new Quadrado(lado);
        System.out.printf("%s",((Quadrado)f[1]).imprimeArea());

        System.out.printf("\nDigite a base do triângulo: ");
        double base = sc.nextDouble();
        System.out.printf("Digite a altura do triângulo: ");
        double altura = sc.nextDouble();
        f[2] = new Triangulo(base,altura);
        System.out.printf("%s",((Triangulo)f[2]).imprimeArea());

        System.out.printf("\nDigite o raio da esfera: ");
        double raio2 = sc.nextDouble();
        f[3] = new Esfera(raio2);
        System.out.printf("%s",((Esfera)f[3]).imprimeArea());
        System.out.printf("\n%s",((Esfera)f[3]).imprimeVolume());

        System.out.printf("\nDigite o valor do lado do cubo: ");
        double lado2 = sc.nextDouble();
        f[4] = new Cubo(lado2);
        System.out.printf("%s",((Cubo)f[4]).imprimeArea());
        System.out.printf("\n%s",((Cubo)f[4]).imprimeVolume());

        System.out.printf("\nDigite o valor do lado do tetraedro: ");
        double ladot = sc.nextDouble();
        System.out.printf("Digite o valor da altura do tetraedro: ");
        double alturat = sc.nextDouble();
        f[5] = new Tetraedro(ladot,alturat);
        System.out.printf("%s",((Tetraedro)f[5]).imprimeArea());
        System.out.printf("\n%s",((Tetraedro)f[5]).imprimeVolume());
        System.out.printf("-----------------------------------------------\n");

    }
}