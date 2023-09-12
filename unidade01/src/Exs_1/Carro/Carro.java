public class Carro {
    String marca;
    String modelo;
    int ano;

    // 10104235940
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro " +
                "[marca = " + marca +
                ", modelo = " + modelo +
                ", ano = " + ano +
                "]";
    }

}
