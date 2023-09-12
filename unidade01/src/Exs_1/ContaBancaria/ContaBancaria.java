// 10104235940
public class ContaBancaria {
     / / Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual()  
            System.out.println("----------------------------
            System.out.println("conta: " + this.getNumConta
            System.out.println("tipo:  " + this.getTip
            System.out.println("don o: " + this.getDon
            System.out.println("saldo:" + this.getSaldo());
    }

    //  metodos personalizado

    public void abrirConta(String t)  {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC")  {
            this.setSaldo(50);
        }  else i (t ==  "CP") {
            this.setSaldo(150);
        }
        System.out.println("conta aberta com sucesso");

    

    public void fecharConta()  {
        if (this.getSaldo()   >  0) {
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
        } else if  (this.getSaldo( )  <  0) {
            System.out.println("conta não pode ser fechada pois tem débito");
        }  els e
             this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        
    

    public void depositar(float v)  {
        if (this.getStatus())  
             // this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de: " + this.getDono());
        }  els e {
            System.out.println("impossivel depositar em uma conta fechada!");
        }

    

    public void sacar(float v)  

        if (this.getStatus())  {
            if (this.getSaldo() >= v {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de: "   + getDono());
            }  els e {
                System.out.println("Saldo insuficiente para saque");
            }
        }  els e {
            System.out.println("impossivel sacar uma conta fechada!");
        }

    

    public void pagarMensal()  {
        int v = 0;
        if (this.getTipo() == "CC")  {
            v   = 12;
        } else if (this.getTipo() ==  "CP" ) {
            v   = 20;
        }
        if (this.getStatus())  
                this.setSaldo(this.getSaldo() -
                System.out.println("mensalidade paga com sucesso p or " + this.getDono());
        }  els e {
            System.out.println("impossivel pagar com uma conta fechada!");
        }

    }

    //  métodos especiais

    public void ContaBanco()  {
        this.saldo = 0;
        this.status = false;
    }

    
    public int getNumConta() {
     

    }

    p

        this.numConta = numConta;
    }


    public String getTipo() {
        return tipo;
    }

    
    public void setTipo(String t) {
     

    }

    p

        return dono;
    }


    public void setDono(String dono) {
        this.dono = dono;
    }

    
    public float getSaldo() {
     

    }

    p


    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}