package java3pratica1.exercicio2.entity;

import java3pratica1.exercicio2.Documento;

public class Relatorios implements Documento {
    private String texto, autor, revisor;
    private int numeroPaginas;
    private int maxCaracteresTexto;

    public Relatorios(String texto, String autor, String revisor, int numeroPaginas, int maxCaracteresTexto) {
        this.texto = texto;
        this.autor = autor;
        this.revisor = revisor;
        this.numeroPaginas = numeroPaginas;
        this.maxCaracteresTexto = maxCaracteresTexto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        if (texto.length() > maxCaracteresTexto) throw new IllegalArgumentException("Quantidade de caracteres não aceita.");
        else this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Relatorios{" +
                "texto='" + texto + '\'' +
                ", autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
