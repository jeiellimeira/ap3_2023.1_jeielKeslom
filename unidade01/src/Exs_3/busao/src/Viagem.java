import java.util.ArrayList;

public class Viagem {
   int  numeroViagem;
    private String origem;
    private String destino;
    private String dataHoraPartida;
    private String dataHoraChegada;

    ArrayList<Assento>todosOsAssentos;
   
    
    
    
    
    public Viagem(int numeroViagem, String origem, String destino, String dataHoraPartida, String dataHoraChegada) {
        this.numeroViagem = numeroViagem;
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
        this.dataHoraChegada = dataHoraChegada;

        for (int i = 1; i <=20; i++) {
            todosOsAssentos.add(new Assento(i, TipoAssento.CORREDOR, true));
        }
        for (int i = 1;i<=20; i++) {
            todosOsAssentos.add(new Assento(i+20, TipoAssento.JANELA), true);
        }
    }

    public int getNumeroViagem() {
        return numeroViagem;
    }

    public void setNumeroViagem(int numeroViagem) {
        this.numeroViagem = numeroViagem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataHoraPartida() {
        return dataHoraPartida;
    }

    public void setDataHoraPartida(String dataHoraPartida) {
        this.dataHoraPartida = dataHoraPartida;
    }

    public String getDataHoraChegada() {
        return dataHoraChegada;
    }

    public void setDataHoraChegada(String dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
    }

    public ArrayList<Assento> getTodosOsAssentos() {
        return todosOsAssentos;
    }

    public void setTodosOsAssentos(ArrayList<Assento> todosOsAssentos) {
        this.todosOsAssentos = todosOsAssentos;
    }

}
