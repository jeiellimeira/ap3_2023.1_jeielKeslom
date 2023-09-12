// 10104235940
public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria p1 = new ContaBancaria();

        p1.setNumConta(1111);
        p1.setDono("gohan");
        p1.abrirConta("CC");
        p1.depositar(100);

        ContaBancaria p2 = new ContaBancaria();
        p2.setNumConta(2222);
        p2.setDono("goku");
        p2.abrirConta("CP");
        p2.depositar(500);
        ContaBancaria p3 = new ContaBancaria();
        p3.setNumConta(3333);
        p3.setDono("kuririn");
        p3.abrirConta("CP");
        p3.depositar(500);
        p3.sacar(100);

        p1.estadoAtual();
        p2.estadoAtual();
        p3.estadoAtual();

    }

}