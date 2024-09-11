public class Candidatos02 {
        private String nome;
        private String data;
        private String genero;
        private String cargo ;
        private double bens;
        private boolean reeleicao;
        private int numero_partido;

        public void setNome(String Nome){
            this.nome = Nome;
        }
        public String getNome(){
            return this.nome;
        }

        public void setData(String data){
            this.data = data;
        }
        public String getData(){
            return data;
        }

        public void setGenero(String genero){
             this.genero = genero;
        }
        public String getGenero(){
            return genero;
        }

        public void setCargo(String cargo){
            this.cargo = cargo;
        }
        public String getCargo(){
            return cargo;
        }

        public void setBens(double bens){
             this.bens = bens;
        }
        public double getBens(){
             return bens;
        }


        public void setReeleicao(boolean reeleicao){
            this.reeleicao = reeleicao;
        }
        public boolean isReeleicao(){
            return reeleicao;
        }


        public void setNumero_partido(int numero_partido){
            this.numero_partido = numero_partido;
        }
        public int getNumero_partido(){
             return numero_partido;
        }

        public String imprimirCandidatos(){
            String r = "";
            r += "\n" + getNome();
            r += "\n" + getData();
            r += "\n" + getGenero();
            r += "\n" + getCargo();
            r += "\n" + getBens();
            r += "\n" + getNumero_partido();
            r += "\n" + isReeleicao();
            return r;
        }

}
//O set e o get podem ser usados sem uma ordem e local especifico, posso começar com o get e depois ir para o set e vice-versa
