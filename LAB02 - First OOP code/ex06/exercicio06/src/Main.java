public class Main {
    public static void main(String[] args) {
        Candidatos04 [] candidatos = new Candidatos04[5];
        candidatos[0] = new Candidatos04("ANDRÉ LUIZ", "29/12/1981", "Masculino", "Prefeito", 962000.00, 55, false);
        candidatos[1] = new Candidatos04("MARCELO RODRIGUES DA SILVA", "17/07/1970", "Masculino", "Prefeito", 2428000.00, 10, false);
        candidatos[2] = new Candidatos04("HELIO HENRIQUE OLIVEIRA SOUZA JUNNIOR", "01/11/2000", "Masculino", "Prefeito", 1129342.65, 30, false);
        candidatos[3] = new Candidatos04("GABRIEL BARBOSA", "05/08/1981", "Masculino", "Prefeito", 500000.00, 99, false);
        candidatos[4] = new Candidatos04("BARBARA SILVA", "13/10/1969", "Feminino", "Prefeito", 28650.00, 10, true);

        Eleicoes eleicao = new Eleicoes("Caldas Novas",48500, candidatos,"Prefeito");
        System.out.printf("O candidato tem %.2f  de todos os bens.\n",eleicao.maiorBens());
    }
}