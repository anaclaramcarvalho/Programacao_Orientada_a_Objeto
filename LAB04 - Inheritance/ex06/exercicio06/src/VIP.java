public class VIP extends Ingresso{
    private float valorAdicional;

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public float valorFinal(){
        float vf = 0;
            vf  = getValor() + getValorAdicional();
            return vf;
    }
}
