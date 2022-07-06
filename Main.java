package Banco;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        Cliente Pedro = new Cliente();
        Pedro.setNome("Pedro");

        Conta cc = new contaCorrente(Pedro);
        Conta poupanca = new contaPoupanca(Pedro);

        cc.depositar(120);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
