
package FiguraGeometrica.Entidades;

public abstract  class FiguraGeometrica {
    protected String nome;

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public String getNome(){
            return nome;
    }
    
}
