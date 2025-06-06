public class ContaCorrente {
    
    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;

    
    public ContaCorrente(int numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0;
    }

    
    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldoInicial;
    }

    
    public void alterarNome(String novoNome) {
        this.nomeCorrentista = novoNome;
    }

    
    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    
    public boolean saque(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false; 
    }

    
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }
}
