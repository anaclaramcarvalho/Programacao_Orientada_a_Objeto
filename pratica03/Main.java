public class Main {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Preto";
        c1.carga = 80;
        //c1.tampada = true;
        c1.destampar();
        c1.tampar();
        c1.status();
    }
}