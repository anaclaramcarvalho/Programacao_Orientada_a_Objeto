public class Proprietario {
    private String nome;
    private Veiculos[] veiculos;
    private String nascimento;

    public Proprietario(String nome,Veiculos veiculos[], String nascimento){
        this.setNome(nome);
        this.setVeiculos(veiculos);
        this.setNascimento(nascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Veiculos[] getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Veiculos[] veiculos) {
        this.veiculos = veiculos;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String imprimir(){
        Veiculos [] v = getVeiculos();
        String r = "";
        r += "\nNome: " + getNome();
        r += "\n";
        r += "\nVeiculos: " + v[0].imprimirveiculo() + v[1].imprimirveiculo() + v[2].imprimirveiculo();
        r+= "\n";
        r += "\nNascimento: " + getNascimento();
        return r;
    }
}
