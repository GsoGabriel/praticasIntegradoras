package java3pratica1.exercicio3;

import java3pratica1.exercicio3.entity.Cachorro;
import java3pratica1.exercicio3.entity.Gato;
import java3pratica1.exercicio3.entity.Vaca;

public class AppAnimais {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Totó", "Doberman");
        Gato gato = new Gato("Peludo", "Persa");
        Vaca vaca = new Vaca("Mimosa", "Angus");

        cachorro.emitirSons();
        cachorro.comerCarne();

        gato.emitirSons();
        gato.comerCarne();

        vaca.emitirSons();
        vaca.comerPasto();
    }
}
