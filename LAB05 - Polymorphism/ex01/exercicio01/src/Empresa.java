public class Empresa {
    private Chefe[] chefe;
    private Vendedor[] vendedor;
    private Operario[] operario;
    private Horista[] horista;

    public Empresa(Chefe[] chefe,Vendedor[] vendedor,Operario[] operario,Horista[] horista){
        this.chefe = chefe;
        this.vendedor = vendedor;
        this.operario = operario;
        this.horista = horista;
    }

    public Chefe[] getChefe() {
        return chefe;
    }

    public void setChefes(Chefe[] chefe) {
        this.chefe = chefe;
    }

    public Vendedor[] getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor[] vendedores) {
        this.vendedor = vendedor;
    }

    public Operario[] getOperario() {
        return operario;
    }

    public void setOperario(Operario[] operario) {
        this.operario = operario;
    }

    public Horista[] getHorista() {
        return horista;
    }

    public void setHorista(Horista[] horista) {
        this.horista = horista;
    }
}

