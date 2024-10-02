package Aula31.Atividades.Atividade2;

public class Revista extends Publicacao implements Reservavel {

    /**
     * Construtor para inicializar uma revista com título, autor e ano de publicação.
     *
     * @param titulo        O título da revista.
     * @param autor         O autor da revista.
     * @param anoPublicacao O ano de publicação da revista.
     */
    public Revista(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    /**
     * Implementação do método de emprestar para uma revista.
     */
    @Override
    public void emprestar() {
        System.out.println("Revista '" + titulo + "' emprestada.");
    }

    /**
     * Implementação do método de devolver para uma revista.
     */
    @Override
    public void devolver() {
        System.out.println("Revista '" + titulo + "' devolvida.");
    }

    /**
     * Implementação do método de reservar para uma revista.
     */
    @Override
    public void reservar() {
        System.out.println("Revista '" + titulo + "' reservada.");
    }
}
