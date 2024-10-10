public class Vendedores {
    private double salarioF;
    private double comissao;
    private double quant;

    public Vendedores(double salarioF,double comissao,double quant){
            this.salarioF = salarioF;
            this.comissao = comissao;
            this.quant = quant;
    }

    public double getSalarioF() {
        return salarioF;
    }

    public void setSalarioF(double salarioF) {
        this.salarioF = salarioF;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getQuant() {
        return quant;
    }

    public void setQuant(double quant) {
        this.quant = quant;
    }

    public double salario(){
        double s;
        s = getSalarioF() + (getComissao()*getQuant());
        return s;
    }
}
