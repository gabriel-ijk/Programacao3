package Aula31.Atividades.Atividade7;

public class ProdutoServico extends Produto implements Promocao {

    /**
     * Construtor para inicializar os atributos de um serviço.
     *
     * @param nome O nome do serviço.
     * @param preco O preço do serviço.
     * @param categoria A categoria do serviço.
     */
    public ProdutoServico(String nome, double preco, String categoria) {
        super(nome, preco, categoria);
    }

    @Override
    public double calcularPrecoFinal() {
        return preco; // No caso simples, o preço final é o preço base
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Produto/Serviço:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Categoria: " + categoria);
    }

    @Override
    public void aplicarPromocao(double percentualDesconto) {
        preco -= preco * percentualDesconto / 100;
    }
}
