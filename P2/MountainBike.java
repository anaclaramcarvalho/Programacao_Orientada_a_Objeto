import java.awt.print.PrinterException;

public class MountainBike extends Bike implements Campeonato{
    private String tipoSuspensao;

    public MountainBike(String tipo ,int numIdentificação,float velocidade, String fabricanteVeiculo, int numMaximo,String fabricante,String tipoSuspensao){
        super(tipo,numIdentificação, velocidade, fabricanteVeiculo, numMaximo, fabricante);
        this.setTipoSuspensao(tipoSuspensao);
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("A MountainBike possui suspensão do tipo "
        + getTipoSuspensao());
    }

    public void enviarImpressora()throws PrinterException {
        Impressora p = new Impressora("HP Lasejet");
        p.imprimir(this);
    }

    public boolean eElegivel(){
        return getTipoSuspensao().equals("ar") && getTipoSuspensao().equals("oleo");
    }

    public int compararVelocidades(Bike b1, Bike b2) {
        if (b1.getTipo().equals(b2.getTipo())) {
            return Double.compare(b1.getVelocidadeBike(), b2.getVelocidadeBike());
        } else {
            throw new OperacaoInvalidaException("As bicicletas devem ser do mesmo tipo");
        }
    }

    public String getTipoSuspensao() {
        return this.tipoSuspensao;
    }

    public void setTipoSuspensao(String tipoSuspensao) {
        this.tipoSuspensao = tipoSuspensao;
    }
}
