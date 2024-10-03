public class Jogador {
    private String nome;
    private  int idade;
    private double altura;
    private double peso;

    public Jogador(String nome,int idade, double altura,double peso){
        this.setNome(nome);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String imprimeJogador(){
        String r = "";
        r += "\nNome:" + getNome();
        r += "\nIdade:" + getIdade();
        r += "\nAltura:" + getAltura();
        r += "\nPeso:" + getPeso();
        return r;
    }
}
