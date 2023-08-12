
public class Pessoa {
   String nome;
   int idade;
   float altura;
  // 10104235940
   public Pessoa(String nome, int idade, float altura) {
      this.nome = nome;
      this.idade = idade;
      this.altura = altura;
   }
   
   @Override
   public String toString() {
      return "nome: " + nome + " idade: " + idade + " altura: " + altura;
   }

 public void fazerAniversario() {
        idade++;
        System.out.println("Feliz aniversário! Agora você tem " + idade + " anos.");
    }

    public boolean ehMaiorDeIdade() {
        return idade >= 18;
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("kuririn", 20, 1.75f);
        System.out.println(pessoa);

        pessoa.fazerAniversario();
        System.out.println(pessoa);

        if (pessoa.ehMaiorDeIdade()) {
            System.out.println("Essa pessoa é maior de idade.");
        } else {
            System.out.println("Essa pessoa não é maior de idade.");
        }
    }
   }
   