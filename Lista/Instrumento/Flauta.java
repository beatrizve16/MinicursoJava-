public class Flauta implements InstrumentoMusical {
    @Override
    public void tocarNota(String nota) {
        System.out.println("Tocando nota " + nota + " na flauta.");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando a flauta.");
    }
}
