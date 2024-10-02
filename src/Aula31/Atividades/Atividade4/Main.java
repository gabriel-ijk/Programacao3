package Aula31.Atividades.Atividade4;

public class Main {
    public static void main(String[] args) {
        PedidoComum pedidoComum = new PedidoComum(1);
        PedidoDelivery pedidoDelivery = new PedidoDelivery(2, 5.0);
        PedidoReserva pedidoReserva = new PedidoReserva(3);

        pedidoComum.adicionarItem("Pizza");
        pedidoComum.adicionarItem("Refrigerante");
        pedidoComum.exibirItens();
        double totalComum = pedidoComum.calcularTotal();
        System.out.println("Total do Pedido Comum: " + totalComum);
        System.out.println("Total com Desconto: " + pedidoComum.aplicarDesconto(totalComum));

        pedidoDelivery.adicionarItem("Hambúrguer");
        pedidoDelivery.adicionarItem("Batata Frita");
        pedidoDelivery.exibirItens();
        double totalDelivery = pedidoDelivery.calcularTotal();
        System.out.println("Total do Pedido Delivery: " + totalDelivery);
        System.out.println("Total com Desconto: " + pedidoDelivery.aplicarDesconto(totalDelivery));

        pedidoReserva.adicionarItem("Sushi");
        pedidoReserva.adicionarItem("Chá");
        pedidoReserva.exibirItens();
        double totalReserva = pedidoReserva.calcularTotal();
        System.out.println("Total do Pedido Reserva: " + totalReserva);
    }
}