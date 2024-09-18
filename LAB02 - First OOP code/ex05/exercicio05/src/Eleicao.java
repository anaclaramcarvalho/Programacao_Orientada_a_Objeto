public class Eleicao {
    String municipio; //atributos
    double votantes;
    Candidatos04 candidatos[];
    String cargo;

    public Eleicao(String municipio,double votantes,Candidatos04 [] candidatos,String cargo){
        this.municipio = municipio;
        this.votantes = votantes;
        this.candidatos = candidatos;
        this.cargo = cargo;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String getMunicipio(){
        return this.municipio;
    }

    public void setVotantes(double votantes){
        this.votantes = votantes;
    }
    public double getVotantes(){
        return this.votantes;
    }

    public void setCandidatos(Candidatos04 [] candidatos) {
        this.candidatos = candidatos;
    }
    public Candidatos04 [] getCandidatos() {
        return this.candidatos;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getCargo() {
        return this.cargo;
    }

    public String imprimireleicao(){
        Candidatos04 [] c = getCandidatos();
        String r = "";
        r += "\nMunicipio: " + getMunicipio();
        r += "\nNro de votantes: " + getVotantes();
        r += "\nCandidatos: " + c[0].getNome() + ", " + c[1].getNome() + ", " + c[2].getNome();
        r += "\nCargo: " + getCargo();
        return r;
    }

}
 //os metodos são funções que manipulam os atributos da classe