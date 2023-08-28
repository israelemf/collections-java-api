package main.java.list.OperacoesBasicas.CarrinhoCompras;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Produto 1", new BigDecimal(189), 100);
        carrinhoDeCompras.adicionarItem("Produto 2", new BigDecimal(467), 12);
        carrinhoDeCompras.adicionarItem("Produto 3", new BigDecimal(876), 34);

        System.out.println(carrinhoDeCompras.obterInformacaoCarrinho());

        System.out.println("\nValor total dos produtos: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Produto 1");

        System.out.println("\nValor total dos produtos após remove Produto 1: " + carrinhoDeCompras.calcularValorTotal());
    }
}
