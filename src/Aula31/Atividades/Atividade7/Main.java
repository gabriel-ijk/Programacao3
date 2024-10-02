package Aula31.Atividades.Atividade7;

public class Main {
    public static void main(String[] args) {
        ProdutoFisico produtoFisico = new ProdutoFisico("Cadeira", 150.0, "Móveis", 5.0);
        ProdutoDigital produtoDigital = new ProdutoDigital("E-book", 50.0, "Livros");
        ProdutoServico produtoServico = new ProdutoServico("Consultoria", 500.0, "Serviços");

        produtoFisico.exibirDetalhes();
        produtoFisico.aplicarPromocao(10); // Aplicando 10% de desconto
        System.out.println("Preço Final: R$" + produtoFisico.calcularPrecoFinal());

        System.out.println();

        produtoDigital.exibirDetalhes();
        produtoDigital.aplicarPromocao(15); // Aplicando 15% de desconto
        System.out.println("Preço Final: R$" + produtoDigital.calcularPrecoFinal());

        System.out.println();

        produtoServico.exibirDetalhes();
        produtoServico.aplicarPromocao(20); // Aplicando 20% de desconto
        System.out.println("Preço Final: R$" + produtoServico.calcularPrecoFinal());
    }
}
