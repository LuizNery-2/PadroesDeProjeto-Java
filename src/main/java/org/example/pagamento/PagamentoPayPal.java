package org.example.pagamento;

import org.example.database.ConexaoDB;

public class PagamentoPayPal implements Pagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de " + valor + " processado via Boleto.");
        ConexaoDB.getInstancia().salvarTransacao("PayPal", valor);
    }
}
