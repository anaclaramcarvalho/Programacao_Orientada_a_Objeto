public class Marcha {
    private int numMaximo;
    private int marchaAtual;
    private String fabricante;

    public Marcha(int numMaximo, String fabricante){
        this.marchaAtual = 1;
        if(numMaximo < 1){
            numMaximo = 1;
        }
        this.numMaximo = numMaximo;
        this.fabricante = fabricante;
    }

    public void incrementa() {
        if (marchaAtual < numMaximo) {
            marchaAtual++;
        }else{
            throw new OperacaoInvalidaException("Marcha máxima atingida");
        }
    }


    public void decrementa(){
        if(marchaAtual > 1){
            marchaAtual--;
        }else{
          throw new OperacaoInvalidaException("Marcha mínima atingida");
        }
    }

    public int getNumMaximo() {
        return numMaximo;
    }

    public void setNumMaximo(int numMaximo) {
        this.numMaximo = numMaximo;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
