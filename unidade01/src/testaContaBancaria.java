class TestaContaBancaria {
    public static void main(String[] args) {
        contaBancaria cb1 = new contaBancaria ("1726125126", "Goku", 8001f,500);
        // 10104235940
        cb1.status();
        cb1.verificar();
        cb1.sacar();
        cb1.depositar();
        
        
        System.out.println();
        
        contaBancaria cb2 = new contaBancaria ("1022123126", "gohan", 82001f,90);
        cb2.status();
        cb2.verificar();
        cb2.sacar();
        cb2.depositar();

        
        System.out.println();
        
        contaBancaria cb3 = new contaBancaria ("1332332336", "picollo", -1f,0);
       
        cb2.verificar();
        cb2.sacar();
        cb2.depositar();

        
    }
}
