package br.edu.ifpr.padroes.adapter;

public class MercadoPagoAdapter implements Pagamento {

    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
    }

    @Override
    public void pagar(double valor) {
        mercadoPago.realizarPagamento(valor);
    }

}