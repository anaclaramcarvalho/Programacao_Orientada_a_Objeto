public class Estudante  extends Pessoa{
    private double CRA;

    public Estudante(int CPF ,String nome,String datadenascimento,double CRA){
        super(CPF,nome,datadenascimento);
        this.CRA = CRA;
    }

    public double getCRA() {
        return CRA;
    }

    public void setCRA(double CRA) {
        this.CRA = CRA;
    }
}
