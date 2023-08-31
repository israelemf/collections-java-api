package main.java.list.Ordenacao.Pessoa;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Pessoa 1", 20, 1.50);
        ordenacaoPessoa.adicionarPessoa("Pessoa 3", 12, 1.68);
        ordenacaoPessoa.adicionarPessoa("Pessoa 2", 32, 1.98);
        ordenacaoPessoa.adicionarPessoa("Pessoa 4", 45, 1.43);
        ordenacaoPessoa.adicionarPessoa("Pessoa 5", 20, 1.65);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
