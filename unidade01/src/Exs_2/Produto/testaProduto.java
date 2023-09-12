package exAula2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaProduto {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Produto> lista = new ArrayList<>();

        char controle = 's';

        do {
            System.out.println("Digite o nome do produto: ");
            String nome = leia.next();
            System.out.println("Digite o preço do produto: ");
            float preco = leia.nextFloat();
            System.out.println("Digite a quantidade do produto: ");
            int quant = leia.nextInt();

            Produto p = new Produto(nome, preco, quant);
            lista.add(p);

            System.out.println("Deseja cadastrar outro produto? (S para sim, qualquer outra tecla para não)");
            controle = leia.next().charAt(0);

        } while (controle == 'S' || controle == 's');

        for (Produto produto : lista) {
            System.out.println(produto);
        }

        leia.close(); // Feche o Scanner quando não precisar mais dele.
    }
}
