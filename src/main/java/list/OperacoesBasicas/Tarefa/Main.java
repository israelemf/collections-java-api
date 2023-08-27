package main.java.list.OperacoesBasicas.Tarefa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeAtividade;

        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        System.out.print("Informe a quantidade de atividades a serem adicionadas na lista: ");
        quantidadeAtividade = scanner.nextInt();

        for (int adicionar = 1; adicionar <= quantidadeAtividade; adicionar++) {
            listaTarefa.adicionarTarefa("Tarefa " + adicionar);
        }

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        System.out.println("Tarefas da lista: " + listaTarefa.obterDescricoesTarefas());

        listaTarefa.removerTarefa("Tarefa 1");

        System.out.println("Tarefas da lista após remove Tarefa 1: " + listaTarefa.obterDescricoesTarefas());
    }
}
