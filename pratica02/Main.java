public class Main {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;//Chamada a atributo
        c1.tampada = false;
        c1.tampar();
       // c1.destampar();
        c1.rabiscar();
        c1.status();//Chamada a metodo

        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
