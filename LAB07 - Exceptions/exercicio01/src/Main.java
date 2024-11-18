import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario("153.834.226-09", "Ana Rita", 33000);


        try {
            f.aumentarSalario(26);
        } catch (SalarioInvalidoException e) {
            System.out.println("Error:" + e);
        }
    }
}