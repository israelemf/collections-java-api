package main.java.set.Pesquisa.ListaTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1", false);
        listaTarefas.adicionarTarefa("Tarefa 1", false);
        listaTarefas.adicionarTarefa("Tarefa 2", false);
        listaTarefas.adicionarTarefa("Tarefa 3", true);
        listaTarefas.adicionarTarefa("Tarefa 3", false);
        listaTarefas.adicionarTarefa("Tarefa 4", true);
        listaTarefas.adicionarTarefa("Tarefa 5", true);

        System.out.println("Quantidade de tarefas no set: " + listaTarefas.contarTarefas());

        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Tarefa 2");

        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("Tarefa 1");
        listaTarefas.marcarTarefaPendente("Tarefa 3");

        listaTarefas.exibirTarefas();

        System.out.println("Tarefas Concluidas: \n" + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas Pendentes: \n" + listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefa();

        System.out.println(listaTarefas.contarTarefas());
    }
}
