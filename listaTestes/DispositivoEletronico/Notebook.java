package dispositivosEletronicos;

public class Notebook extends DispositivoEletronico {
    private String processador;

    public Notebook(String marca, int anoFabricacao, String processador) {
        super(marca, anoFabricacao);
        this.processador = processador;
    }

    // Getters e Setters
    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
}

