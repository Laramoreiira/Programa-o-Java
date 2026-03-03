public class TestaConta {

    public static void main(String[] args) {

        // Conta 1 do João Silva
        Conta c1 = new Conta(1234, 1, "João Silva");

        c1.depositar(500.00f);
        c1.sacar(200.00f);

        System.out.println("\nEstado da conta c1:");
        System.out.println(c1);

        // Conta 2 da Maria Souza
        Conta c2 = new Conta(5678, 1, "Maria Souza");

        System.out.println("\nTentando sacar R$ 50,00 da conta c2:");
        c2.sacar(50.00f);

        // Tentando encerrar conta c1 com saldo
        System.out.println("\nTentando encerrar a conta c1:");
        c1.encerrarConta();

        // Sacando restante e encerrando
        System.out.println("\nSacando o restante da conta c1:");
        c1.sacar(c1.saldo);

        System.out.println("\nEncerrando a conta c1:");
        c1.encerrarConta();

        System.out.println("\nDados finais da conta c1:");
        System.out.println(c1);
    }
}