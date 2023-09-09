package main.java.map.Pesquisa.ContagemPalavras;

public class Main {
    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Palavra 1", 200);
        contagemPalavras.adicionarPalavra("Palavra 2", 56);
        contagemPalavras.adicionarPalavra("Palavra 3", 43);
        contagemPalavras.adicionarPalavra("Palavra 4", 23);
        contagemPalavras.adicionarPalavra("Palavra 5", 87);

        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.encontrarPalavraMaisFrequente();
    }
}
