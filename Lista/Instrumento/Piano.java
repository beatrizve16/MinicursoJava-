public class Piano implements InstrumentoMusical {
    @Override
    public void tocarNota(String nota) {
        System.out.println("Tocando nota " + nota + " no piano.");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando o piano.");
    }
}
