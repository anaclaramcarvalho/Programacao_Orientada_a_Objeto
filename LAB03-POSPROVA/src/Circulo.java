public class Circulo {
    private double raio;
    private  Ponto centro;

    public Circulo(double raio, Ponto p){
        this.raio = raio;
        centro = new Ponto(p.getX(),p.getY());
        this.centro = centro;
    }

    public void setCentro(Ponto p){
        centro.setX(p.getX());
        centro.setY(p.getY());
    }
    public Ponto getCentro(){
        return centro;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }


    @Override
    public String toString(){
        return "Circulo{" + "raio= " + raio + ", centro= " + centro + '}';
    }
}
