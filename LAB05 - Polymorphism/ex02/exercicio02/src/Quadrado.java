public class Quadrado extends FormaBidimensional{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        double A = 0.0;
        A = lado * lado;
        return A;
    }

    @Override
    public String imprimeArea() {
        String r = " ";
        r += "A área do quadrado é: " + obterArea();
        return r;
    }
}
