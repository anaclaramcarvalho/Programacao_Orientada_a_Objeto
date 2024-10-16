public class Professor extends Pessoa{
    private String inicioContrato;
    private String departamentoVinculado;

    public Professor(int CPF,String nome,String datadenascimento,String inicioContrato, String departamentoVinculado){
        super(CPF, nome, datadenascimento);
        this.inicioContrato = inicioContrato;
        this.departamentoVinculado = departamentoVinculado;
    }

    public String getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(String inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public String getDepartamentoVinculado() {
        return departamentoVinculado;
    }

    public void setDepartamentoVinculado(String departamentoVinculado) {
        this.departamentoVinculado = departamentoVinculado;
    }
}
