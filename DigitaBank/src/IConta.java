public interface IConta {
    void sacar (double valor);
    void  depositrar (double valor);
    void transferir(double valor, Conta constaDestino);
    void imprimirExtrato();
}
