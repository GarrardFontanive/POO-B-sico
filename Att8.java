public class Att8 {
    private int numeroConta;
    private String nome;
    private double saldo;

    public Att8(int numeroConta, String nome, double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    public void deposito(double valor) {
        if (valor > 0) saldo += valor;
    }

    public void saque(double valor) {
        if (valor > 0 && valor <= saldo) saldo -= valor;
    }

    public String toString() {
        return "Conta: " + numeroConta + " | Nome: " + nome + " | Saldo: R$ " + saldo;
    }
}
