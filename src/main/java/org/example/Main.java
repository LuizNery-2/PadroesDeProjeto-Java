package org.example;

import org.example.pagamento.PagamentoBoleto;
import org.example.pagamento.PagamentoCartaoCredito;
import org.example.pagamento.PagamentoPayPal;
import org.example.pagamento.SistemaPagamento;

public class Main {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        // Processar pagamento com cartão de crédito
        sistema.setMetodoPagamento(new PagamentoCartaoCredito());
        sistema.processarCompra(150.0);

        // Processar pagamento com PayPal
        sistema.setMetodoPagamento(new PagamentoPayPal());
        sistema.processarCompra(250.0);

        // Processar pagamento com boleto
        sistema.setMetodoPagamento(new PagamentoBoleto());
        sistema.processarCompra(100.0);
    }

}