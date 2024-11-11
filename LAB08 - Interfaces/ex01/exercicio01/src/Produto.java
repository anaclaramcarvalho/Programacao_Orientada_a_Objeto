public class Produto implements Classificavel{
    private int codigo;

    public Produto(int codigo){
        this.codigo = codigo;
    }

    public boolean eMenorQue(Classificavel o){
        Produto compra = (Produto) o;
        if(this.getCodigo() < compra.getCodigo()){
            return true;
        }else{
            return false;
        }
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
