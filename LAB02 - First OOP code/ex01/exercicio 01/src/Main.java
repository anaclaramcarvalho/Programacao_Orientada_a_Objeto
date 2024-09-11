//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Candidatos cand1 = new Candidatos();
        Candidatos cand2 = new Candidatos();
        Candidatos cand3 = new Candidatos();

//PROFESSOR, FUI PESQUISAR E NÃO EXISTE UM MUNICIPIO QUE TENHA OS TRES ULTIMOS NÚMEROS DA MINHA MATRICULA, LOGO PEGUEI UM COM OS 2
        cand1.Nome = "ANDRÉ LUIZ";
        cand1.data = "29/12/1981";
        cand1.genero = "Masculino";
        cand1.cargo = "Prefeito";
        cand1.bens = 962000.00;
        cand1.numero_partido = 55;
        cand1.reeleicao = false;

        cand2.Nome = "MARCELO RODRIGUES DA SILVA";
        cand2.data = "17/07/1970";
        cand2.genero = "Masculino";
        cand2.cargo = "Prefeito";
        cand2.bens = 2428000.00;
        cand2.numero_partido = 10;
        cand2.reeleicao = false;

        cand3.Nome = "HELIO HENRIQUE OLIVEIRA SOUZA JUNNIOR";
        cand3.data = "01/11/2000";
        cand3.genero = "Masculino";
        cand3.cargo = "Prefeito";
        cand3.bens = 1129342.65;
        cand3.numero_partido = 30;
        cand3.reeleicao = false;

        System.out.printf("Nome: %s \n Data de nascimento: %s \n Gênero: %s \n Cargo: %s \n Total de bens: R$ %f \n Número do partido: %d \n Reeleição: %b.", cand1.Nome ,cand1.data,cand1.genero, cand1.cargo, cand1.bens, cand1.numero_partido, cand1.reeleicao);
        System.out.println("\n");
        System.out.printf("Nome: %s \n Data de nascimento: %s \n Gênero: %s \n Cargo: %s \n Total de bens: R$ %f \n Número do partido: %d \n Reeleição: %b.", cand2.Nome ,cand2.data,cand2.genero, cand2.cargo, cand2.bens, cand2.numero_partido, cand2.reeleicao);
        System.out.println("\n");
        System.out.printf("Nome: %s \n Data de nascimento: %s \n Gênero: %s \n Cargo: %s \n Total de bens: R$ %f \n Número do partido: %d \n Reeleição: %b.", cand3.Nome ,cand3.data,cand3.genero, cand3.cargo, cand3.bens, cand3.numero_partido, cand3.reeleicao);
    }
}