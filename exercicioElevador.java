package elevador;

public class exercicioElevador {
    int capacidade;
    int andar;
    int andar_atual=0;
    int total_andares;
    int pessoas;

    
    
    public void setInicializa(int capacidade, int total_andares) {

        this.capacidade = capacidade;
        this.total_andares = total_andares;

    }
    public void saiPessoa(int pessoas) {
        if (capacidade <= this.pessoas) {
            this.pessoas = pessoas - this.pessoas;
        }
    }

    public void entraPessoa(int pessoas) {
        if (capacidade + pessoas <= this.pessoas) {
            this.pessoas = pessoas + this.pessoas;
        }
    }
    public void sobeAndar(int andar_atual) {
        if (andar_atual >= 0 && this.andar_atual <= total_andares) {

            this.andar_atual = andar_atual;
        }
    }
        public void desceAndar(int andar){
            if (andar_atual > 0 && this.andar < total_andares) {

                this.andar_atual = andar_atual;
            }

        }
    public int getcapacidade() {
        return capacidade;
    }
    public void setcapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getAndar_atual() {
        return andar_atual;
    }

    public void setAndar_atual(int andar_atual) {
        this.andar_atual = andar_atual;
    }

    public int getTotal_andares() {
        return total_andares;
    }

    public void setTotal_andares(int total_andares) {
        this.total_andares = total_andares;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }
}

//Eu me darei nota 8 pois não completei o exercicio sozinho e precisei de ajuda para finalizar o exercicio.