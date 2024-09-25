public class ItemPedido {
    private String item;
    private int quantidade;
    private double valoritem;

    public ItemPedido(String item, int quantidade,double valoritem){
        this.item = item;
        this.quantidade = quantidade;
        this.valoritem = valoritem;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValoritem() {
        return valoritem;
    }

    public void setValoritem(double valoritem) {
        this.valoritem = valoritem;
    }

    public String imprimiItem(){
        String r = "";
        r += "\nItem: " + getItem();
        r += "\nQuantidade: " + getQuantidade();
        r += "\nValor do Item: " + getValoritem();
        return r;
    }

}
