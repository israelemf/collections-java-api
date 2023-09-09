package main.java.map.Pesquisa.ContagemPalavras;

import main.java.map.Pesquisa.EstoqueProdutos.Produto;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemPalavras.isEmpty()) {
            contagemPalavras.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemPalavras);
    }

    public void encontrarPalavraMaisFrequente() {
        Map.Entry<String, Integer> palavraMaisFrequente = null;
        int controleContagem = Integer.MIN_VALUE;

        if (!contagemPalavras.isEmpty()) {
            for (Map.Entry<String, Integer> palavra : contagemPalavras.entrySet()) {
                if (palavra.getValue() > controleContagem) {
                    palavraMaisFrequente = palavra;
                }
            }
        }
        System.out.println("Palavra mais frequente na contagem: \n" + palavraMaisFrequente);
    }
}
