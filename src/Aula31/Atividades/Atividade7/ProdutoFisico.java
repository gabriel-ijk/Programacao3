package Aula31.Atividades.Atividade7;

public class ProdutoFisico extends Produto implements Promocao {
    private double peso;

    /**
     * Construtor para inicializar os atributos de um produto físico.
     *
     * @param nome O nome do produto.
     * @param preco O preço do produto.
     * @param categoria A categoria do produto.
     * @param peso O peso do produto.
     */
    public ProdutoFisico(String nome, double preco, String categoria, double peso) {
        super(nome, preco, categoria);
        this.peso = peso;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco; // No caso simples, o preço final é o preço base
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Produto Físico:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Categoria: " + categoria);
        System.out.println("Peso: " + peso + "kg");
    }

    @Override
    public void aplicarPromocao(double percentualDesconto) {
        preco -= preco * percentualDesconto / 100;
    }
}
