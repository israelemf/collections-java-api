package main.java.map.Pesquisa.EstoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private final Map<Long, Produto> produtos;

    public EstoqueProdutos() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        produtos.put(codigo, new Produto(codigo, nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(produtos);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;

        if (!produtos.isEmpty()) {
            for (Produto produto : produtos.values()) {
                valorTotalEstoque += produto.getQuantidade() * produto.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!produtos.isEmpty()) {
            for (Produto produto : produtos.values()) {
                if (produto.getPreco() > maiorPreco) {
                    maiorPreco = produto.getPreco();
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if (!produtos.isEmpty()) {
            for (Produto produto : produtos.values()) {
                if (produto.getPreco() < menorPreco) {
                    menorPreco = produto.getPreco();
                    produtoMaisBarato = produto;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoEstoqueMaisCaro() {
        Produto produtoMaisCaroEmEstoque = null;
        double maiorPrecoEstoque = Double.MIN_VALUE;

        if (!produtos.isEmpty()) {
            for (Produto produto : produtos.values()) {
                if (produto.getQuantidade() * produto.getPreco() > maiorPrecoEstoque) {
                    maiorPrecoEstoque = produto.getQuantidade() * produto.getPreco();
                    produtoMaisCaroEmEstoque = produto;
                }
            }
        }
        return produtoMaisCaroEmEstoque;
    }
}
