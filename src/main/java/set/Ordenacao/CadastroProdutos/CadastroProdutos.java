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

    public Set<Produto> exibirProdutosPorNome() {
        // O TreeSet permite que a gente organize os dados.
        return new TreeSet<>(produtosSet);
    }

    public Set<Produto> exibirProdutosPorPreco() {
        return new TreeSet<>(new CompararPorPreco());
    }
}
