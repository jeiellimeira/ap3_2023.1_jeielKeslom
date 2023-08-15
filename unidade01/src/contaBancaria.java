//Crie uma classe chamada "ContaBancaria" que tenha os atributos número da conta, nome do titular e saldo. Implemente métodos para depositar, sacar e verificar o saldo da conta. Implemente getters, setters e toString. Crie a classe TestaContaBancaria, com 3 contas.

public class contaBancaria {
    String numeroConta;
    String nomeTitular;
    int saldo;
     //// 10104235940

    

    
    



    public contaBancaria(String numeroConta, String nomeTitular, int saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }
    
    public contaBancaria() {
    }

    public contaBancaria(String numeroConta2, String nomeTitular2, float f) {
    }

    @Override
    public String toString() {
       return "nome do titular: " + nomeTitular + "numero da conta: " + numeroConta + " saldo: " + saldo;
    }
}
    
   

    

    

  
