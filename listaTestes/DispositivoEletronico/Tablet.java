package dispositivosEletronicos;

public class Tablet extends DispositivoEletronico {
    private String modelo;

    public Tablet(String marca, int anoFabricacao, String modelo) {
        super(marca, anoFabricacao);
        this.modelo = modelo;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
