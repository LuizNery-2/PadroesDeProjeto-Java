package org.example.pagamento;

import org.example.notificacoes.SistemaNotificacaoFacade;

public class SistemaPagamento {
    private Pagamento pagamento;
    private SistemaNotificacaoFacade notificacoes;

    public SistemaPagamento(){
        notificacoes = new SistemaNotificacaoFacade();
    }

    public void setMetodoPagamento(Pagamento pagamento){
        this.pagamento = pagamento;
    }
    public void processarCompra(double valor){
        if (pagamento  !=null ){
            pagamento.processarPagamento(valor);
            notificacoes.enviarNotificacoes("Pagamento de " + valor + " foi processado com sucesso.");
        }
        else {
            System.out.println("Método de pagamento não definido!");
        }
    }

}
