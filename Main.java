package python.zoologico; 

import python.zoologico.Entidades.Ave;
import python.zoologico.Entidades.Mamifero;
import python.zoologico.Entidades.Reptil;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual tipo de animal você quer cadastrar?");
        System.out.println("1. Mamífero");
        System.out.println("2. Ave");
        System.out.println("3. Réptil");
        int opcao = scanner.nextInt();
        
        Mamifero mamifero = new Mamifero();
        Ave ave = new Ave();
        Reptil reptil = new Reptil();
        
        System.out.println("Digite o nome do animal:");
        mamifero.nome = scanner.next();
        ave.nome = mamifero.nome;  // Setting the same name for Ave
        reptil.nome = mamifero.nome;  // Setting the same name for Reptil
        
        System.out.println("Digite a idade do animal:");
        int idade = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("Digite o tipo de pelo do mamífero:");
                mamifero.tipoPelo = scanner.next();
                mamifero.idade = idade;
                mamifero.dormir();
                break;
            case 2:
                System.out.println("Digite o tipo de penas da ave:");
                ave.tipoPenas = scanner.next();
                ave.idade = idade;
                ave.dormir();
                break;
            case 3:
                System.out.println("Digite o tipo de escamas do réptil:");
                reptil.tipoEscamas = scanner.next();
                reptil.idade = idade;
                reptil.dormir();
                break;
            default:
                System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}
