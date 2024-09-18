public class Eleicoes {
        String municipio; //atributos
        double votantes;
        Candidatos04 candidatos[];
        String cargo;

        public Eleicoes(String municipio, double votantes, Candidatos04[] candidatos, String cargo) {
            this.municipio = municipio;
            this.votantes = votantes;
            this.candidatos = candidatos;
            this.cargo = cargo;
        }

        public void setMunicipio(String municipio) {
            this.municipio = municipio;
        }
        public String getMunicipio() {
            return this.municipio;
        }

        public void setVotantes(double votantes) {
            this.votantes = votantes;
        }
        public double getVotantes() {
            return this.votantes;
        }

        public void setCandidatos(Candidatos04[] candidatos) {
            this.candidatos = candidatos;
        }
        public Candidatos04[] getCandidatos() {
            return this.candidatos;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }
        public String getCargo() {
            return this.cargo;
        }

        public double maiorBens(){
            Candidatos04 [] c = getCandidatos();
            double maior = c[0].getBens(), totalbens = 0, porcentagebens = 0;
            int pos = 0;
            for(int i = 1;i < candidatos.length;i++){
                if(c[i].getBens() > maior){
                    maior = c[i].getBens();
                    pos = i;
                }
                totalbens += c[i].getBens();
            }
            System.out.println(c[pos].imprimirCandidatos());
            porcentagebens = (100*c[pos].getBens())/totalbens;
            return porcentagebens;
        }
}

