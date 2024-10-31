public class Tetraedro extends FormaTridimensional{
    private double lado;
    private double altura;

    public Tetraedro(double lado,double altura){
        this.lado = lado;
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double obterArea(){
        double A = (lado*lado)*Math.sqrt(3);
        return A;
    }

    @Override
    public double obterVolume(){
        double V = 0.0;
        V = (1/3)*obterArea()*altura;
        return V;
    }
    public String imprimeArea(){
        String r = " ";
        r += "A área do tetraedro é: " + obterArea();
        return r;
    }
    public String imprimeVolume(){
        String r = " ";
        r += "O volume do tetraedro é: " + obterVolume();
        return r;
    }
}
