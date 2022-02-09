public class main {
    public static void main(String[] args) {
        Cliente Milena = new Cliente();
        Milena.setNome("Milena");
        Conta cc = new ContaCorrente(Milena);
        Conta poupanca = new ContaPoupanca(Milena);
        cc.depositrar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
