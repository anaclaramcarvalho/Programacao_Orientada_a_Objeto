public class Familia extends Contato{
    public String parentesco;

    public Familia(String apelido,String nome,String email,String aniversario,String parentesco){
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }
    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String imprimirContato(){
        String r = " ";
        r += super.ImprimirBasico();
        r += "Parentesco" + parentesco;
        return r;
    }
}
