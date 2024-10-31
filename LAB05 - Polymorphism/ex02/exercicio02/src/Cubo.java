public class Cubo extends FormaTridimensional{
    private double lado;

    public Cubo(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea(){
        double A = 0.0;
        A = 6*(lado*lado);
        return A;
    }

    @Override
    public double obterVolume(){
        double V = 0.0;
        V = lado*lado*lado;
        return V;
    }
    public String imprimeArea(){
        String r = " ";
        r += "A área do cubo é: " + obterArea();
        return r;
    }
    public String imprimeVolume(){
        String r = " ";
        r += "O volume do cubo é: " + obterVolume();
        return r;
    }
}
