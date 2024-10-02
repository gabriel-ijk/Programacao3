package Aula31.Atividades.Atividade5;

public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String especie;

    /**
     * Construtor para inicializar os atributos de um animal.
     *
     * @param nome O nome do animal.
     * @param idade A idade do animal.
     * @param especie A espécie do animal.
     */
    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    /**
     * Método abstrato para emitir o som característico do animal.
     */
    public abstract void emitirSom();

    /**
     * Método abstrato para alimentar o animal.
     */
    public abstract void alimentar();
}
