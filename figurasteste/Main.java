package FiguraGeometrica.main;
import java.util.Scanner;

import FiguraGeometrica.Entidades.Circulo;
import FiguraGeometrica.Entidades.Quadrado;
import FiguraGeometrica.Entidades.Triangulo;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a figura geométrica:1. Quadrado 2. Círculo 3. Triângulo");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite o lado do quadrado:");
                double ladoQuadrado = scanner.nextDouble();
                Quadrado quadrado = new Quadrado(ladoQuadrado);
                System.out.println("Área do quadrado: " + quadrado.calcularArea());
                System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
                break;
            case 2:
                System.out.println("Digite o raio do círculo:");
                double raioCirculo = scanner.nextDouble();
                Circulo circulo = new Circulo(raioCirculo);
                System.out.println("Área do círculo: " + circulo.calcularArea());
                System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
                break;
            case 3:
                System.out.println("Digite os três lados do triângulo:");
                double ladoATriangulo = scanner.nextDouble();
                double ladoBTriangulo = scanner.nextDouble();
                double ladoCTriangulo = scanner.nextDouble();
                Triangulo triangulo = new Triangulo(ladoATriangulo, ladoBTriangulo, ladoCTriangulo);
                System.out.println("Área do triângulo: " + triangulo.calcularArea());
                System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}


 


