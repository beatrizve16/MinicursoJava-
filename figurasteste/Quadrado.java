package FiguraGeometrica.Entidades;

public  class Quadrado extends FiguraGeometrica {
    private double lado;

    public Quadrado(double lado){
        this.nome="Quadrado";
        this.lado=lado;
    }

    @Override
    public double calcularArea(){
        return lado*lado;
    }
    
    @Override 
    public double calcularPerimetro(){
        return 4*lado;
    }
}
