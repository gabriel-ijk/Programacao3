package Aula31.Atividades.Atividade8;

public class JogoDigital extends Jogo implements Multiplayer {

    /**
     * Construtor para inicializar os atributos de um jogo digital.
     *
     * @param titulo O título do jogo digital.
     * @param genero O gênero do jogo digital.
     * @param classificacaoEtaria A classificação etária do jogo digital.
     */
    public JogoDigital(String titulo, String genero, String classificacaoEtaria) {
        super(titulo, genero, classificacaoEtaria);
    }

    @Override
    public void iniciar() {
        System.out.println("Jogo Digital " + titulo + " iniciado.");
    }

    @Override
    public void pausar() {
        System.out.println("Jogo Digital " + titulo + " pausado.");
    }

    @Override
    public void finalizar() {
        System.out.println("Jogo Digital " + titulo + " finalizado.");
    }

    @Override
    public void conectarJogadores(String[] jogadores) {
        System.out.println("Conectando jogadores ao jogo digital " + titulo + ":");
        for (String jogador : jogadores) {
            System.out.println("Jogador conectado: " + jogador);
        }
    }
}