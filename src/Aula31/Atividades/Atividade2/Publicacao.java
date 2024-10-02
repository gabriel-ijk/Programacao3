package Aula31.Atividades.Atividade2;

public abstract class Publicacao {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    /**
     * Construtor para inicializar uma publicação com título, autor e ano de publicação.
     *
     * @param titulo        O título da publicação.
     * @param autor         O autor da publicação.
     * @param anoPublicacao O ano de publicação.
     */
    public Publicacao(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    /**
     * Método abstrato para emprestar uma publicação.
     * Cada subclasse deve implementar suas regras de empréstimo.
     */
    public abstract void emprestar();

    /**
     * Método abstrato para devolver uma publicação.
     * Cada subclasse deve implementar suas regras de devolução.
     */
    public abstract void devolver();
}
