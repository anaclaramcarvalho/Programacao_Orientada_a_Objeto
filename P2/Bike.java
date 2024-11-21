import java.awt.print.PrinterException;

public class Bike extends VeiculosDuasRodas {
    private Marcha marcha;
    private String tipo;
    private double velocidadeBike;
    private double vmax;

    public Bike(String tipo,int numIdentificação,double velocidade, String fabricanteVeiculo, int numMaximo,String fabricante){
        super(numIdentificação, velocidade, fabricanteVeiculo);
        marcha = new Marcha(numMaximo,fabricante);
          this.velocidadeBike = velocidade;
          this.tipo = tipo;

    }
    public void setMarcha( int novoValor){
        int marcha_atual = marcha.getMarchaAtual();
        int dif = novoValor - marcha_atual;
        if(dif > 0){
            while(dif != 0){
                marcha.incrementa();
                dif--;
            }
        }else{
            while(dif != 0){
                marcha.decrementa();
                dif++;
            }
        }
    }

    public void frear(double decremento){
        velocidadeBike -= decremento;
    }

    public void imprimirDados(){
        System.out.println("\nBike está na marcha "
        + this.marcha.getMarchaAtual()
        + " e com velocidade de "
        + this.velocidadeBike + "km/h");
    }

    public void acelerar(double incremento){
        velocidadeBike += incremento;
    }

    public Marcha getMarcha() {
        return marcha;
    }
    public void setMarcha(Marcha marcha) {
        this.marcha = marcha;
    }
    public void enviarImpressora()throws PrinterException {
        Impressora p = new Impressora("HP Lasejet");
        p.imprimir(this);
    }
    public double getVelocidadeBike() {
        return velocidadeBike;
    }
    public void setVelocidadeBike(double velocidade) {
        this.velocidadeBike = velocidade;
    }

    public void setTipo(String tipo){
           this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }

    public double getVmax() {
        return vmax;
    }
    public void setVmax(double vmax) {
        this.vmax = vmax;
    }
}
