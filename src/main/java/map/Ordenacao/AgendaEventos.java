package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, List<String> atracoes) {
        eventosMap.put(data, new Evento(nome, atracoes));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoPorData = new TreeMap<>(eventosMap);

        System.out.println("Evento ordenado por data: " + eventoPorData);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        for (Map.Entry<LocalDate, Evento> entry: eventosMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " ocorrerá em: " + proximaData);
                break;
            }
        }
    }


}
