package main.java.set.OperacoesBasicas.ConjuntoConvidado;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado1", 1);
        conjuntoConvidados.adicionarConvidado("Convidado2", 2);
        conjuntoConvidados.adicionarConvidado("Convidado3", 3);
        conjuntoConvidados.adicionarConvidado("Convidado4", 4);
        conjuntoConvidados.adicionarConvidado("Convidado5", 4);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(2);

        conjuntoConvidados.exibirConvidados();
    }
}
