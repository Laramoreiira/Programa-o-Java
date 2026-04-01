package AssociacaoTodoParte;

public class Computador {
    private int id;
    private String marca;
    private Processador processador;

    public Computador(int id, String marca) {
        this.id = id;
        this.marca = marca;
        this.processador = new Processador("Intel", "i5", 3.2);
    }
}