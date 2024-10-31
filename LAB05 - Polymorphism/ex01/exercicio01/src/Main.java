public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();


        Funcionario[] funcionario = new Funcionario[4];

        funcionario[0] = new Chefe("joão","26/08/2000",1000.00);
        System.out.println("Salário do chefe: " + ((Chefe)funcionario[0]).getSalario());

        funcionario[1] = new Vendedor("Júlia", "06/05/1900",1200.00,10.00,20);
        System.out.println("\nSalário do Vendedor: " + ((Vendedor)funcionario[1]).getSalario());


        funcionario[2] = new Operario("Fernanda","12/10/2000",2.50,476);
        System.out.println("\nSalário do  Operario: " + ((Operario)funcionario[2]).getSalario());


        funcionario[3] = new Horista("Fabio","18/12/1988",40.0,8.0);
        System.out.println("\nSalário do Horista: " + ((Horista)funcionario[3]).getSalario());

        FolhadePagamento folhadePagamento = new FolhadePagamento();
        System.out.printf("Total a ser pago :%s",folhadePagamento.imprimeFolha(funcionario));
    }

}