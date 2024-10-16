public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Chefe chefe1 = new Chefe("joão","26/08/2000",1000.00);
        System.out.println("Salário do chefe: " + chefe1.calcularSalario());
        Chefe chefe2 = new Chefe("Ana","29/12/2001",5000.00);
        System.out.println("Salário do chefe: " + chefe2.calcularSalario());

        Vendedor vendedor = new Vendedor("Júlia", "06/05/1900",1200.00,10.00,20);
        System.out.println("\nSalário do Vendedor: " + vendedor.salario());
        Vendedor vendedor2 = new Vendedor("Adriano", "10/07/1976",1200.00,10.00,35);
        System.out.println("Salário do Vendedor: " + vendedor2.salario());

        Operario operario = new Operario("Fernanda","12/10/2000",0.00,2.50,476);
        System.out.println("\nSalário do  Operario: " + operario.salario());
        Operario operario2 = new Operario("Anna","21/01/2000",0.00,99.00,22);
        System.out.println("Salário do  Operario: " + operario2.salario());

        Horista horista = new Horista("Fabio","18/12/1988",0.00,40.0,8.0);
        System.out.println("\nSalário do Horista: " + horista.salario());
        Horista horista2 = new Horista("Fabiola","07/03/1988",0.00,40.0,12.0);
        System.out.println("Salário do Horista: " + horista2.salario());

    }

}