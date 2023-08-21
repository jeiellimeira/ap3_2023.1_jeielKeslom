import java.util.ArrayList;
import java.util.Scanner;
// 10104235940
public class TestaProduto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Carro> lista = new ArrayList<Carro>();

        char controle = 's';
        do {
            System.out.println("Digite o modelo do carro: ");
            String modelo = leia.next();
            System.out.println("Digite a marca do carro");
            String marca = leia.next();
            System.out.println("Digite o ano do carro: ");
            int ano = leia.nextInt();

            Carro c = new Carro(modelo, marca, ano);
            lista.add(c);

            System.out.println("Deseja cadastrar outro carro? (S/n)");

            controle = leia.next().charAt(0);

        } while (controle == 'S' || controle == 's');

        for (Carro i : lista) {
            System.out.println(i);
        }

        leia.close();
    }
}

class Carro {
    private String modelo;
    private String marca;
    private int ano;

    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + "]";
    }
}
