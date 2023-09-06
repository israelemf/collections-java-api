package main.java.set.Ordenacao.ListaAlunos;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(long matricula, String nome, double nota) {
        alunosSet.add(new Aluno(matricula, nome, nota));
    }

    public void removerAluno(long matricula) {
        alunosSet.removeIf(aluno -> aluno.getMatricula() == matricula);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new CompararPorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public Set<Aluno> exibirAlunos() {
        return alunosSet;
    }
}
