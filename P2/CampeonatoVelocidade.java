public class CampeonatoVelocidade implements Campeonato {
    @Override
    public int compararVelocidades(Bike b1, Bike b2) {
        if (b1.getTipo().equals(b2.getTipo())) {
            return Double.compare(b1.getVelocidadeBike(), b2.getVelocidadeBike());
        } else {
            throw new OperacaoInvalidaException("As bicicletas devem ser do mesmo tipo");
        }
    }
}
