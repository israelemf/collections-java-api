package main.java.list.Pesquisa.CatalogoDeLivros;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2015);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2012);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2020);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2012);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2014);


        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2015));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
