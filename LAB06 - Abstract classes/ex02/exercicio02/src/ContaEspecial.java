public class ContaEspecial extends ContaCorrente{
    private float limite;

    public ContaEspecial(double val,int num,int pwd,float limite){
        super(val,num,pwd);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void verrificandoLimite(){
        if(limite == 0){
            ContaComum c = new ContaComum(saldo, numConta, senha, limite);
        }else{
            if(limite > 0){
                saldo = 0;
                estado = 1;
            }
        }
    }
}
