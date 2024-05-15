package animaisZoologico;

public class Ave extends Animal {
    private String tipoPena;

    public Ave(String nome, int idade, String tipoPena) {
        super(nome, idade);
        this.tipoPena = tipoPena;
    }

    // Getter e Setter
    public String getTipoPena() {
        return tipoPena;
    }

    public void setTipoPena(String tipoPena) {
        this.tipoPena = tipoPena;
    }
}
