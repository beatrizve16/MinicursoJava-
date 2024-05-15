package dispositivosEletronicos;

public class Smartphone extends DispositivoEletronico {
    private String sistemaOperacional;

    public Smartphone(String marca, int anoFabricacao, String sistemaOperacional) {
        super(marca, anoFabricacao);
        this.sistemaOperacional = sistemaOperacional;
    }

    // Getters e Setters
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
}
