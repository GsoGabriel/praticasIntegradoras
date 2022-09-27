package java3pratica1.exercicio2;

import java3pratica1.exercicio2.entity.Curriculo;

public class Main {
    public static void main(String[] args) {
        Documento curriculo = new Curriculo("Gabriel", "2122222222", "Mercado livre", "ADS, PUC Minas");
        Impressora.imprimir(curriculo);
    }
}
