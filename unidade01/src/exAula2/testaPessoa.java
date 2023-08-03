package exAula2;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.nome = "rafael";
        p1.idade = 16;
        p1.altura = 1.70f;
        
        p1.status();
        p1.fazerAniversario();
    }
}
