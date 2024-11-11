public class Cliente implements Classificavel{
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    public boolean eMenorQue(Classificavel o) {
        Cliente outroCliente = (Cliente) o;
        if(this.nome.compareTo(outroCliente.nome) < 0){
            return true;
        }else{
            return false;
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
