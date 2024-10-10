public class C2 extends C3{
    public boolean b;
    private String local;
    protected String comida;

    public C2(){
        System.out.printf("\nClasse 02: pasagem sem parametro\n");
    }
    public C2(String estacao, String time, int par,boolean b, String local,String comida){
        super(estacao,time,par);
        this.b = b;
        this.local = local;
        this.comida = comida;
        System.out.printf("\nClasse 02: pasagem com parametro\n");
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String imprimeC2(){
        String r = " ";
        r += "\n" + super.imprimeC3();
        r += "\n" + isB();
        r += "\n" + getComida();
        r += "\n" + getLocal();
        return r;
    }

    public String mostrar_atributos(){
        String r = " ";
        r += "\n" + getTime();
        r += "\n" + getComida();
        r += "\n" + getEstacao();
        r += "\n" + getLocal();
        r += "\n" + getPar();
        return r;
    }

    public String mostrar_atributos_super(){
        String r = " ";
        r += "\n" + super.mostrar_atributos_super();
        r += "\n" + isB();
        r += "\n" + getComida();
        r += "\n" + getLocal();
        return r;
    }
}
