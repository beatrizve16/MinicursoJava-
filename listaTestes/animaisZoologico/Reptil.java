package animaisZoologico;

public class Reptil extends Animal {
    private boolean venenoso;

    public Reptil(String nome, int idade, boolean venenoso) {
        super(nome, idade);
        this.venenoso = venenoso;
    }

    // Getter e Setter
    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
}
