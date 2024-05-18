package Projeto_Estoque.Main;

import java.util.Scanner;
import java.util.Locale;
import Projeto_Estoque.Entidade.Produtos.Comidas;
import Projeto_Estoque.Entidade.Produtos.Eletronicos;
import Projeto_Estoque.Entidade.Produtos.Roupas;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Sistema de Estoque!");
        System.out.println("Selecione uma funcionalidade do menu principal:");
        System.out.println("2- Realizar transações de estoque");
        System.out.println("3- Consulta de estoque");
        System.out.println("4- Gerenciamento de produtos");

        int escolha = sc.nextInt();

        switch (escolha) {

            case 2:
                realizarTransacao(sc);
                break;
            case 3:
                consultarEstoque(sc);
                break;
            case 4:
                gerenciarProduto(sc);
                break;
           
            default:
                System.out.println("Opção inválida, tente novamente.");
                break;
        }

        sc.close();
    }

    

    private static void realizarTransacao(Scanner sc) {
        System.out.println("Selecione o tipo do produto que voce deseja transicionar (Adicionar/Retirar produto especifico):");
        System.out.println("1- Comida");
        System.out.println("2- Eletronico");
        System.out.println("3- Roupa");

        int tipoDoProduto = sc.nextInt();
        switch (tipoDoProduto) {
            case 1:
             
                System.out.println("Voce deseja adicionar ou retirar esse produto? (1- Adicionar, 2- Retirar)");
                int tipoDeTransacao = sc.nextInt();
                switch (tipoDeTransacao) {
                    case 1:
                        System.out.println("Digite a quantidade que deseja adicionar");
                        int adicaoComida = sc.nextInt();
                        // Adicionar blablabla
                        break;

                    case 2:
                        System.out.println("Digite a quantidade que deseja retirar");
                        int retirarComida = sc.nextInt();
                        // Retirar blablabla chama a classe e tal
                        break;

                    default:
                        System.out.println("Nenhuma opcao escolhida");
                        break;
                }
                break;

            case 2:
                System.out.println("Voce deseja adicionar ou retirar esse produto? (1- Adicionar, 2- Retirar)");
                tipoDeTransacao = sc.nextInt();
                switch (tipoDeTransacao) {
                    case 1:
                        System.out.println("Digite a quantidade que deseja adicionar");
                        int adicaoEletronico = sc.nextInt();
                        // Adicionar 
                        break;

                    case 2:
                        System.out.println("Digite a quantidade que deseja retirar");
                        int retirarEletronico = sc.nextInt();
                        // Retirar 
                        break;

                    default:
                        System.out.println("Nenhuma opcao escolhida");
                        break;
                }
                break;

            case 3:
                System.out.println("Voce deseja adicionar ou retirar esse produto? (1- Adicionar, 2- Retirar)");
                tipoDeTransacao = sc.nextInt();
                switch (tipoDeTransacao) {
                    case 1:
                        System.out.println("Digite a quantidade que deseja adicionar");
                        int adicaoRoupa = sc.nextInt();
                        // Adicionar 
                        break;

                    case 2:
                        System.out.println("Digite a quantidade que deseja retirar");
                        int retirarRoupa = sc.nextInt();
                        // Retirar 
                        break;

                    default:
                        System.out.println("Nenhuma opcao escolhida");
                        break;
                }
                break;

            default:
                System.out.println("Nenhuma opcao escolhida");
                break;
        }
    }

    private static void consultarEstoque(Scanner sc) {
        System.out.println("Selecione o tipo do produto que voce deseja consultar o estoque:");
        System.out.println("1- Comida");
        System.out.println("2- Eletronico");
        System.out.println("3- Roupa");

        int tipoDoProduto = sc.nextInt();
        switch (tipoDoProduto) {
            case 1:
                System.out.println("Digite o nome da comida a ser consultada");
                String nomeComidaConsulta = sc.next();
                System.out.println("Deseja 1-adicionar ou 2-remover do estoque?");
                int consultarOpcao = sc.nextInt();

                switch (consultarOpcao) {
                    case 1:
                        System.out.println("Digite a quantidade de comida a ser adicionada");
                        int adicionarComidaConsulta = sc.nextInt();
                        // Adicionar 
                        break;

                    case 2:
                        System.out.println("Digite a quantidade de comida a ser removida");
                        int removerComidaConsulta = sc.nextInt();
                        // Remover
                        break;

                    default:
                        System.out.println("Nenhuma opcao escolhida");
                        break;
                }
                break;

            case 2:
                System.out.println("Digite o nome do eletronico a ser consultado");
                String nomeEletronicoConsulta = sc.next();
                System.out.println("Deseja 1-adicionar ou 2-remover do estoque?");
                consultarOpcao = sc.nextInt();

                switch (consultarOpcao) {
                    case 1:
                        System.out.println("Digite a quantidade de eletronicos a serem adicionados");
                        int adicionarEletronicoConsulta = sc.nextInt();
                        // Adicionar 
                        break;

                    case 2:
                        System.out.println("Digite a quantidade de eletronicos a serem removidos");
                        int removerEletronicoConsulta = sc.nextInt();
                        // Remover
                        break;

                    default:
                        System.out.println("Nenhuma opcao escolhida");
                        break;
                }
                break;

            case 3:
                System.out.println("Digite o nome da roupa a ser consultada");
                String nomeRoupaConsulta = sc.next();
                System.out.println("Deseja 1-adicionar ou 2-remover do estoque?");
                consultarOpcao = sc.nextInt();

                switch (consultarOpcao) {
                    case 1:
                        System.out.println("Digite a quantidade de roupas a serem adicionadas");
                        int adicionarRoupaConsulta = sc.nextInt();
                        // Adicionar
                        break;

                    case 2:
                       System.out.println("Digite a quantidade de roupas a serem removidas");
                       int removerRoupaConsulta = sc.nextInt();
                       // Remover 
                       break;

                   default:
                       System.out.println("Nenhuma opcao escolhida");
                       break;
               }
               break;

           default:
               System.out.println("Nenhuma opcao escolhida");
               break;
       }
   }

   private static void gerenciarProduto(Scanner sc) {

    System.out.println("Voce deseja 1-adicionar ou 2-remover?:");
    int escolha = sc.nextInt();

    switch (escolha) {
        case 1:
        System.out.println("Selecione o tipo do produto que você deseja remover:");
        System.out.println("1- Comida");
        System.out.println("2- Eletronico");
        System.out.println("3- Roupa");
 
        int tipoDoProduto = sc.nextInt();
        switch (tipoDoProduto) {
            case 1:
            //remover e tal
            break;
            case 2:
            //remover e tal
            break; 
            case 3:
            //remover e tal
            break; 
        default:
            break;
    }
    case 2:
    System.out.println("O que voce deseja adicionar ao estoque?");
    int adicionarArray = sc.nextInt();

    //adicionar ao array?
      
       }

      

   }
}
