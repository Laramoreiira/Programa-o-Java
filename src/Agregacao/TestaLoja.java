package Agregacao;

public class TestaLoja {

    public static void main(String[] args) {

        // Criando produtos
        Produto p1 = new Produto(1, "Mouse", 50.0f);
        Produto p2 = new Produto(2, "Teclado", 120.0f);
        Produto p3 = new Produto(3, "Monitor", 900.0f);

        // Criando carrinho
        Carrinho carrinho = new Carrinho("Loja ProGamer");

        // Agregando produtos
        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);

        // Compondo itens de venda
        carrinho.gerarItem(1, 2, 50.0f);
        carrinho.gerarItem(2, 1, 120.0f);

        // Exibindo carrinho
        System.out.println(carrinho.toString());
    }
}