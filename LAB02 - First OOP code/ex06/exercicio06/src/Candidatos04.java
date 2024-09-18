public class Candidatos04 {
        private String nome;
        private String data;
        private String genero;
        private String cargo ;
        private double bens;
        private int numero_partido;
        private boolean reeleicao;

        public Candidatos04(String nome,String data,String genero,String cargo,double bens,int numero_partido,boolean reeleicao){
            this.nome = nome;
            this.data = data;
            this.genero = genero;
            this.cargo = cargo;
            this.bens = bens;
            this.numero_partido = numero_partido;
            this.reeleicao = reeleicao;
        }

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
            return this.data;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }
        public String getGenero(){
            return this.genero;
        }

        public void setCargo(String cargo){
            this.cargo = cargo;
        }
        public String getCargo(){
            return this.cargo;
        }

        public void setBens(double bens){
            this.bens = bens;
        }
        public double getBens(){
            return this.bens;
        }


        public void setReeleicao(boolean reeleicao){
            this.reeleicao = reeleicao;
        }
        public boolean isReeleicao(){
            return this.reeleicao;
        }


        public void setNumero_partido(int numero_partido){
            this.numero_partido = numero_partido;
        }
        public int getNumero_partido(){
            return this.numero_partido;
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
//O construtor ele está criando e já colocando os valores dentro das variaveis, um construtor não excluiu o set e o get
//Para mudar ,por exemplo, só o nome você usa o set, pois se só mudar lá na main você vai estar criando outro objeto
