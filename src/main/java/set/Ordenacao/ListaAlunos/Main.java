package main.java.set.Ordenacao.ListaAlunos;

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno(1, "Israel", 6.0);
        gerenciadorAlunos.adicionarAluno(1, "Israel", 9.0);
        gerenciadorAlunos.adicionarAluno(4, "Jennifer", 4.0);
        gerenciadorAlunos.adicionarAluno(3, "Amanda", 3.0);
        gerenciadorAlunos.adicionarAluno(8, "Luca", 8.0);
        gerenciadorAlunos.adicionarAluno(8, "Aluno1", 8.0);
        gerenciadorAlunos.adicionarAluno(43, "Aluno2", 8.0);
        gerenciadorAlunos.adicionarAluno(76, "Aluno1", 8.0);


        System.out.println(gerenciadorAlunos.exibirAlunos());

        gerenciadorAlunos.removerAluno(1);

        System.out.println(gerenciadorAlunos.exibirAlunos());

        System.out.println("Por nome: \n" + gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("Por nota: \n" + gerenciadorAlunos.exibirAlunosPorNota());
    }
}
