public class Horista extends Funcionario{
    private double valorH;
    private double horas;

    public Horista(String nome , String datadenascimento,double salario,double valorH,double horas){
        super(nome, datadenascimento, salario);
        this.valorH = valorH;
        this.horas = horas;
    }

    public double getValorH() {
        return valorH;
    }

    public void setValorH(double valorH) {
        this.valorH = valorH;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double salario(){
        double s;
        s = getValorH()*getHoras();
        return s;
    }
}
