package Aula31.Atividades.Atividade8;

public class JogoDeTabuleiro extends Jogo {

    /**
     * Construtor para inicializar os atributos de um jogo de tabuleiro.
     *
     * @param titulo O título do jogo de tabuleiro.
     * @param genero O gênero do jogo de tabuleiro.
     * @param classificacaoEtaria A classificação etária do jogo de tabuleiro.
     */
    public JogoDeTabuleiro(String titulo, String genero, String classificacaoEtaria) {
        super(titulo, genero, classificacaoEtaria);
    }

    @Override
    public void iniciar() {
        System.out.println("Jogo de Tabuleiro " + titulo + " iniciado.");
    }

    @Override
    public void pausar() {
        System.out.println("Jogo de Tabuleiro " + titulo + " pausado.");
    }

    @Override
    public void finalizar() {
        System.out.println("Jogo de Tabuleiro " + titulo + " finalizado.");
    }
}
