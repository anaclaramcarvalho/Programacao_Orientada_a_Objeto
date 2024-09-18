//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Candidatos [] candidato = new Candidatos[3];
    candidato[0] = new Candidatos();
    candidato[0].nome = "ANDRÉ LUIZ";
    candidato[0].data = "29/12/1981";
    candidato[0].genero = "Masculino";
    candidato[0].cargo = "Prefeito";
    candidato[0].bens = 962000.00;
    candidato[0].numero_partido = 55;
    candidato[0].reeleicao = false ;


    candidato[1] = new Candidatos();
    candidato[1].nome = "MARCELO RODRIGUES DA SILVA";
    candidato[1].data = "17/07/1970";
    candidato[1].genero = "Masculino";
    candidato[1].cargo = "Prefeito";
    candidato[1].bens = 2428000.00;
    candidato[1].numero_partido = 10;
    candidato[1].reeleicao = false;


    candidato[2] = new Candidatos();
    candidato[2].nome = "HELIO HENRIQUE OLIVEIRA SOUZA JUNNIOR";
    candidato[2].data = "01/11/2000";
    candidato[2].genero = "Masculino";
    candidato[2].cargo = "Prefeito";
    candidato[2].bens = 1129342.65;
    candidato[2].numero_partido = 30;
    candidato[2].reeleicao = false;

    int i = 0;
    for(Candidatos cand : candidato){
        System.out.printf("Nome: %s \n Data de nascimento: %s \n Gênero: %s \n Cargo: %s \n Total de bens: R$ %f \n Número do partido: %d \n Reeleição: %b.", candidato[i].nome ,candidato[i].data,candidato[i].genero, candidato[i].cargo, candidato[i].bens, candidato[i].numero_partido, candidato[i].reeleicao);
        System.out.println("\n");
        i++;
    }
    }
}