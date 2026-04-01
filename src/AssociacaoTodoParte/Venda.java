package AssociacaoTodoParte;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<ItemVenda> itens = new ArrayList<>();

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(int id, int qtd, Produto p) {
        itens.add(new ItemVenda(id, qtd, p));
    }
}