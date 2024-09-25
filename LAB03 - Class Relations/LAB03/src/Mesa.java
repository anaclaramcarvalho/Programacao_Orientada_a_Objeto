public class Mesa {
    private int quantcadeiras;
    private String formato;

    public Mesa(int quantcadeiras, String formato){
        this.setQuantcadeiras(quantcadeiras);
        this.setFormato(formato);
    }

    public int getQuantcadeiras() {
        return quantcadeiras;
    }

    public void setQuantcadeiras(int quantcadeiras) {
        this.quantcadeiras = quantcadeiras;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String imprimemesa(){
        String r = "";
        r += "\nQuantidade de cadeiras: " + getQuantcadeiras();
        r += "\nFormato: " + getFormato();
        return r;
    }
}
