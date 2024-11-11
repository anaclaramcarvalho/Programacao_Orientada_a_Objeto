public class Serviço implements Classificavel{
    private double preco;

    public Serviço(double preco){
        this.preco = preco;
    }

    public boolean eMenorQue(Classificavel o) {
        Serviço outroServico = (Serviço) o;
        if(this.preco < outroServico.preco){
            return true;
        }else{
            return false;
        }
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
