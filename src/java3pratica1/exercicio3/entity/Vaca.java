package java3pratica1.exercicio3.entity;

import java3pratica1.exercicio3.Animal;
import java3pratica1.exercicio3.Herbivoro;

public class Vaca extends Animal implements Herbivoro {
    public Vaca(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void emitirSons() {
        System.out.println("mu");
    }

    @Override
    public void comerPasto() {
        System.out.println("Comendo pasto");
    }
}
