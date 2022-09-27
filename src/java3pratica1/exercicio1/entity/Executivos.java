package java3pratica1.exercicio1.entity;

import java3pratica1.exercicio1.Transacao;

public class Executivos implements Transacao {

    @Override
    public void depositar(){
        transacaoOk();
    }

    @Override
    public void transferir(){
        transacaoOk();
    }

    @Override
    public void consultarSaldo() {
        transacaoNaoOk();
    }

    @Override
    public void pagamentoServicos() {
        transacaoNaoOk();
    }

    @Override
    public void saque() {
        transacaoNaoOk();
    }


}
