package main.java.set.Ordenacao.CadastroProdutos;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto", 15.43, 45);
        cadastroProdutos.adicionarProduto(2L, "Produto 2", 13.43, 13);
        cadastroProdutos.adicionarProduto(2L, "Produto 3", 13.43, 13);
        cadastroProdutos.adicionarProduto(3L, "Produto 4", 546, 10);
        cadastroProdutos.adicionarProduto(4L, "Produto 5 ", 99, 0);
        cadastroProdutos.adicionarProduto(5L, "Produto 6", 56.98, 2);

        System.out.println();

        System.out.println(cadastroProdutos.exibirProdutos());

        System.out.println("Por preço: \n" + cadastroProdutos.exibirProdutosPorPreco());
        System.out.println("Por nome: \n" + cadastroProdutos.exibirProdutosPorNome());

    }
}
