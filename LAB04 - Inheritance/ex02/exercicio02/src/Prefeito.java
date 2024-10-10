public class Prefeito  extends Candidato{
    private String NomedoVice;
    private String Partido;

    public Prefeito(String nome,String data,String genero,double bens,boolean reeleicao,int numero_partido, String nomedoVice, String partido){
        super(nome, data, genero, bens, reeleicao, numero_partido);
        this.NomedoVice= nomedoVice;
        this.Partido = partido;

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

    public String imprimePrefeito(){
        String r = "";
        r += "\n" + super.imprimeCandidato();
        r += "\n" + getNomedoVice();
        r += "\n" + getPartido();
        return r;
    }
}
