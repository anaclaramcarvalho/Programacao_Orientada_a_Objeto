public class VeiculosDuasRodas {
    private int numIdentificação;
    private double velocidade;
    private String fabricanteVeiculo;

    public VeiculosDuasRodas(int numIdentificação,double velocidade, String fabricanteVeiculo){
        this.numIdentificação = numIdentificação;
        this.velocidade = velocidade;
        this.fabricanteVeiculo = fabricanteVeiculo;
    }

    public void imprimirDados(){
        System.out.println("Número de identificação: " + getNumIdentificação()
        + "Velocidade: " + getVelocidade()
        + "fFabricante do veiculo: " + getFabricanteVeiculo());
    }

    public int getNumIdentificação() {
        return numIdentificação;
    }
    public void setNumIdentificação(int numIdentificação) {
        this.numIdentificação = numIdentificação;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getFabricanteVeiculo() {
        return fabricanteVeiculo;
    }

    public void setFabricanteVeiculo(String fabricanteVeiculo) {
        this.fabricanteVeiculo = fabricanteVeiculo;
    }
}
