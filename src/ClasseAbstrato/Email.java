package ClasseAbstrato;

public class Email extends CanalNotificacao{
    private String assunto;
    public Email(){
        super();
    }

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando e-mail para " + this.destinatario +
                " com o assunto= " + this.assunto + this.mensagem);
    }

    @Override
    public String toString() {
        return "Email{" +
                super.toString() +
                "assunto='" + assunto + '\'' +
                '}';
    }


}

