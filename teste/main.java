import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Calcular área e perímetro do Quadrado");
            System.out.println("2 - Calcular área e perímetro do Círculo");
            System.out.println("3 - Calcular área e perímetro do Triângulo");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
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
                    double lado1Triangulo = scanner.nextDouble();
                    double lado2Triangulo = scanner.nextDouble();
                    double lado3Triangulo = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(lado1Triangulo, lado2Triangulo, lado3Triangulo);
                    System.out.println("Área do triângulo: " + triangulo.calcularArea());
                    System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
