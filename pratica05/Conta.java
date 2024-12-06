public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void Conta(){
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo){
       this.setTipo(tipo);
       status = true;
       if(tipo == "cc"){
           saldo = 50;
       }else if(tipo == "cp"){
           setSaldo(150);
       }
    }
    public void fecharConta(){
        if(saldo > 0){
            System.out.println("Conta com dinheiro.");
        }else if(saldo < 0){
            System.out.println("Conta em débito.");
        }else {
            status = false;
        }
    }
    public void depositar(float deposito){
        if(status == true){
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Depositado com sucesso.");
        }else{
            System.out.println("Impossivel depositar.");
        }
    }
    public void sacar(float saque){
        if(status == true){
            if(saldo > saque){
                saldo = saldo - saque;
                System.out.println("Saque realizado com sucesso.");
            }else{
                System.out.println("Saldo insuficiente.");
            }
        }else{
            System.out.println("Impossivel sacar.");
        }
    }
    public void pagarMensal(){
        float v = 0;
        if(tipo == "cc"){
            v = 12;
        }else if(tipo == "cp"){
            v = 20;
        }
        if(status == true){
            if(saldo > v){
                saldo -= v;
            }else{
                System.out.println("Saldo insuficiente.");
            }
        }else{
            System.out.println("Impossivel pagar.");
        }
    }
}
