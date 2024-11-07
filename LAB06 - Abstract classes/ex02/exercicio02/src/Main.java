public class Main {
    public static void main(String[] args) {
        ContaEspecial c = new ContaEspecial(3331616.00,735420,1602,3000);
        if (c.debitaValor(50, 1602)){
            if(c.getEstado(1602) == 2){
                System.out.println("Conta cancelada.");
            }
        }
        System.out.println("Estado: " + c.getEstado(1602));
        System.out.println("Estado: " + c.getEstado(3210));
    }
}
