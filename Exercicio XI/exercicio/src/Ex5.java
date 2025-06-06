public class Ex5 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(12345, "Carlos Silva");

        System.out.println("Conta: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getNomeCorrentista());
        System.out.println("Saldo: R$ " + conta.getSaldo());

        conta.deposito(1000);
        System.out.println("Após depósito de R$ 1000: " + conta.getSaldo());

        boolean saqueRealizado = conta.saque(300);
        if (saqueRealizado) {
            System.out.println("Após saque de R$ 300: " + conta.getSaldo());
        } else {
            System.out.println("Saque não realizado (saldo insuficiente)");
        }

        conta.alterarNome("Carlos A. Silva");
        System.out.println("Nome alterado: " + conta.getNomeCorrentista());
    }
}
