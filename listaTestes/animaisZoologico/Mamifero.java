package animaisZoologico;

public class Mamifero extends Animal {
    private String tipoPelagem;

    public Mamifero(String nome, int idade, String tipoPelagem) {
        super(nome, idade);
        this.tipoPelagem = tipoPelagem;
    }

    // Getter e Setter
    public String getTipoPelagem() {
        return tipoPelagem;
    }

    public void setTipoPelagem(String tipoPelagem) {
        this.tipoPelagem = tipoPelagem;
    }
}
