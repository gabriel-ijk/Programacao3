package Aula31.Atividades.Atividade1;

public class FuncionarioComissionado extends Funcionario implements Pagamento {
    private double vendas;
    private double taxaComissao;

    /**
     * Construtor para inicializar o nome, o salário base, o valor das vendas e a taxa de comissão.
     *
     * @param nome          O nome do funcionário.
     * @param salarioBase   O salário base do funcionário.
     * @param vendas        O valor total de vendas do funcionário.
     * @param taxaComissao  A porcentagem de comissão sobre as vendas.
     */
    public FuncionarioComissionado(String nome, double salarioBase, double vendas, double taxaComissao) {
        super(nome, salarioBase);
        this.vendas = vendas;
        this.taxaComissao = taxaComissao;
    }

    /**
     * Calcula o salário do funcionário comissionado.
     *
     * @return O salário calculado com base no salário base e na comissão sobre as vendas.
     */
    @Override
    public double calcularSalario() {
        return salarioBase + (vendas * taxaComissao);
    }

    /**
     * Processa o pagamento para o funcionário comissionado.
     */
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento processado para comissionado: " + nome + ". Salário: " + calcularSalario());
    }
}
