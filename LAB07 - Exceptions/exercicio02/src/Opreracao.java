public class Opreracao {
    private int numerador;
    private int denominador;

    public Opreracao(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void iniciarOperacao(int numerador,int denominador) throws DivisaoPorZeroException {
            calcular(numerador, denominador);
    }

    public void calcular(int numerador, int denominador) throws DivisaoPorZeroException {
         dividir( numerador, denominador);
    }
    public int dividir(int numerador, int denominador) throws DivisaoPorZeroException {
        if(denominador == 0){
                throw new DivisaoPorZeroException("Error:Divisão por zero não permitida!");
        }else{
            int resultado = numerador/denominador;
            return resultado;
        }
    }
}
