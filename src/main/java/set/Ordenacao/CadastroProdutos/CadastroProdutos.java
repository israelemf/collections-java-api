package main.java.set.Ordenacao.CadastroProdutos;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtosSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutos() {
        return produtosSet;
    }

    public Set<Produto> exibirProdutosPorNome() {
        // O TreeSet permite que a gente organize os dados.
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new CompararPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }
}
