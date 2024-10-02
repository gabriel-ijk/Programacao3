package Aula31.Atividades.Atividade3;

public abstract class Transporte {
    protected int capacidade;
    protected double velocidadeMaxima;

    /**
     * Construtor para inicializar um transporte com capacidade e velocidade máxima.
     *
     * @param capacidade        A capacidade do transporte.
     * @param velocidadeMaxima  A velocidade máxima do transporte.
     */
    public Transporte(int capacidade, double velocidadeMaxima) {
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /**
     * Método abstrato para mover o transporte.
     */
    public abstract void mover();

    /**
     * Método abstrato para parar o transporte.
     */
    public abstract void parar();
}
