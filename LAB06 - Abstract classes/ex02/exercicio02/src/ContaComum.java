public class ContaComum extends ContaCorrente{
    private float limite;

    public ContaComum(double val,int num,int pwd, float limite){
        super(val, num, pwd);
        this.limite = 0;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }


}
