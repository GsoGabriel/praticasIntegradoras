package java3pratica1.exercicio1;

public interface Transacao {

    void depositar();

    void transferir();

    void consultarSaldo();

    void pagamentoServicos();

    void saque();

    default void transacaoOk() {
        System.out.println("Transação OK!");
    }
    default void transacaoNaoOk() {
        System.out.println("Transação não permitida.");
    }
}
