package Aula31.Atividades.Atividade8;

public class JogoDeCartas extends Jogo {

    /**
     * Construtor para inicializar os atributos de um jogo de cartas.
     *
     * @param titulo O título do jogo de cartas.
     * @param genero O gênero do jogo de cartas.
     * @param classificacaoEtaria A classificação etária do jogo de cartas.
     */
    public JogoDeCartas(String titulo, String genero, String classificacaoEtaria) {
        super(titulo, genero, classificacaoEtaria);
    }

    @Override
    public void iniciar() {
        System.out.println("Jogo de Cartas " + titulo + " iniciado.");
    }

    @Override
    public void pausar() {
        System.out.println("Jogo de Cartas " + titulo + " pausado.");
    }

    @Override
    public void finalizar() {
        System.out.println("Jogo de Cartas " + titulo + " finalizado.");
    }
}
