public class Main {
    public static void main(String[] args) {
        Candidatos04 cand1 = new Candidatos04("ANDRÉ LUIZ", "29/12/1981", "Masculino", "Prefeito", 962000.00, 55, false);
        Candidatos04 cand2 = new Candidatos04("MARCELO RODRIGUES DA SILVA", "17/07/1970", "Masculino", "Prefeito", 2428000.00, 10, false);
        Candidatos04 cand3 = new Candidatos04("HELIO HENRIQUE OLIVEIRA SOUZA JUNNIOR", "01/11/2000", "Masculino", "Prefeito", 1129342.65, 30, false);

        System.out.printf("%s\n", cand1.imprimirCandidatos());
        System.out.printf("%s\n", cand2.imprimirCandidatos());
        System.out.printf("%s\n", cand3.imprimirCandidatos());
        // System.out.println("Candidato: " + cand1.imprimirCandidatos());
    }
}
