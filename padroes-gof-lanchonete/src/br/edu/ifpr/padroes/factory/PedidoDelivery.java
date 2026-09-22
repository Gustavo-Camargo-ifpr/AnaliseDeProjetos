package br.edu.ifpr.padroes.factory;

public class PedidoDelivery implements Pedido {

    @Override
    public void preparar() {
        System.out.println("Preparando pedido para delivery.");
    }

}