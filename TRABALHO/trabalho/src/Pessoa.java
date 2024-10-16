public class Pessoa {
    private int CPF;
    private String nome;
    private String datadenascimento;

    public Pessoa(int CPF,String nome,String datadenascimento){
        this.CPF = CPF;
        this.nome = nome;
        this.datadenascimento = datadenascimento;
    }

    public int getCPF() {
        return CPF;
    }
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatadenascimento() {
        return datadenascimento;
    }
    public void setDatadenascimento(String datadenascimento) {
        this.datadenascimento = datadenascimento;
    }
}
