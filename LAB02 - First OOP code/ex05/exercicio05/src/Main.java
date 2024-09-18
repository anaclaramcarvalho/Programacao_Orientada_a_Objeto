public class Main {
    public static void main(String[] args) {
        Candidatos04 [] candidatos = new Candidatos04[3];
        candidatos[0] = new Candidatos04("ANDRÉ LUIZ", "29/12/1981", "Masculino", "Prefeito", 962000.00, 55, false);
        candidatos[1] = new Candidatos04("MARCELO RODRIGUES DA SILVA", "17/07/1970", "Masculino", "Prefeito", 2428000.00, 10, false);
        candidatos[2] = new Candidatos04("HELIO HENRIQUE OLIVEIRA SOUZA JUNNIOR", "01/11/2000", "Masculino", "Prefeito", 1129342.65, 30, false);

        Candidatos04 [] candidatos2 = new Candidatos04[3];
        candidatos2[0] = new Candidatos04("GABRIEL BARBOSA", "05/08/1981", "Masculino", "Prefeito", 500000.00, 99, false);
        candidatos2[1] = new Candidatos04("BARBARA SILVA", "13/10/1969", "Feminino", "Prefeito", 28650.00, 10, true);
        candidatos2[2] = new Candidatos04("DOLGLAS EDUARDO SILVA", "01/11/2000", "Masculino", "Prefeito", 1129342.65, 30, false);

        Eleicao eleicao01 = new Eleicao("Caldas Novas",48500, candidatos,"Prefeito");
        Eleicao eleicao02 = new Eleicao("Patos de Minas",47770, candidatos2,"Prefeito");

        System.out.printf("%s\n", eleicao01.imprimireleicao());
        System.out.printf("%s\n", eleicao02.imprimireleicao());
    }
}