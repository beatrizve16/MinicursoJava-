

import java.util.Scanner;

import teste.minicursoJava.Retangulo;

public class mainretangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo x = new Retangulo();
        
        x.base = sc.nextDouble();
        x.altura = sc.nextDouble();
        
        x.area= x.calcArea(x.base, x.altura);
        x.perimetro= x.calcPerimetro(x.base, x.altura);
        x.diagonal= x.calcDiagonal(x.base, x.altura);
        
        System.out.println(" A area do retangulo e" + x.area);
        System.out.println(" O perimetro do retangulo e" + x.perimetro);
        System.out.println(" A diagonal do retangulo e" + x.diagonal);

    
    }    


}
