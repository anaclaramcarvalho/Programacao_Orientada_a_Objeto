import java.awt.print.PrinterException;

public class SpeedBike extends Bike implements Campeonato{
    private int espessuraPneu;

    public SpeedBike(String tipo,int numIdentificação,float velocidade, String fabricanteVeiculo,int numMaximo,String fabricante, int espessuraPneu){
        super(tipo,numIdentificação,velocidade,fabricanteVeiculo,numMaximo,fabricante);
        this.setEspessuraPneu(espessuraPneu);
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("A SpeedBike tem pneus de "
        + getEspessuraPneu() + "MM.");
    }

    public void enviarImpressora()throws PrinterException{
        Impressora p = new Impressora("HP Lasejet");
        p.imprimir(this);
    }

    public boolean eElegivel(){
        return espessuraPneu >= 23 && espessuraPneu <= 28;
    }

    public int compararVelocidades(Bike b1, Bike b2) {
        if (b1.getTipo().equals(b2.getTipo())) {
            return Double.compare(b1.getVelocidadeBike(), b2.getVelocidadeBike());
        } else {
            throw new OperacaoInvalidaException("As bicicletas devem ser do mesmo tipo");
        }
    }
    public int getEspessuraPneu() {
        return this.espessuraPneu;
    }

    public void setEspessuraPneu(int espessuraPneu) {
        this.espessuraPneu = espessuraPneu;
    }
}



