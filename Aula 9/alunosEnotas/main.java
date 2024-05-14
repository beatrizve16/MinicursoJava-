package alunosenotas.main;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno:");
         aluno.nome = scanner.nextLine();

        System.out.println("Digite a matrícula do aluno:");
        aluno.matricula = scanner.nextLine();

        System.out.println("Digite o número de disciplinas:");
         int numDisciplinas = scanner.nextInt();


        for (int i = 0; i < numDisciplinas; i++) {
            System.out.println("Digite a quantidade de provas da disciplina" + (i + 1) + ":");
            double materia = scanner.nextDouble();
            aluno.adicionarMaterias(i, materia);

            for (int j = 0; j < materia; j++) {
                System.out.println("Digite a nota da prova " + (j + 1) + "da disciplina " + ( i + 1));
                double nota = scanner.nextDouble();
                aluno.adicionarNota(i, nota);
            } 
        } 

        System.out.println("O que você gostaria de saber?");
        System.out.println("1. Média das notas");
        System.out.println("2. Se foi aprovado");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                double media = aluno.calcularMedia();
                System.out.println("A média é:" + media);
                break;
            case 2:
                System.out.println("Digite a média mínima para aprovação:");
                double mediaMinima = scanner.nextDouble();

                boolean aprovado = aluno.foiAprovado(mediaMinima);
                if (aprovado) {
                    System.out.println("O aluno foi aprovado!");
                } else {
                    System.out.println("O aluno foi reprovado.");
                }
                break;
    }
}
}
