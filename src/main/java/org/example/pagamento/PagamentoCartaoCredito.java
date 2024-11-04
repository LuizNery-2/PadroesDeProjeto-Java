package org.example.pagamento;
import org.example.database.ConexaoDB;

public class PagamentoCartaoCredito implements Pagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de " + valor + " processado via Cartão de Crédito.");
        ConexaoDB.getInstancia().salvarTransacao("Cartão de Crédito", valor);
    }
}
