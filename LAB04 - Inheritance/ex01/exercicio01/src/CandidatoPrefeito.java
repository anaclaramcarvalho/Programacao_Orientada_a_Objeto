public class CandidatoPrefeito {
    private String nome;
    private String data;
    private String genero;
    private double bens;
    private boolean reeleicao;
    private int numero_partido;
    private String NomedoVice;
    private String Partido;

    public CandidatoPrefeito(String nome, String data,String genero, double bens, boolean reeleicao,int numero_partido,String nomedoVice,String partido){
        this.nome = nome;
        this.data = data;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this. numero_partido = numero_partido;
        this.NomedoVice = nomedoVice;
        this.Partido = partido;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getBens() {
        return bens;
    }

    public void setBens(double bens) {
        this.bens = bens;
    }

    public boolean isReeleicao() {
        return reeleicao;
    }

    public void setReeleicao(boolean reeleicao) {
        this.reeleicao = reeleicao;
    }

    public int getNumero_partido() {
        return numero_partido;
    }

    public void setNumero_partido(int numero_partido) {
        this.numero_partido = numero_partido;
    }

    public String getNomedoVice() {
        return NomedoVice;
    }

    public void setNomedoVice(String nomedoVice) {
        NomedoVice = nomedoVice;
    }

    public String getPartido() {
        return Partido;
    }

    public void setPartido(String partido) {
        Partido = partido;
    }

    public String imprimirCandidatos(){
        String r = "";
        r += "\n" + getNome();
        r += "\n" + getData();
        r += "\n" + getGenero();
        r += "\n" + getBens();
        r += "\n" + isReeleicao();
        r += "\n" + getNumero_partido();
        r += "\n" + getNumero_partido();
        r += "\n" + getNomedoVice();
        r += "\n" + getPartido();
        return r;
    }
}
