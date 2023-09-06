package main.java.map.OperacoesBasicas.AgendaContatos;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Israel", "41995642868");
        agendaContatos.adicionarContato("Israel", "41995642868");
        agendaContatos.adicionarContato("Jennifer", "4154546465");
        agendaContatos.adicionarContato("Amanda", "4164566666");
        agendaContatos.adicionarContato("Israel", "64564564");
        agendaContatos.adicionarContato("Luca", "41995642868");

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Israel");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Jennifer"));
    }
}
