package FiguraGeometrica.Entidades;

public  class Triangulo extends FiguraGeometrica{

    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    public Triangulo(double ladoA, double ladoB, double ladoC){
        this.nome="Triagulo";
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.ladoC=ladoC;
    }

    @Override
    public double calcularArea(){
        double area = (ladoA+ladoB+ladoC)/2;
        return Math.sqrt(area*(area-ladoA)*(area-ladoB)*(area-ladoC));
    }

    @Override
    public double calcularPerimetro(){
        return ladoA+ladoB+ladoC;
    }
    
}
