package java3pratica1.exercicio3.entity;

import java3pratica1.exercicio3.Animal;
import java3pratica1.exercicio3.Carnivoro;

public class Cachorro extends Animal implements Carnivoro {

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void emitirSons() {
        System.out.println("Auau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo carne");
    }
}
