package br.edu.ifpr.padroes.factory;

public class PedidoLocal implements Pedido {

    @Override
    public void preparar() {
        System.out.println("Preparando pedido para consumo no local.");
    }

}