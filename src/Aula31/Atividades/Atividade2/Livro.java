package Aula31.Atividades.Atividade2;

public class Livro extends Publicacao implements Reservavel {

    /**
     * Construtor para inicializar um livro com título, autor e ano de publicação.
     *
     * @param titulo        O título do livro.
     * @param autor         O autor do livro.
     * @param anoPublicacao O ano de publicação do livro.
     */
    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    /**
     * Implementação do método de emprestar para um livro.
     */
    @Override
    public void emprestar() {
        System.out.println("Livro '" + titulo + "' emprestado.");
    }

    /**
     * Implementação do método de devolver para um livro.
     */
    @Override
    public void devolver() {
        System.out.println("Livro '" + titulo + "' devolvido.");
    }

    /**
     * Implementação do método de reservar para um livro.
     */
    @Override
    public void reservar() {
        System.out.println("Livro '" + titulo + "' reservado.");
    }
}
