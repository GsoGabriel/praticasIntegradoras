package java3pratica1.exercicio2.entity;

import java3pratica1.exercicio2.Documento;

public class LivroPDF implements Documento {
    private int numeroPaginas;
    private String autor, titulo, genero;

    public LivroPDF(int numeroPaginas, String autor, String titulo, String genero) {
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "LivroPDF{" +
                "numeroPaginas=" + numeroPaginas +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
