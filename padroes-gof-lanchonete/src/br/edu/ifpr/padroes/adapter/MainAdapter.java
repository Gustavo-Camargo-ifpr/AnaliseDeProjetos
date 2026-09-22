package br.edu.ifpr.padroes.adapter;

public class MainAdapter {

    public static void main(String[] args) {

        MercadoPago mercadoPago = new MercadoPago();

        Pagamento pagamento = new MercadoPagoAdapter(mercadoPago);

        pagamento.pagar(50.00);

    }

}