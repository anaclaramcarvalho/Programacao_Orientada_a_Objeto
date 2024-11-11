public class Servico implements Classificavel{
        private double preco;

        public Servico(double preco){
            this.preco = preco;
        }

        public int eMenorQue(Classificavel o) {
            Servico outroServico = (Servico) o;
            if (this.preco < outroServico.preco) {
                return 1;
            }
            if (this.preco > outroServico.preco) {
                return -1;
            } else {
                return 0;
            }
        }

        public double getPreco() {
            return preco;
        }
        public void setPreco(double preco) {
            this.preco = preco;
        }
    }
