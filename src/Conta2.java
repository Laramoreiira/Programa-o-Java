public class Conta2 {

    // Atributos
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    // Construtor
    public Conta2(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    // Depositar
    public void depositar(float valor) {
        if (status) {
            saldo += valor;
            System.out.println("Depósito realizado. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Conta inativa.");
        }
    }

    // Sacar
    public void sacar(float valor) {
        if (!status) {
            System.out.println("Conta inativa.");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Encerrar conta
    public void encerrarConta() {
        if (saldo == 0) {
            status = false;
            System.out.println("Conta encerrada com sucesso.");
        } else {
            System.out.println("Não é possível encerrar. Saque o dinheiro antes.");
        }
    }

    // toString
    public String toString() {
        String situacao = status ? "Ativa" : "Encerrada";
        return "Conta: " + numeroConta +
                "\nAgência: " + agencia +
                "\nCliente: " + nomeCliente +
                "\nSaldo: R$ " + saldo +
                "\nStatus: " + situacao;
    }
}