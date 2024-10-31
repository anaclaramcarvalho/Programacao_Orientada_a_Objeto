public class Main {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new Normal(50);
        VIP ingressoVip = new VIP(50, 20);
        CamaroteInferior camaroteInferior = new CamaroteInferior(150, 50, "Setor A");
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(200, 100);

        ingressoNormal.escreveValor();
        ingressoVip.escreveValor();
        System.out.println("Valor total do VIP: R$" + ingressoVip.valorFinal());
        System.out.println("Localização do camarote inferior: " + camaroteInferior.getLocalizacao());
        System.out.println("Valor total do camarote superior: R$" + camaroteSuperior.getValorTotal());
    }
}