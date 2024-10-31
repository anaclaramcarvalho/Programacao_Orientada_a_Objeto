public class Circulo extends FormaBidimensional{
    private double pi = 3.14;
    private double raio;

    public Circulo(double raio){
        this.pi = 3.14;
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }
    public void setPi(double pi) {
        this.pi = pi;
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double obterArea(){
        double A = 0.0;
        A = pi *(raio * raio);
        return A;
    }
    public String imprimeArea(){
        String r = " ";
        r += "A área do circulo é: " + obterArea();
        return r;
    }
}
