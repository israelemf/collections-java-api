package main.java.map.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private List<String> atracoes;

    public Evento(String nome, List<String> atracoes) {
        this.nome = nome;
        this.atracoes = atracoes;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getAtracao() {
        return atracoes;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atracao='" + atracoes + '\'' +
                '}' + "\n";
    }
}
