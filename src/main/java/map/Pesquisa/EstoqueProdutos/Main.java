package main.java.map.Pesquisa.EstoqueProdutos;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "Produto 1", 50, 29.90);
        estoqueProdutos.adicionarProduto(3, "Produto 2", 50, 65d);
        estoqueProdutos.adicionarProduto(2, "Produto 3", 50, 23d);
        estoqueProdutos.adicionarProduto(3, "Produto 4", 50, 212d);
        estoqueProdutos.adicionarProduto(5, "Produto 5", 50, 265d);
        estoqueProdutos.adicionarProduto(34, "Produto 6", 50, 12d);
        estoqueProdutos.adicionarProduto(12, "Produto 7", 50, 234d);
        estoqueProdutos.adicionarProduto(676, "Produto 8", 50, 2347.87);
        estoqueProdutos.adicionarProduto(43, "Produto 9", 50, 32);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total dos produtos: " + estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());

        System.out.println("Estoque mais caro: " + estoqueProdutos.obterProdutoEstoqueMaisCaro());

    }
}
