package Aula31.Atividades.Atividade4;

public class PedidoDelivery extends Pedido implements Desconto {
    private double taxaEntrega;

    /**
     * Construtor para inicializar um pedido de delivery com taxa de entrega.
     *
     * @param numeroPedido O número do pedido.
     * @param taxaEntrega  A taxa de entrega do pedido.
     */
    public PedidoDelivery(int numeroPedido, double taxaEntrega) {
        super(numeroPedido);
        this.taxaEntrega = taxaEntrega;
    }

    /**
     * Implementação do método de calcular o total para um pedido de delivery.
     *
     * @return O valor total do pedido, incluindo a taxa de entrega.
     */
    @Override
    public double calcularTotal() {
        return itens.size() * 12.0 + taxaEntrega; // Cada item custa 12 e há taxa de entrega
    }

    /**
     * Implementação do método de aplicar desconto para um pedido de delivery.
     *
     * @param total O valor total original do pedido.
     * @return O valor total após o desconto.
     */
    @Override
    public double aplicarDesconto(double total) {
        return total * 0.85; // 15% de desconto
    }
}
