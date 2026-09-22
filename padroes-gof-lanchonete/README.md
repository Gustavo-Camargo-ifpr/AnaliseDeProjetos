# Padrões de Projeto GoF

Projeto desenvolvido para a atividade bimestral da disciplina de Análise e Projeto de Sistemas.

O objetivo é aplicar três padrões de projeto GoF, sendo um padrão criacional, um estrutural e um comportamental. Para os exemplos foi utilizado o contexto de um sistema de lanchonete.

Os padrões escolhidos foram:

* **Factory Method:** utilizado para criar diferentes tipos de pedidos, como pedido local e pedido para delivery.
* **Adapter:** utilizado para adaptar um serviço de pagamento externo ao sistema.
* **Strategy:** utilizado para permitir diferentes formas de cálculo de desconto.

O projeto foi desenvolvido em Java e cada padrão possui uma classe `Main` para demonstrar seu funcionamento.

## Estrutura

```text
src/
├── factory/
├── adapter/
└── strategy/
```

Cada pasta contém a implementação e um exemplo de utilização do respectivo padrão.
