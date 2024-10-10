public class C3 {
    public String time;
    private String estacao;
    protected int par;

    public C3(){
        System.out.printf("\nClasse 03: pasagem sem parametro\n");
    }
    public C3(String time, String estacao, int par){
        this.setTime(time);
        this.setEstacao(estacao);
        this.setPar(par);
        System.out.printf("\nClasse 03: pasagem com parametro\n");
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }

    public String imprimeC3(){
        String r = " ";
        r += "\n" + getTime();
        r += "\n" + getEstacao();
        r += "\n" + getPar();
        return r;
    }

    public String mostrar_atributos(){
        String r = " ";
        r += "\n" + getTime();
        r += "\n" + getEstacao();
        r += "\n" + getPar();
        return r;
    }

    public String mostrar_atributos_super(){
        String r = " ";
        r += "\n" + getTime();
        r += "\n" + getEstacao();
        r += "\n" + getPar();
        return r;
    }
}
