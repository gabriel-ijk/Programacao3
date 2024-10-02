package Aula31.Atividades.Atividade5;

public class Mamifero extends Animal implements Cuidador {

    /**
     * Construtor para inicializar os atributos de um mamífero.
     *
     * @param nome O nome do mamífero.
     * @param idade A idade do mamífero.
     * @param especie A espécie do mamífero.
     */
    public Mamifero(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    /**
     * Implementação do som característico de um mamífero.
     */
    @Override
    public void emitirSom() {
        System.out.println(nome + " está emitindo som: Grrr!");
    }

    /**
     * Implementação do método de alimentar o mamífero.
     */
    @Override
    public void alimentar() {
        System.out.println(nome + " está se alimentando de carne.");
    }

    /**
     * Implementação do método de cuidado com o mamífero.
     */
    @Override
    public void cuidar() {
        System.out.println("Cuidando do mamífero " + nome + ": Banho e alimentação.");
    }
}