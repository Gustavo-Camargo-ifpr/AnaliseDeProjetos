package br.edu.ifpr.padroes.adapter;

public class MercadoPago {

    public void realizarPagamento(double valor) {
        System.out.println(
            "Pagamento de R$ " + valor + " realizado pelo Mercado Pago."
        );
    }

}