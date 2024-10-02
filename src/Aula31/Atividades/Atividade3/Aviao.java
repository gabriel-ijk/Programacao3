package Aula31.Atividades.Atividade3;

public class Aviao extends Transporte implements Combustivel {

    /**
     * Construtor para inicializar um avião com capacidade e velocidade máxima.
     *
     * @param capacidade        A capacidade do avião.
     * @param velocidadeMaxima  A velocidade máxima do avião.
     */
    public Aviao(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    /**
     * Implementação do método de mover para um avião.
     */
    @Override
    public void mover() {
        System.out.println("O avião está voando a " + velocidadeMaxima + " km/h.");
    }

    /**
     * Implementação do método de parar para um avião.
     */
    @Override
    public void parar() {
        System.out.println("O avião pousou e parou.");
    }

    /**
     * Implementação do método de abastecer para um avião.
     */
    @Override
    public void abastecer() {
        System.out.println("O avião está sendo abastecido.");
    }
}
