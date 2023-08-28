package main.java.list.Pesquisa.CatalogoDeLivros;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Livro {
    private String titulo;
    private String autor;
    private Integer anoPublicacao;

    public Livro(String titulo, String autor, Integer anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Autor: " + autor +
                "\nTítulo: " + titulo +
                "\nAno de publicação: " + anoPublicacao;
    }
}
