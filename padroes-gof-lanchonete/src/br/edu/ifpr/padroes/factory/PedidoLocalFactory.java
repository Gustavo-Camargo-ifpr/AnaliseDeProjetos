package br.edu.ifpr.padroes.factory;


public class PedidoLocalFactory extends PedidoFactory {

    @Override
    public Pedido criarPedido() {
        return new PedidoLocal();
    }

}