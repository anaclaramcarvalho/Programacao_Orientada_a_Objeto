class CamaroteSuperior extends VIP {
    private double valorAdicional;

    public CamaroteSuperior(double valor, double valorAdicional) {
        super(valor, valorAdicional);
        this.valorAdicional = valorAdicional;
    }

    public double getValorTotal() {
        return super.valorFinal() + valorAdicional;
    }
}