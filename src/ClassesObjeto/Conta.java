package ClassesObjeto;

public class Conta {

    // Atributos públicos
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status; // true = ativa | false = encerrada

    // Construtor
    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0f;
        this.status = true;
    }

    // Método para depositar
    public void depositar(float valor) {
        if (status) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("ClassesObjeto.Conta inativa. Não é possível depositar.");
        }
    }

    // Método para sacar
    public void sacar(float valor) {
        if (!status) {
            System.out.println("ClassesObjeto.Conta inativa.");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Método para encerrar conta
    public void encerrarConta() {
        if (saldo == 0) {
            status = false;
            System.out.println("ClassesObjeto.Conta encerrada com sucesso.");
        } else {
            System.out.println("Não é possível encerrar a conta. Saque o saldo restante primeiro.");
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Número da ClassesObjeto.Conta: " + numeroConta +
                "\nAgência: " + agencia +
                "\nCliente: " + nomeCliente +
                "\nSaldo Atual: R$ " + saldo +
                "\nStatus: " + (status ? "Ativa" : "Encerrada");
    }
}