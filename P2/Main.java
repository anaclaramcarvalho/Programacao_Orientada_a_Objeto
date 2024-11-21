import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bike[] bike = new Bike[3];
        bike[0] = new Bike("Bike",232,3,"carol",2, "Microshif");
        bike[1] = new SpeedBike("Speed",578, 8, "Shimano", 2,"Zuzu",24);
        bike[2] = new MountainBike("Mountain",411,9,"Lele",3,  "SRAM", "ar");

        for (Bike bikes : bike) {
            bikes.imprimirDados();
        }

        for (Bike bikes : bike) {
            if (bikes instanceof SpeedBike) {
                System.out.printf("A espessura do pneu é %d", ((SpeedBike) bikes).getEspessuraPneu());
            }
        }

        //=====================================EX02->Cadastro de Veiculos de 2 rodas
        System.out.println("\nQuantos veiculos deseja cadastrar?");
        int n = sc.nextInt();
        VeiculosDuasRodas[] v = new VeiculosDuasRodas[n];
        for (int i = 0; i < v.length; i++) {
            System.out.println("Número de identificação: ");
            int numIdentificacao = sc.nextInt();
            System.out.println("Velocidade: ");
            float velocidade = sc.nextFloat();
            sc.nextLine();
            System.out.println("Fabricante do veiculo: ");
            String f = sc.nextLine();
        }

        //=============================================EX03->Lançar exceção
        Bike b = new SpeedBike("speed",578, 8, "Shimano", 2,"Zuzu",24);
        try{
            b.setMarcha(-1);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Error: " + e);
        }
        b.imprimirDados();

        //==========================================================EX04->Speedbike ordena
        Bike[] b2 = new Bike[3];
        b2[0] = new SpeedBike("speed",578, 8, "Shimano", 2,"Zuzu",24);
        b2[1] = new SpeedBike("speed",123, 7, "Shimano", 3,"Zuzu",25);
        b2[2] = new SpeedBike("speed",192, 8, "Shimano", 1,"Zuzu",23);
        // Ord.ordena(b2);
        for(Bike speedbike : b2){
            speedbike.enviarImpressora();
        }
    }
}