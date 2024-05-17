import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha um instrumento para tocar:");
        System.out.println("1. Violão");
        System.out.println("2. Piano");
        System.out.println("3. Flauta");
        int escolha = scanner.nextInt();
        
        InstrumentoMusical instrumento = null;
        
        switch (escolha) {
            case 1:
                instrumento = new Violao();
                break;
            case 2:
                instrumento = new Piano();
                break;
            case 3:
                instrumento = new Flauta();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }
        
        System.out.println("O que você gostaria de fazer?");
        System.out.println("1. Tocar uma nota");
        System.out.println("2. Afinar o instrumento");
        int acao = scanner.nextInt();
        
        switch (acao) {
            case 1:
                System.out.println("Digite a nota que você gostaria de tocar:");
                scanner.nextLine(); // Consumir a quebra de linha pendente
                String nota = scanner.nextLine();
                instrumento.tocarNota(nota);
                break;
            case 2:
                instrumento.afinar();
                break;
            default:
                System.out.println("Opção inválida!");
        }
        
        scanner.close();
    }
}
