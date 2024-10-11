public class Operario extends Funcionario{
    private double valor;
    private int quantidade;

    public Operario(String nome , String datadenascimento,double salario,double valor, int quantidade){
        super(nome, datadenascimento, salario);
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double salario(){
        double s;
        s = getValor()*getQuantidade();
        return s;
    }
}
