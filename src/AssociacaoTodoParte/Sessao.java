package AssociacaoTodoParte;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;
    private Filme filme;
    private ArrayList<Ingresso> ingressos = new ArrayList<>();

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
    }

    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco) {
        ingressos.add(new Ingresso(id, assento, tipo, preco));
    }

    public void imprimir() {
        System.out.println("Filme: " + filme);
        System.out.println("Ingressos:");
        for (Ingresso i : ingressos) {
            System.out.println(i);
        }
    }
}