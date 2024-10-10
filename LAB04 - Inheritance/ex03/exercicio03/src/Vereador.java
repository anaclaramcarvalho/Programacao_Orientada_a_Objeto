public class Vereador extends Candidato{
    private String bairro;
    private int numero;

    public Vereador(String nome,String data,String genero,double bens,boolean reeleicao,int numero_partido,String bairro,int numero){
        super(nome, data, genero, bens, reeleicao, numero_partido);
        this.setBairro(bairro);
        this.setNumero(numero);
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

    public String imprimeVereador(){
        String r = "";
        r += "\n" + super.imprimeCandidato();
        r += "\n" + getBairro();
        r += "\n" + getNumero();
        return r;
    }
}

