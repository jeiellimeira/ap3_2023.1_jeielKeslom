//Crie uma classe chamada "ContaBancaria" que tenha os atributos número da conta, nome do titular e saldo. Implemente métodos para depositar, sacar e verificar o saldo da conta. Implemente getters, setters e toString. Crie a classe TestaContaBancaria, com 3 contas.
 // 10104235940
public class contaBancaria {
    String NomeConta;
    float saldo;
    String NumeroConta;
    float dep = 500f;
    

    public contaBancaria(String nc, String nmc, float s,float d) {
        this.NumeroConta = nc;
        this.NomeConta = nmc;
        this.saldo = s;
        this.dep = d;
    }

    public void status(){
        System.out.println("Nome do usuario: " +this.NomeConta);
        System.out.println("Número da conta: "+ this.NumeroConta);
        System.out.println("Saldo: R$"+this.saldo);
    }
    public void verificar(){
        System.out.println("o seu saldo atual é de: R$" +this.saldo );
    }

    public void sacar(){
        if (saldo > 0) {
            System.out.println("voce pode sacar");
        } else {
            System.out.println("ERRO voce não pode sacar");
        }
    }

    public void depositar(){
         System.out.println("você depositou: R$"+this.dep);
    }
    
}