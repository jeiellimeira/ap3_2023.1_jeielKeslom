public class produtos {
    import java.util.ArrayList;

class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void adicionarProduto(int quantidade) {
        quantidadeEmEstoque += quantidade;
    }

    public void removerProduto(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    @Override
    public String toString() {
        return "Produto: " + nome + "\nPreço: R$" + preco + "\nQuantidade em Estoque: " + quantidadeEmEstoque;
    }
}

public class TestaProduto {
    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();

        // Adicionar produtos ao estoque
        estoque.add(new Produto("Produto 1", 10.99, 50));
        estoque.add(new Produto("Produto 2", 5.75, 100));
        // ... adicione mais produtos aqui ...

        // Remover produtos do estoque
        estoque.get(0).removerProduto(20);
        estoque.get(1).removerProduto(150);

        // Exibir informações dos produtos
        for (Produto produto : estoque) {
            System.out.println(produto);
            System.out.println("-------------------");
        }
    }
}

}
