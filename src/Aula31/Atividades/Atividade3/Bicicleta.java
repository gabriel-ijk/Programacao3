package Aula31.Atividades.Atividade3;

public class Bicicleta extends Transporte {

    /**
     * Construtor para inicializar uma bicicleta com capacidade e velocidade máxima.
     *
     * @param capacidade        A capacidade da bicicleta.
     * @param velocidadeMaxima  A velocidade máxima da bicicleta.
     */
    public Bicicleta(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    /**
     * Implementação do método de mover para uma bicicleta.
     */
    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo a " + velocidadeMaxima + " km/h.");
    }

    /**
     * Implementação do método de parar para uma bicicleta.
     */
    @Override
    public void parar() {
        System.out.println("A bicicleta parou.");
    }
}
