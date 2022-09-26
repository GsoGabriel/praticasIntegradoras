package java2pratica1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa joao = new Pessoa("Joao", 22, "ABC123");
        Pessoa pedro = new Pessoa("Pedro", 23, "JOI897", 65.5, 1.70);

        System.out.println(pedro);
        if (pedro.calcularIMC() < 0) {
            System.out.println("Está abaixo do peso");
        } else if (pedro.calcularIMC() == 0) {
            System.out.println("Está com peso saudável");
        } else {
            System.out.println("Está acima do peso");
        }

        if (pedro.ehMaiorIdade()){
            System.out.println("É maior de idade");
        } else {
            System.out.println("Não é maior de idade");
        }


    }
}