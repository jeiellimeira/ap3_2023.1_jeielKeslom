package exAula2;

import java.util.ArrayList;
import java.util.Scanner;

public class testaProduto {
public static void main(String[] args) {
    Scanner leia = new Scanner (System.in);
    // 10104235940
    ArrayList <Produto> lista = new ArrayList <Produto>();
    



    char controle = 's';
    do {
        System.out.println("Digite o nome do produto: ");
        String nome = leia.next();
        System.out.println("Digite o preço do produto");
        float preco = leia.nextFloat();
        System.out.println("digite a quantidade do produto");
        int quant = leia.nextInt();

        Produto p = new Produto(nome, preco, quant);
        lista.add(p);

        System.out.println("deseja cadastrar outro produto?");

        controle = leia.next().charAt(0);

    } while (controle == 'S' || controle == 's');
        for (Produto i : lista){
            System.out.println(i);
        }
            
        }
    }
    
