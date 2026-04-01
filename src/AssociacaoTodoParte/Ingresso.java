package AssociacaoTodoParte;

public class Ingresso {
    private int id;
    private String assento;
    private String tipo;
    private float preco;

    public Ingresso(int id, String assento, String tipo, float preco) {
        this.id = id;
        this.assento = assento;
        this.tipo = tipo;
        this.preco = preco;
    }

    public String toString() {
        return assento + " - " + tipo;
    }
}