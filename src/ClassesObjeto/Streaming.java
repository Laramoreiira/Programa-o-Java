package ClassesObjeto;

public class Streaming {

    String usuario;
    String plano;
    float mensalidade;
    boolean ativo;
    String ultimoFilmeAssistido;

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;

        if (plano.equals("Básico")) {
            mensalidade = 25.90f;
        } else if (plano.equals("Premium")) {
            mensalidade = 45.90f;
        } else if (plano.equals("Familia")) {
            mensalidade = 60.90f;
        }

        ativo = true;
        ultimoFilmeAssistido = "";
    }

    public void assistirFilme(String nomeFilme) {
        if (ativo) {
            ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("ClassesObjeto.Conta suspensa. Pague a fatura.");
        }
    }

    public void cancelarAssinatura() {
        ativo = false;
        System.out.println("Assinatura cancelada.");
    }

    public String toString() {
        String status = ativo ? "Ativo" : "Suspenso";

        return "Usuário: " + usuario +
                "\nPlano: " + plano +
                "\nMensalidade: $" + mensalidade +
                "\nStatus: " + status +
                "\nÚltimo filme: " + ultimoFilmeAssistido;
    }
}