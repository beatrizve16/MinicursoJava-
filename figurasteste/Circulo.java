package FiguraGeometrica.Entidades;

public  class Circulo extends FiguraGeometrica{

    private double raio;

    public Circulo(double raio){
        this.nome = "Circulo";
        this.raio=raio;
    }

    @Override
    public double calcularArea(){
        return 3.141516*raio*raio;
    }

    @Override
    public double calcularPerimetro(){
        return 2*3.141516*raio;
    }

    
}
