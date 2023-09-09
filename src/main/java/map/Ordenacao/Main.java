package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        List<String> atracoes = new ArrayList<>();
        atracoes.add("Atracao1");
        atracoes.add("Atracao2");
        atracoes.add("Atracao3");

        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 15),"Evento 1", atracoes);
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 15),"Evento 2", atracoes);
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 15),"Evento 3", atracoes);
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 13),"Evento 1", atracoes);
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.APRIL, 15),"Evento 4", atracoes);
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER, 15),"Evento 5", atracoes);

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }


}
