package Aula31.Atividades.Atividade5;

public class Ave extends Animal implements Cuidador {

    /**
     * Construtor para inicializar os atributos de uma ave.
     *
     * @param nome O nome da ave.
     * @param idade A idade da ave.
     * @param especie A espécie da ave.
     */
    public Ave(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    /**
     * Implementação do som característico de uma ave.
     */
    @Override
    public void emitirSom() {
        System.out.println(nome + " está emitindo som: Piu piu!");
    }

    /**
     * Implementação do método de alimentar a ave.
     */
    @Override
    public void alimentar() {
        System.out.println(nome + " está se alimentando de sementes.");
    }

    /**
     * Implementação do método de cuidado com a ave.
     */
    @Override
    public void cuidar() {
        System.out.println("Cuidando da ave " + nome + ": Limpeza da gaiola e alimentação.");
    }
}
