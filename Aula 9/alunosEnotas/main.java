package alunosenotas.main;
import java.util.Scanner;
import alunosenotas.entidades.classe;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    classe aluno = new classe();

        System.out.println("Digite o nome do aluno:");
         aluno.nome = scanner.nextLine();

        System.out.println("Digite a matrícula do aluno:");
        aluno.matricula = scanner.nextLine();

        System.out.println("Digite o número de disciplinas:");
        aluno.n = scanner.nextInt();

aluno.notas= new double[aluno.n];

        for (int i = 0; i < aluno.n; i++) {
                System.out.println("Digite a nota da prova da disciplina " + ( i + 1));
                aluno.notas[i] = scanner.nextDouble();
        } 

                System.out.println("Digite a média mínima para aprovação:");
                double mediaMinima = scanner.nextDouble();

                double media = aluno.calcularMedia();
                System.out.println("A média das notas é:" + media);
        
                

                boolean aprovado = aluno.foiAprovado(mediaMinima);
                if (aprovado) {
                    System.out.println("O aluno foi aprovado!");
                } else {
                    System.out.println("O aluno foi reprovado.");
                }
            
    }
}
