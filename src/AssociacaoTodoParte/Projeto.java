package AssociacaoTodoParte;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadores = new ArrayList<>();

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
    }

    public void adicionarProgramador(Programador p) {
        programadores.add(p);
    }

    public void listarProgramadores() {
        for (Programador p : programadores) {
            System.out.println(p.getNome());
        }
    }
}