package Aula31.Atividades.Atividade7;

public class ProdutoDigital extends Produto implements Promocao {

    /**
     * Construtor para inicializar os atributos de um produto digital.
     *
     * @param nome O nome do produto.
     * @param preco O preço do produto.
     * @param categoria A categoria do produto.
     */
    public ProdutoDigital(String nome, double preco, String categoria) {
        super(nome, preco, categoria);
    }

    @Override
    public double calcularPrecoFinal() {
        return preco; // No caso simples, o preço final é o preço base
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Produto Digital:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Categoria: " + categoria);
    }

    @Override
    public void aplicarPromocao(double percentualDesconto) {
        preco -= preco * percentualDesconto / 100;
    }
}
