package java3pratica1.exercicio1.entity;

import java3pratica1.exercicio1.Transacao;

public class Cobradores implements Transacao {

    @Override
    public void depositar(){
        transacaoNaoOk();
    }

    @Override
    public void transferir(){
        transacaoNaoOk();
    }

    @Override
    public void consultarSaldo() {
        transacaoOk();
    }

    @Override
    public void pagamentoServicos() {
        transacaoNaoOk();
    }

    @Override
    public void saque() {
        transacaoOk();
    }
}
