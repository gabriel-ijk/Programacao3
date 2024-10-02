package Aula31.Atividades.Atividade8;

public class Main {
    public static void main(String[] args) {
        JogoDigital jogoDigital = new JogoDigital("League of Legends", "MOBA", "Livre");
        JogoDeTabuleiro jogoDeTabuleiro = new JogoDeTabuleiro("Monopoly", "Estratégia", "Livre");
        JogoDeCartas jogoDeCartas = new JogoDeCartas("UNO", "Cartas", "Livre");

        jogoDigital.iniciar();
        jogoDigital.conectarJogadores(new String[]{"Alice", "Bob"});
        jogoDigital.pausar();
        jogoDigital.finalizar();

        System.out.println();

        jogoDeTabuleiro.iniciar();
        jogoDeTabuleiro.pausar();
        jogoDeTabuleiro.finalizar();

        System.out.println();

        jogoDeCartas.iniciar();
        jogoDeCartas.pausar();
        jogoDeCartas.finalizar();
    }
}
