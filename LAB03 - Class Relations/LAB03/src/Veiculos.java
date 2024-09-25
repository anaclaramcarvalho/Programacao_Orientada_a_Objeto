public class Veiculos {
    private String modelo;
    private String placa;
    private String cor;

    //É boa a pratica de colocar privado no geral
    public Veiculos(String modelo, String placa, String cor) {
        this.setModelo(modelo);
        this.setPlaca(placa);
        this.setCor(cor);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String imprimirveiculo(){
        String r = "";
        r += "\nModelo: " + getModelo();
        r += "\nPlaca: " + getPlaca();
        r += "\nCor: " + getCor();
        return r;
    }
}