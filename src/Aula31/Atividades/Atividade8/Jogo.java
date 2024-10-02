package Aula31.Atividades.Atividade8;

public abstract class Jogo {
    protected String titulo;
    protected String genero;
    protected String classificacaoEtaria;

    /**
     * Construtor para inicializar os atributos de um jogo.
     *
     * @param titulo O título do jogo.
     * @param genero O gênero do jogo.
     * @param classificacaoEtaria A classificação etária do jogo.
     */
    public Jogo(String titulo, String genero, String classificacaoEtaria) {
        this.titulo = titulo;
        this.genero = genero;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    /**
     * Método abstrato para iniciar o jogo.
     * Deve ser implementado pelas subclasses.
     */
    public abstract void iniciar();

    /**
     * Método abstrato para pausar o jogo.
     * Deve ser implementado pelas subclasses.
     */
    public abstract void pausar();

    /**
     * Método abstrato para finalizar o jogo.
     * Deve ser implementado pelas subclasses.
     */
    public abstract void finalizar();
}
