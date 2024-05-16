package Produto.Main;

import java.util.Scanner;
import Produto.Entidades.Eletronico;                              
import Produto.Entidades.Livro;
import Produto.Entidades.Roupa;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de produto:");
        System.out.println("1. Livro");
        System.out.println("2. Eletrônico");
        System.out.println("3. Roupa");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                interactWithLivro(scanner);
                break;
            case 2:
                interactWithEletronico(scanner);
                break;
            case 3:
                interactWithRoupa(scanner);
                break;
            default:
                System.out.println("Escolha inválida.");
        }

        scanner.close();
    }

    public static void interactWithLivro(Scanner scanner) {
        Livro livro = new Livro();
        System.out.println("Digite o nome do livro:");
        livro.nome = scanner.next();
        System.out.println("Digite o preço do livro:");
        livro.preco = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.println("Digite o nome do autor:");
        livro.autor = scanner.nextLine();
        System.out.println("Digite o número de páginas:");
        livro.numeroPaginas = scanner.nextInt();

        // Interact with Livro
        System.out.println("=== Detalhes do Livro ===");
        livro.exibirDetalhes();
    }

    public static void interactWithEletronico(Scanner scanner) {
        Eletronico eletronico = new Eletronico();
        System.out.println("Digite o nome do produto eletrônico:");
        eletronico.nome = scanner.next();
        System.out.println("Digite o preço do produto eletrônico:");
        eletronico.preco = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.println("Digite a marca do produto eletrônico:");
        eletronico.marca = scanner.nextLine();
        System.out.println("Digite o modelo do produto eletrônico:");
        eletronico.modelo = scanner.nextLine();

        // Interact with Eletronico
        System.out.println("=== Detalhes do Produto Eletrônico ===");
        eletronico.exibirDetalhes();
    }

    public static void interactWithRoupa(Scanner scanner) {
        Roupa roupa = new Roupa();
        System.out.println("Digite o nome da roupa:");
        roupa.nome = scanner.next();
        System.out.println("Digite o preço da roupa:");
        roupa.preco = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.println("Digite o tamanho da roupa:");
        roupa.tamanho = scanner.nextLine();
        System.out.println("Digite a cor da roupa:");
        roupa.cor = scanner.nextLine();

        // Interact with Roupa
        System.out.println("=== Detalhes da Roupa ===");
        roupa.exibirDetalhes();
    }
}
