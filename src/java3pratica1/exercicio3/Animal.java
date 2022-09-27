package java3pratica1.exercicio3;

public abstract class Animal {
    private String nome;
    private String raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public abstract void emitirSons();
}
