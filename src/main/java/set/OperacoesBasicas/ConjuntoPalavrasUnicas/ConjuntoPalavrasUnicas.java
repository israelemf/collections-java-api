package main.java.set.OperacoesBasicas.ConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavraRemover) {
        for (String palavra : palavrasUnicasSet) {
            if (palavra.equalsIgnoreCase(palavraRemover)) {
                palavrasUnicasSet.remove(palavraRemover);
                break;
            }
        }
    }

    public void verificarPalavra(String palavraVerificar) {
        Boolean palavraExistente = false;
        for (String palavra : palavrasUnicasSet) {
            if (palavraVerificar.equalsIgnoreCase(palavra)) {
                palavraExistente = true;
                break;
            }
        }

        if (palavraExistente) {
            System.out.println("A palavra " + palavraVerificar + " existe no HashSet");
        } else {
            System.out.println("A palavra " + palavraVerificar + " não existe no HashSet");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicasSet);
    }
}
