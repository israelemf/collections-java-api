package main.java.map.OperacoesBasicas.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, String> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, String numeroTelefone) {
        agendaContatosMap.put(nome, numeroTelefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }

    public String pesquisarPorNome(String nome) {
        String numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }
}
