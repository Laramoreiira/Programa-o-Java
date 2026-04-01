package AssociacaoTodoParte;

public class Programador {
    private int id;
    private String nome;
    private String linguagem;

    public Programador(int id, String nome, String linguagem) {
        this.id = id;
        this.nome = nome;
        this.linguagem = linguagem;
    }

    public String getNome() {
        return nome;
    }
}