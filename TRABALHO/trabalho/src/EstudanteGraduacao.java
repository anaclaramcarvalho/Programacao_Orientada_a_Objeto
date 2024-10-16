public class EstudanteGraduacao extends Estudante{
    private boolean estagioSupervisionado;

    public EstudanteGraduacao(int CPF ,String nome,String datadenascimento,double CRA, boolean estagioSupervisionado){
        super(CPF, nome, datadenascimento, CRA);
        this.estagioSupervisionado = estagioSupervisionado;
    }

    public boolean isEstagioSupervisionado() {
        return estagioSupervisionado;
    }

    public void setEstagioSupervisionado(boolean estagioSupervisionado) {
        this.estagioSupervisionado = estagioSupervisionado;
    }
}
