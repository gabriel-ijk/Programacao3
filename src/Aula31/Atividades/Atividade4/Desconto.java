package Aula31.Atividades.Atividade4;

public interface Desconto {
    /**
     * Aplica um desconto no total do pedido.
     *
     * @param total O valor total original do pedido.
     * @return O valor total após o desconto.
     */
    double aplicarDesconto(double total);
}
