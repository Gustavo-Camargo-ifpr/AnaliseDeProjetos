package br.edu.ifpr.padroes.factory;

public class MainFactory {

    public static void main(String[] args) {

        PedidoFactory factoryLocal = new PedidoLocalFactory();
        Pedido pedidoLocal = factoryLocal.criarPedido();
        pedidoLocal.preparar();

        PedidoFactory factoryDelivery = new PedidoDeliveryFactory();
        Pedido pedidoDelivery = factoryDelivery.criarPedido();
        pedidoDelivery.preparar();

    }

}