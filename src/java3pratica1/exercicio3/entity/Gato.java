package java3pratica1.exercicio3.entity;

import java3pratica1.exercicio3.Animal;
import java3pratica1.exercicio3.Carnivoro;

public class Gato extends Animal implements Carnivoro {
    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void emitirSons() {
        System.out.println("miau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo carne");
    }
}
