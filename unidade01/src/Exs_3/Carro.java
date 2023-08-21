
public class Carro {
// 10104235940
    String modelo;
    String marca;
    int ano;
    
    public Carro (String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }
@Override
public String toString(){
    return "modelo: " + modelo + "marca: " + marca + " ano: " + ano;

}








public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public float getPreco() {
    return preco;
}
public void setPreco(float preco) {
    this.preco = preco;
}
public int getQuant() {
    return quant;
}
public void setQuant(int quant) {
    this.quant = quant;
}
    
}
