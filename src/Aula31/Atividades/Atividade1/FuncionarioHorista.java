package Aula31.Atividades.Atividade1;

public class FuncionarioHorista extends Funcionario implements Pagamento {
    private int horasTrabalhadas;
    private double valorPorHora;

    /**
     * Construtor para inicializar o nome, o salário base, as horas trabalhadas e o valor por hora.
     *
     * @param nome           O nome do funcionário.
     * @param salarioBase    O salário base do funcionário (pode ser zero).
     * @param horasTrabalhadas O número de horas trabalhadas.
     * @param valorPorHora   O valor recebido por hora de trabalho.
     */
    public FuncionarioHorista(String nome, double salarioBase, int horasTrabalhadas, double valorPorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    /**
     * Calcula o salário do funcionário horista.
     *
     * @return O salário calculado com base nas horas trabalhadas e no valor por hora.
     */
    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }

    /**
     * Processa o pagamento para o funcionário horista.
     */
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento processado para horista: " + nome + ". Salário: " + calcularSalario());
    }
}