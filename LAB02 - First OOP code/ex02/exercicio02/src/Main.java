//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Candidatos02 cand1 = new Candidatos02();
        Candidatos02 cand2 = new Candidatos02();
        Candidatos02 cand3 = new Candidatos02();

        //O nome do objeto ponto e o metodo e o get ele retorna logo usa o =
        cand1.setNome("ANDRÉ LUIZ");
        String n1 = cand1.getNome();
        cand1.setData("29/12/1981");
        String data1 = cand1.getData();
        cand1.setGenero("Masculino");
        String genero1 = cand1.getGenero();
        cand1.setCargo("Prefeito");
        String cargo1 = cand1.getCargo();
        cand1.setBens(962000.00);
        double bens1 = cand1.getBens();
        cand1.setNumero_partido(55);
        int numpartido1 = cand1.getNumero_partido();
        cand1.setReeleicao(false);
        boolean reeleicao1 = cand1.isReeleicao();

        cand2.setNome("MARCELO RODRIGUES DA SILVA");
        String n2 = cand2.getNome();
        cand2.setData("17/07/1970");
        String data2 = cand2.getData();
        cand2.setGenero("Masculino");
        String genero2 = cand2.getGenero();
        cand2.setCargo("Prefeito");
        String cargo2 = cand2.getCargo();
        cand2.setBens(2428000.00);
        double bens2 = cand2.getBens();
        cand2.setNumero_partido(10);
        int numpartido2 = cand2.getNumero_partido();
        cand2.setReeleicao(false);
        boolean reeleicao2 = cand2.isReeleicao();

        cand3.setNome("HELIO HENRIQUE OLIVEIRA SOUZA JUNNIOR");
        String n3 = cand3.getNome();
        cand3.setData("01/11/2000");
        String data3 = cand3.getData();
        cand3.setGenero("Masculino");
        String genero3 = cand3.getGenero();
        cand3.setCargo("Prefeito");
        String cargo3 = cand3.getCargo();
        cand3.setBens(1129342.65);
        double bens3 = cand3.getBens();
        cand3.setNumero_partido(30);
        int numpartido3 = cand3.getNumero_partido();
        cand3.setReeleicao(false);
        boolean reeleicao3 = cand3.isReeleicao();

        System.out.printf("%s\n", cand1.imprimirCandidatos());
        System.out.printf("%s\n", cand2.imprimirCandidatos());
        System.out.printf("%s\n", cand3.imprimirCandidatos());
        // System.out.println("Candidato: " + cand1.imprimirCandidatos());
    }
}