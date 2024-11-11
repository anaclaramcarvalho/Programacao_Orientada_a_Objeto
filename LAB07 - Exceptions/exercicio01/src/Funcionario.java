public class Funcionario {
    private String CPF;
    private String nome;
    private double salario;
    private double tetoSalarial;

    public Funcionario(String cpf, String nome,double salario ){
        this.CPF= cpf;
        this.nome = nome;
        this.salario = salario;
        this.tetoSalarial = 40000;
    }

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario < 0){
        throw new SalarioInvalidoException("Valor inválido de salário!");
    }else if(salario > tetoSalarial){
        throw new SalarioInvalidoException("Valor ultrapassa o teto");
    }else{
        this.salario = salario;
    }
        }

    public void setTetoSalarial(double tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }
    public double getTetoSalarial() {
        return tetoSalarial;
    }

    public void aumentarSalario(float percentual){
        double novoSalario = salario + salario * (percentual / 100);
        try{
            setSalario(novoSalario);
        }catch (SalarioInvalidoException e){
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Salário atual:R$" + salario);
    }
}
