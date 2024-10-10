public class CandidatoVereador {
    private String Nome;
    private String data;
    private String genero;
    private double bens;
    private boolean reeleicao;
    private int numero_partido;
    private String bairro;
    private int numero;

    public CandidatoVereador(String nome,String data,String genero,double bens,boolean reeleicao,int numero_partido,String bairro, int numero){
        this.Nome = nome;
        this.data = data;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.numero_partido = numero_partido;
        this.bairro = bairro;
        this.numero = numero;
    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
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

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String imprimevereador() {
        String r = "";
        r += "\n" + getNome();
        r += "\n" + getData();
        r += "\n" + getGenero();
        r += "\n" + getBens();
        r += "\n" + isReeleicao();
        r += "\n" + getNumero_partido();
        r += "\n" + getBairro();
        r += "\n" + getNumero();
        return r;
    }
}
