public class Main {
    public static void main(String[] args){
        Caneta c1 = new Caneta("NIC", "Amarela",0.4f);
        c1.status();
        System.out.println("\n");
        c1.setModelo("BIC");
        c1.modelo = "BIC";
        c1.setPonta(0.5f);//Como é privado precisa usar set, não pode acessae diretamente
        c1.status();

        System.out.println("Tenho uma caneta " + c1.getModelo());
    }
}
