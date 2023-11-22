public class Assento {
    public Assento(int numeroAssento, TipoAssento tipo, boolean disponivel) {
        this.numeroAssento = numeroAssento;
        this.tipo = tipo;
        this.disponivel = disponivel;
    }
    private int numeroAssento;
    private TipoAssento tipo;
    private boolean disponivel;
    public int getNumeroAssento() {
        return numeroAssento;
    }
    public void setNumeroAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }
    public TipoAssento getTipo() {
        return tipo;
    }
    public void setTipo(TipoAssento tipo) {
        this.tipo = tipo;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
