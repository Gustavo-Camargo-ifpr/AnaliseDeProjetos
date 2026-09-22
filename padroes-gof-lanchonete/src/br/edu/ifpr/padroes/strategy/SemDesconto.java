package br.edu.ifpr.padroes.strategy;

public class MainStrategy {

    public static void main(String[] args) {

        double valor = 100.00;

        Pedido pedidoEstudante =
            new Pedido(new DescontoEstudante());

        System.out.println(
            "Estudante: R$ " + pedidoEstudante.calcularTotal(valor)
        );


        Pedido pedidoFuncionario =
            new Pedido(new DescontoFuncionario());

        System.out.println(
            "Funcionario: R$ " + pedidoFuncionario.calcularTotal(valor)
        );


        Pedido pedidoNormal =
            new Pedido(new SemDesconto());

        System.out.println(
            "Sem desconto: R$ " + pedidoNormal.calcularTotal(valor)
        );

    }

}