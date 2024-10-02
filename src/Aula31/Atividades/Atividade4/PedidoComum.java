package Aula31.Atividades.Atividade4;

public class PedidoComum extends Pedido implements Desconto {

    /**
     * Construtor para inicializar um pedido comum.
     *
     * @param numeroPedido O número do pedido.
     */
    public PedidoComum(int numeroPedido) {
        super(numeroPedido);
    }

    /**
     * Implementação do método de calcular o total para um pedido comum.
     *
     * @return O valor total do pedido.
     */
    @Override
    public double calcularTotal() {
        return itens.size() * 10.0; // Cada item custa 10
    }

    /**
     * Implementação do método de aplicar desconto para um pedido comum.
     *
     * @param total O valor total original do pedido.
     * @return O valor total após o desconto.
     */
    @Override
    public double aplicarDesconto(double total) {
        return total * 0.9; // 10% de desconto
    }
}
