package Zoologico.Main;
import java.util.Scanner;

import Zoologico.Entidades.Animal;
import Zoologico.Entidades.Ave;
import Zoologico.Entidades.Mamifero;
import Zoologico.Entidades.Reptil;
 

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Ave x = new Ave();
    Mamifero y = new Mamifero();
    Reptil z = new Reptil();

    System.out.println("Digite qual animal quer cadastrar 1-Mamifero\n2-Ave\n3-Reptil");
    int escolha = sc.nextInt();

    switch (escolha) { 
    case 1:
    System.out.println("Qual o nome do mamifero?");
     y.nome = sc.next();

     System.out.println("Qual a idade do mamifero?");
     y.idade = sc.nextInt();

     System.out.println("O mamifero se chama:" +y.nome+" tem" +y.idade+"e seu tipo de pelo e:");
    y.nome = y.dormindo(y.nome);
    
    break;

    case 2:
    System.out.println("Qual o nome da Ave?");
    x.nome = sc.next();

    System.out.println("Qual a idade da Ave?");
    x.idade = sc.nextInt();
    System.out.println("A ave se chama:" +y.nome+" tem" +y.idade+"e seu tipo de pena e:");

    break;

    case 3:
    System.out.println("Qual o nome do Reptil?");
     z.nome = sc.next();

     System.out.println("Qual a idade do Reptil?");
     z.idade = sc.nextInt();

     System.out.println("O reptiç se chama:" +y.nome+" tem" +y.idade+"e seu tipo de escamas e:");

     break; 
    }

    }

}

    
