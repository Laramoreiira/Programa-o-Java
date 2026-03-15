package Agregacao;

import java.util.ArrayList;

import java.util.ArrayList;

public class Carrinho {

    private String nomeLoja;
    private ArrayList<Produto> produtos;
    private ArrayList<ItemVenda> itens;

    public Carrinho(String nomeLoja) {
        this.nomeLoja = nomeLoja;
        produtos = new ArrayList<>();
        itens = new ArrayList<>();
    }

    // Agregação
    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public void exibirCarrinho() {
        System.out.println("Loja: " + nomeLoja);
        System.out.println("Produtos no carrinho:");

        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    // Composição
    public void gerarItem(int id, int qtd, float valor) {
        ItemVenda item = new ItemVenda(id, qtd, valor);
        itens.add(item);
    }

    public void removerItem(int id) {
        for (ItemVenda item : itens) {
            if (item.getId() == id) {
                itens.remove(item);
                break;
            }
        }
    }

    @Override
    public String toString() {

        String resultado = "Loja: " + nomeLoja;

        resultado += "\nProdutos:\n";
        for (Produto p : produtos) {
            resultado += p + "\n";
        }

        resultado += "\nItens de Venda:\n";
        for (ItemVenda i : itens) {
            resultado += i + "\n";
        }
        return resultado;
    }
}