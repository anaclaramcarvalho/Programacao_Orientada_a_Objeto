public class Time {
    private String NomedoTime;
    private Jogador titular1;
    private Jogador titular2;
    private Jogador subistituto;

    public Time(String nomedoTime, Jogador t1, Jogador t2, Jogador sub){
        this.setNomedoTime(nomedoTime);
        this.setTitular1(t1);
        this.setTitular2(t2);
        this.setSubistituto(sub);
    }

    public Time(String nomedoTime,Jogador t1,Jogador t2){
        this.setNomedoTime(nomedoTime);
        this.setTitular1(t1);
        this.setTitular2(t2);
    }


    public String getNomedoTime() {
        return NomedoTime;
    }

    public void setNomedoTime(String nomedoTime) {
        NomedoTime = nomedoTime;
    }

    public Jogador getTitular1() {
        return titular1;
    }

    public void setTitular1(Jogador titular1) {
        this.titular1 = titular1;
    }

    public Jogador getTitular2() {
        return titular2;
    }

    public void setTitular2(Jogador titular2) {
        this.titular2 = titular2;
    }

    public Jogador getSubistituto() {
        return subistituto;
    }

    public void setSubistituto(Jogador subistituto) {
        this.subistituto = subistituto;
    }

    public String imprimetime(){
        String r = "";
        r += "\nNome do Time:" + getNomedoTime();
        r +=  "\nTitular:" + titular1.getNome();
        r += "\nTitular:" + titular2.getNome();
        if(subistituto != null) {
            r += "\nSubstituto:" + subistituto.getNome();
        }
        return r;
    }

    public float media(){
        float t = 0, m = 0;
        if(subistituto != null) {
            t = titular1.getIdade() + titular2.getIdade() + subistituto.getIdade();
            m = t/3;
        }else {
            t = titular1.getIdade() + titular2.getIdade();
            m = t / 2;
        }
        return m;
    }
}