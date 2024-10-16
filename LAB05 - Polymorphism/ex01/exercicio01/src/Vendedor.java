public class Vendedor extends Funcionario{
    private double comissao;
    private double quant;

    public Vendedor(String nome , String datadenascimento,double salario,double comissao,double quant){
        super(nome, datadenascimento, salario);
        this.comissao = comissao;
        this.quant = quant;
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
        s = getSalario() + (getComissao()*getQuant());
        return s;
    }
}
