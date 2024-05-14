package ContaBancaria.main;

import java.util.Scanner;

import ContaBancaria.Entidades.ContaBancaria;

// // Crie uma classe ContaBancaria que represente uma conta 
// bancária básica. Ela deve ter atributos como numero, saldo
//  e titular. Implemente métodos para depositar, sacar e verificar
//   o saldo da conta.

public class mainConta {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    ContaBancaria x = new ContaBancaria();

System.out.println("Digite o numero da conta") ;
x.numero = sc.nextDouble();

System.out.println("Digite o titular da conta") ;
String titular = sc.next();

System.out.println("Digite o saldo da conta") ;
x.saldo = sc.nextDouble();

System.out.println("1-Depositar\n2-Sacar\n3-Verificar o Saldo");
int escolha = sc.nextInt();

switch (escolha) {

    case 1:
    System.out.println("Quanto quer depositar:");
     x.depositar = sc.nextInt();
    x.saldo = x.funcDepositar(x.saldo,x.depositar);
    System.out.printf("O saldo depois do deposito e:" + x.saldo);
    break;

    case 2:
    System.out.println("Quanto quer sacar:");
    x.sacar = sc.nextInt();
    x.saldo = x.funcSacar(x.saldo,x.sacar);
    System.out.printf("O saldo depois do saque e:" + x.saldo);
    break;

    case 3:
    x.funcVerificar(x.saldo);
    System.out.printf("O saldo da conta:" + x.saldo);
    break; 

}


    
}
}
