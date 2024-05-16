package DispositivosEletronicos.Main;

import java.util.Scanner;
import DispositivosEletronicos.Main.Entidades.Notebook;
import DispositivosEletronicos.Main.Entidades.Smartphone;
import DispositivosEletronicos.Main.Entidades.Tablet;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de dispositivo eletrônico:");
        System.out.println("1. Smartphone");
        System.out.println("2. Tablet");
        System.out.println("3. Notebook");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                interactWithSmartphone(scanner);
                break;
            case 2:
                interactWithTablet(scanner);
                break;
            case 3:
                interactWithNotebook(scanner);
                break;
            default:
                System.out.println("Escolha inválida.");
        }

        scanner.close();
    }

    public static void interactWithSmartphone(Scanner scanner) {
        Smartphone smartphone = new Smartphone();
        System.out.println("Digite a marca do smartphone:");
        smartphone.marca = scanner.next();
        System.out.println("Digite o ano de fabricação do smartphone:");
        smartphone.anoFabricacao = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Marca: " + smartphone.marca);
        System.out.println("Ano de Fabricação: " + smartphone.anoFabricacao);
        smartphone.ligar();
        smartphone.enviarMensagem("Olá, mundo!");
    }

    public static void interactWithTablet(Scanner scanner) {
        Tablet tablet = new Tablet();
        System.out.println("Digite a marca do tablet:");
        tablet.marca = scanner.next();
        System.out.println("Digite o ano de fabricação do tablet:");
        tablet.anoFabricacao = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Marca: " + tablet.marca);
        System.out.println("Ano de Fabricação: " + tablet.anoFabricacao);
        tablet.ligar();
        tablet.abrirAplicativo("YouTube");
    }

    public static void interactWithNotebook(Scanner scanner) {
        Notebook notebook = new Notebook();
        System.out.println("Digite a marca do notebook:");
        notebook.marca = scanner.next();
        System.out.println("Digite o ano de fabricação do notebook:");
        notebook.anoFabricacao = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Marca: " + notebook.marca);
        System.out.println("Ano de Fabricação: " + notebook.anoFabricacao);
        notebook.ligar();
        notebook.abrirDocumento("Relatório");
    }
}
