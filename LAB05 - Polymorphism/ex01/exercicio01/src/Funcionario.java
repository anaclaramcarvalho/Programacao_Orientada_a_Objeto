public class Funcionario {
    private String nome;
    private String datadenascimento;
    private double salario;

    public Funcionario(String nome , String datadenascimento,double salario){
        this.nome = nome;
        this.datadenascimento = datadenascimento;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public double getPagamento(){
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}