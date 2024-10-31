public class Triangulo extends FormaBidimensional{
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double obterArea(){
        double A = 0.0;
        A = base * altura;
        return A;
    }

    @Override
    public String imprimeArea(){
        String r = " ";
        r += "A área do triângulo é: " + obterArea();
        return r;
    }
}
