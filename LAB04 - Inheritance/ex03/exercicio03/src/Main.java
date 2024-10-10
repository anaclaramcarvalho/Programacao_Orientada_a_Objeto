public class Main {
    public static void main(String[] args) {
        Prefeito p = new Prefeito("ANDRÉ LUIZ", "29/12/1981", "Masculino", 962000.00, false, 55,"Ricardinho", "PL");
        System.out.printf(" Os dados do prefeito: \n%s", p.imprimePrefeito());

        Vereador v = new Vereador("MARCELO RODRIGUES DA SILVA", "17/07/1970", "Masculino",  2428000.00, false, 10, "Jardim Neblon", 32);
        System.out.printf("Os dados do vereador: \n%s", v.imprimeVereador());
    }
}