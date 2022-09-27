package java2pratica2.exercicio1;

public class PraticaExcecoes {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            int c = b / a;
        } catch (Exception e) {
            throw new IllegalArgumentException("Não pode ser dividido por zero");
        }

        System.out.println("Programa finalizado");
    }
}
