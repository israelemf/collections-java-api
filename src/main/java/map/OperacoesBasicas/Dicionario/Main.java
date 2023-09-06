package main.java.map.OperacoesBasicas.Dicionario;

public class Main {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("homem", "man");
        dicionario.adicionarPalavra("nosso", "our");
        dicionario.adicionarPalavra("nós", "our");
        dicionario.adicionarPalavra("carro", "car");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("homem");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("carro"));
    }
}
