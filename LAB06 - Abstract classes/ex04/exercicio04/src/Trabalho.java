public class Trabalho extends Contato{
    public String tipo;

    public Trabalho(String apelido,String nome,String email,String aniversario,String tipo){
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String imprimirContato(){
        String r = " ";
        r += super.ImprimirBasico();
        r += "Tipo de relação no trabalho: " + tipo;
        return r;
    }
}
