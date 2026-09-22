package br.edu.ifpr.padroes.strategy;

public class DescontoEstudante implements Desconto {

    @Override
    public double calcular(double valor) {
        return valor * 0.90;
    }

}
