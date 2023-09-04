package main.java.set.Pesquisa.Contato;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Israel", "(41)99564-2868");
        agendaContatos.adicionarContato("Israel", "(41)99564-2868");
        agendaContatos.adicionarContato("Israel2", "(41)99564-2868");
        agendaContatos.adicionarContato("Israel3", "(41)99564-2868");
        agendaContatos.adicionarContato("Israel4", "(41)99564-2868");

        agendaContatos.exibirContatos();

        agendaContatos.atualizarNumeroContato("Israel", "(47)99564-2868");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Israel"));
    }
}
