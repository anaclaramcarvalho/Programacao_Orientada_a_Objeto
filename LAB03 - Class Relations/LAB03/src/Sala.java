public class Sala {
    private double largura;
    private double altura;
    private Mesa mesa;

     public Sala(double largura,double altura, Mesa mesa){
        this.setLargura(largura);
        this.setAltura(altura);
        this.setMesa(mesa);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String imprimesala(){
         Mesa m = getMesa();
        String r = "";
        r += "\nAltura: " + getAltura();
        r += "\nLargura: " + getLargura();
        r += "\nMesa: " + m.imprimemesa();
        return r;
    }
}
