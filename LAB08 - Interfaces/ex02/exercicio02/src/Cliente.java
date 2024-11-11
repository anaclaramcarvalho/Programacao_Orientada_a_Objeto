public class Cliente implements Classificavel{
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    public int eMenorQue(Classificavel o) {
        Cliente outroCliente = (Cliente) o;
        if(this.nome.compareToIgnoreCase(outroCliente.nome) < 0){
            return 1;
        }else{
            return -1;
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}