public class Esfera extends FormaTridimensional{
    private double pi = 3.14;
    private double raio;

    public Esfera(double raio){
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
        A = 4*pi*(raio*raio);
        return A;
    }

    @Override
    public double obterVolume(){
        double V = 0.0;
        V = (4/3)*pi*(raio*raio*raio);
        return V;
    }
    public String imprimeArea(){
        String r = " ";
        r += "A área da esfera é: " + obterArea();
        return r;
    }
    public String imprimeVolume(){
        String r = " ";
        r += "O volume da esfera é: " + obterVolume();
        return r;
    }
}
