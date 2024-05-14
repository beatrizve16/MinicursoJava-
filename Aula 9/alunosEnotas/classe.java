package alunosenotas.main;

public class Aluno {
    public String nome;
    public String matricula;
    public double[] notas;

    public void adicionarMaterias (int indiceDisciplina, double materia) {
        notas[indiceDisciplina] = materia;
    }

    public void adicionarNota(int indiceDisciplina, double nota) {
        notas[indiceDisciplina] = nota;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public boolean foiAprovado(double mediaMinima) {
        double media = calcularMedia();
        return media >= mediaMinima;
    }
}
