package Aula31.Atividades.Atividade5;

public class Reptil extends Animal implements Cuidador {

    /**
     * Construtor para inicializar os atributos de um réptil.
     *
     * @param nome O nome do réptil.
     * @param idade A idade do réptil.
     * @param especie A espécie do réptil.
     */
    public Reptil(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    /**
     * Implementação do som característico de um réptil.
     */
    @Override
    public void emitirSom() {
        System.out.println(nome + " está emitindo som: Ssshhh!");
    }

    /**
     * Implementação do método de alimentar o réptil.
     */
    @Override
    public void alimentar() {
        System.out.println(nome + " está se alimentando de insetos.");
    }

    /**
     * Implementação do método de cuidado com o réptil.
     */
    @Override
    public void cuidar() {
        System.out.println("Cuidando do réptil " + nome + ": Aquecimento e alimentação.");
    }
}
