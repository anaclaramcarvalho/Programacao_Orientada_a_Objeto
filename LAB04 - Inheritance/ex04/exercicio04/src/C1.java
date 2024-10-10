public class C1 extends C2{
    public int num;
    private String cor;
    protected String nome;

    public C1(){
        System.out.printf("\nClasse 01: pasagem sem parametro\n");
    }
    public C1(String estacao, String time, int par,boolean b,String local, String comida,int num,String cor,String nome){
        super(estacao,time,par,b,local,comida);
        this.num = num;
        this.cor = cor;
        this.nome = nome;
        System.out.printf("\nClasse 01: pasagem com parametro\n");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String imprimeC1(){
        String r = " ";
        r += super.imprimeC2();
        r += "\n" + getNum();
        r += "\n" + getCor();
        r += "\n" + getNome();
        return r;
    }

    public String mostrar_atributos(){
        String r = " ";
        r += "\n" + getNome();
        r += "\n" + getCor();
        r += "\n" + getTime();
        r += "\n" + getComida();
        r += "\n" + getEstacao();
        r += "\n" + getNum();
        r += "\n" + getLocal();
        r += "\n" + getPar();
        return r;
    }

    public String mostrar_atributo_super(){
        String r = " ";
        r += super.mostrar_atributos_super();
        r += "\n" + getNum();
        r += "\n" + getCor();
        r += "\n" + getNome();
        return r;
    }
}
