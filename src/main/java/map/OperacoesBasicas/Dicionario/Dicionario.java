package main.java.map.OperacoesBasicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String chave, String traducao) {
        dicionario.put(chave, traducao);
    }

    public void removerPalavra(String chave) {
        if (!dicionario.isEmpty()) {
            dicionario.remove(chave);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionario);
    }

    public String pesquisarPorPalavra(String chave) {
        String palavra = null;
        if (!dicionario.isEmpty()) {
            palavra = dicionario.get(chave);
        }
        return palavra;
    }


}
