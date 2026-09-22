package br.edu.ifpr.padroes.strategy;

public class Pedido {

    private Desconto desconto;

    public Pedido(Desconto desconto) {
        this.desconto = desconto;
    }

    public double calcularTotal(double valor) {
        return desconto.calcular(valor);
    }

}
