public class Violao implements InstrumentoMusical {
    @Override
    public void tocarNota(String nota) {
        System.out.println("Tocando nota " + nota + " no violão.");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando o violão.");
    }
}
