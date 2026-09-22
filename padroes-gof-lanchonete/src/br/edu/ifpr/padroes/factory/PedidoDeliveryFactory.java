package br.edu.ifpr.padroes.factory;


public class PedidoDeliveryFactory extends PedidoFactory {

    @Override
    public Pedido criarPedido() {
        return new PedidoDelivery();
    }

}