public class FolhadePagamento{
    private double total;

    public FolhadePagamento(){

    }
    public double imprimeFolha(Funcionario[] funcionario){
        double total = 0.0;
        for(int i = 0;i < funcionario.length;i++) {
            total = total+ funcionario[i].getPagamento();
        }
        return total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
