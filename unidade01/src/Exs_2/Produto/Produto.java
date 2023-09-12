package exAula2;

//Crie uma classe chamada "Produto" que tenha os atributos nome, preço e quantidade em estoque. Implemente métodos para adicionar e remover produtos do estoque, além de exibir as informações completas do produto. Implemente getters, setters e toString. Crie a classe TestaProduto, com 258 produtos. Utilize uma coleção do tipo "ArrayList" para armazenar os produtos em estoque.
public class Produto {
    // 10104235940
    String nome;
    float preco;
    int quant;

    public Produto(String nome, float preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
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

    @Override
    public String toString() {
        return "nome: " + nome + " preço: " + preco + " quantidade em estoque: " + quant;

    }

}