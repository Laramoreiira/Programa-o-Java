package ClasseAbstrato;

import java.util.ArrayList;

public class GerenciadorNotificacoes {
    public static void main (String[] args){
        ArrayList<CanalNotificacao> canais = new ArrayList<CanalNotificacao>();

        canais.add(new Email("Carlos", "Venha tomar vacina", "Lembrete ")
        );
        canais.add(new Sms("Carlos", "Venha tomar vacina", 999999999)
        );
        canais.add(new Whatsapp("Carlos", "Venha tomar vacina", "Não lida")
        );
        // percorre vetor chamando o metodo enviar
        for(CanalNotificacao camaleao: canais){ // para cada canal
            camaleao.enviar(); // polimorfismo
        }
    }
}
