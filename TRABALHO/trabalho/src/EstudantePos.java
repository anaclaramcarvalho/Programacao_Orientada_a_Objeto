public class EstudantePos  extends Estudante{
    private boolean temaPesquisa;

    public EstudantePos(int CPF ,String nome,String datadenascimento,double CRA,boolean temaPesquisa) {
        super(CPF, nome, datadenascimento, CRA);
        this.temaPesquisa = temaPesquisa;
    }

    public boolean isTemaPesquisa() {
        return temaPesquisa;
    }

    public void setTemaPesquisa(boolean temaPesquisa) {
        this.temaPesquisa = temaPesquisa;
    }
}
