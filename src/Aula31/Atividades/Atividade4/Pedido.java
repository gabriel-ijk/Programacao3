package Aula31.Atividades.Atividade4;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe abstrata que representa um pedido no restaurante.
 * Cada pedido tem um número, uma lista de itens e um status.
 */
public abstract class Pedido {
    protected int numeroPedido;
    protected List<String> itens;
    protected String status;

    /**
     * Construtor para inicializar um pedido com número e status.
     *
     * @param numeroPedido O número do pedido.
     */
    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.itens = new ArrayList<>();
        this.status = "Em andamento";
    }

    /**
     * Método abstrato para calcular o total do pedido.
     *
     * @return O valor total do pedido.
     */
    public abstract double calcularTotal();

    /**
     * Adiciona um item ao pedido.
     *
     * @param item O item a ser adicionado.
     */
    public void adicionarItem(String item) {
        itens.add(item);
        System.out.println(item + " foi adicionado ao pedido.");
    }

    /**
     * Remove um item do pedido.
     *
     * @param item O item a ser removido.
     */
    public void removerItem(String item) {
        if (itens.remove(item)) {
            System.out.println(item + " foi removido do pedido.");
        } else {
            System.out.println(item + " não foi encontrado no pedido.");
        }
    }

    /**
     * Método para exibir os itens do pedido.
     */
    public void exibirItens() {
        System.out.println("Itens do pedido " + numeroPedido + ": " + itens);
    }
}
