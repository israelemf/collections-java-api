package main.java.set.ConjuntoPalavrasUnicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Teste1");
        conjuntoPalavrasUnicas.adicionarPalavra("Teste2");
        conjuntoPalavrasUnicas.adicionarPalavra("Teste5");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Teste2");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Teste");
        conjuntoPalavrasUnicas.verificarPalavra("Teste5");
    }
}
