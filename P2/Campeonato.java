import java.awt.print.PrinterException;

public interface Campeonato {
    int compararVelocidades(Bike b1, Bike b2);
    boolean eElegivel();
    void enviarImpressora() throws PrinterException;
}
