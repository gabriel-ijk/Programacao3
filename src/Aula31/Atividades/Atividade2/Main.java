package Aula31.Atividades.Atividade2;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Revista revista = new Revista("National Geographic", "Diversos", 2021);
        Jornal jornal = new Jornal("The New York Times", "NYT Team", 2023);

        livro.emprestar();
        revista.reservar();
        jornal.emprestar();

        livro.devolver();
        revista.devolver();
        jornal.reservar();
    }
}
