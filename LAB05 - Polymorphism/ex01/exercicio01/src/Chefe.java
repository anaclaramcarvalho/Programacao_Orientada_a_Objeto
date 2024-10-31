public class Chefe  extends Funcionario{

    public Chefe(String nome , String datadenascimento,double salario){
        super(nome, datadenascimento,salario);
    }

    public double getPagamento() {
        return getSalario();
    }
}
