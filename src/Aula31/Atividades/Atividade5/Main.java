package Aula31.Atividades.Atividade5;

public class Main {
    public static void main(String[] args) {
        Mamifero leao = new Mamifero("Leão", 5, "Panthera leo");
        Ave papagaio = new Ave("Papagaio", 2, "Amazona aestiva");
        Reptil cobra = new Reptil("Cobra", 3, "Serpentes");

        leao.emitirSom();
        leao.alimentar();
        leao.cuidar();

        papagaio.emitirSom();
        papagaio.alimentar();
        papagaio.cuidar();

        cobra.emitirSom();
        cobra.alimentar();
        cobra.cuidar();
    }
}
