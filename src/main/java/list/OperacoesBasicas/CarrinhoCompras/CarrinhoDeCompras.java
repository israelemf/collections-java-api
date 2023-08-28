package main.java.list.OperacoesBasicas.CarrinhoCompras;

import main.java.list.OperacoesBasicas.Tarefa.Tarefa;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, BigDecimal preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem() {
        List<Item> itensRemover = new ArrayList<>();

        for (Item item : itens) {
            if (item.getDescricao().equalsIgnoreCase(descricao)) {
                itensRemover.add(item);
            }
        }
        itens.removeAll(itensRemover);
    }

    public String calcularValorTotal() {
        BigDecimal valorTotal = BigDecimal.ZERO;

        for (Item item : itens) {
            valorTotal = valorTotal.add(item.getPreco().multiply(new BigDecimal(item.getQuantidade())));
        }

        return NumberFormat.getCurrencyInstance().format(new DecimalFormat("#,###,##0.00").format(valorTotal));
    }

    public StringBuilder obterInformacaoItem() {
        StringBuilder informacoesItem = new StringBuilder("\nInformações dos itens");

        for (Item item : itens) {
            informacoesItem.append("\n\n").append(item);
        }

        return informacoesItem;
    }
}
