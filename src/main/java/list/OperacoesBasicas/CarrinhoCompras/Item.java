package main.java.list.OperacoesBasicas.CarrinhoCompras;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Item {
    private String descricao;
    private BigDecimal preco;
    private int quantidade;

    public Item(String descricao, BigDecimal preco, int quantidade) {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "\nDescrição: " + descricao +
                "\nPreço: " + NumberFormat.getCurrencyInstance().format(preco) +
                "\nQuantidade=" + quantidade;
    }
}
