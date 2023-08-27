package main.java.list.OperacoesBasicas.Tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTarefa {
    // Atributo
    private final List<Tarefa> tarefas;

    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<>();

        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(tarefa);
            }
        }
        tarefas.removeAll(tarefasRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefas.size();
    }

    public StringBuilder obterDescricoesTarefas() {
        StringBuilder descricaoTarefas = new StringBuilder("Descrições");

        for (Tarefa tarefa : tarefas) {
            descricaoTarefas.append("\n").append(tarefa.getDescricao());
        }
        return descricaoTarefas;
    }
}
