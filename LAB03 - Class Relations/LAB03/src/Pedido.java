public class Pedido {
    private int numpedido;
    private String data;
    private ItemPedido[] item;

    public Pedido(int numpedido,String data,ItemPedido item[]){
        this.setNumpedido(numpedido);
        this.setData(data);
        this.item = item;
    }

    public int getNumpedido() {
        return numpedido;
    }

    public void setNumpedido(int numpedido) {
        this.numpedido = numpedido;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ItemPedido[] getItem() {
        return item;
    }

    public void setItem(ItemPedido[] item) {
        this.item = item;
    }

    public String imprimirpedido(){
        ItemPedido [] p = getItem();
        String r = "";
        r += "\nNúmero do pedido: " + getNumpedido();
        r+= "\n";
        r += "\nData: " + getData();
        r += "\nItem: " + p[0].imprimiItem() + p[1].imprimiItem() + p[2].imprimiItem();
        return r;
    }
}
