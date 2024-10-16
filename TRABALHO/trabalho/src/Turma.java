public class Turma extends Disciplina{
    private int ano;
    private int semestre;

    public Turma(String codigo,String nome,int cargaHoraria,int ano,int semestre){
        super(codigo, nome, cargaHoraria);
        this.ano = ano;
        this.semestre = semestre;
    }
}
