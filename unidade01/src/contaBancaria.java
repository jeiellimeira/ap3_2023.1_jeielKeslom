// 10104235940
public class ContaBancaria {
   //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
    System.out.println("-----------------------------");
    System.out.println("conta: " + this.getNumConta());
    System.out.println("tipo: " +this.getTipo());
    System.out.println("dono: "+ this.getDono());
    System.out.println("saldo:" + this.getSaldo());
    }
    
    //metodos personalizados
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        }else if  (t =="CP") {
            this.setSaldo(150);
        }
        System.out.println("conta aberta com sucesso");
            
        
    }
    public void fecharConta(){
        if (this.getSaldo()>0){
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
        } else if(this.getSaldo()<0){
            System.out.println("conta não pode ser fechada pois tem débito");
        }else{
           this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
            }
        }
            
    public void depositar(float v){
        if (this.getStatus()){
           // this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de: " + this.getDono());
        }else{
            System.out.println("impossivel depositar em uma conta fechada!");
        }

        }

    public void sacar(float v){
        
        if (this.getStatus()){
            if (this.getSaldo() >= v ) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de: "+getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("impossivel sacar uma conta fechada!");
        }
                
            }

    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v=12;
        } else if (this.getTipo() =="CP"){
            v=20;
        }
        if (this.getStatus()){
        this.setSaldo(this.getSaldo() - v);
        System.out.println("mensalidade paga com sucesso por "+ this.getDono());
        }else{
            System.out.println("impossivel pagar com uma conta fechada!");
        }
        
    }

    //métodos especiais

    public void ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}