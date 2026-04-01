package ClasseAbstrato;

public class Whatsapp extends CanalNotificacao{
    private String StatusLeitura;

    public Whatsapp() {
        super();
    }

    public Whatsapp(String statusLeitura) {
        StatusLeitura = statusLeitura;
    }

    public Whatsapp(String destinatario, String mensagem, String statusLeitura) {
        super(destinatario, mensagem);
        StatusLeitura = statusLeitura;
    }

    public void enviar() {
        System.out.println("Enviando Zap para " + this.destinatario +
                " mensagem: " + this.mensagem);
    }
}
