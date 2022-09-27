package java3pratica1.exercicio2.entity;

import java3pratica1.exercicio2.Documento;

public class Curriculo implements Documento {
    private String nome, telefone, experiencia, formacao;

    public Curriculo() {
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", experiencia='" + experiencia + '\'' +
                ", formacao='" + formacao + '\'' +
                '}';
    }

    public Curriculo(String nome, String telefone, String experiencia, String formacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.experiencia = experiencia;
        this.formacao = formacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
