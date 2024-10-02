package Aula31.Atividades.Atividade1;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    /**
     * Construtor para inicializar o nome e o salário base do funcionário.
     *
     * @param nome        O nome do funcionário.
     * @param salarioBase O salário base do funcionário.
     */
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Método abstrato para calcular o salário do funcionário.
     * Cada subclasse deve implementar sua própria maneira de calcular o salário.
     *
     * @return O valor calculado do salário.
     */
    public abstract double calcularSalario();
}
