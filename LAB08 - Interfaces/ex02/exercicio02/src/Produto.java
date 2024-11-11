public class Produto implements Classificavel{
    private int codigo;

    public Produto(int codigo){
        this.codigo = codigo;
    }

    public int eMenorQue(Classificavel o){
        Produto compra = (Produto) o;
        if(this.getCodigo() < compra.getCodigo()){
            return 1;
        }else{
            return -1;
        }
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
