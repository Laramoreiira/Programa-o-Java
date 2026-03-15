package Agregacao;

public class ItemVenda {

    private int id;
    private int quantidade;
    private float valorUnitario;

    public ItemVenda(int id, int quantidade, float valorUnitario) {
        this.id = id;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ItemVenda [id=" + id +
                ", quantidade=" + quantidade +
                ", valorUnitario=" + valorUnitario + "]";
    }
}