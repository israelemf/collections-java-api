package main.java.set.Ordenacao.ListaAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private long matricula;
    private String nome;
    private double nota;

    public Aluno(long matricula, String nome, double nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareToIgnoreCase(aluno.getNome());
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", nota=" + nota +
                '}' + "\n";
    }
}

class CompararPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return Double.compare(aluno1.getNota(), aluno2.getNota());
    }
}
