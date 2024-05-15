package alunosenotas.entidades;
public class classe {
   

    public String nome;
    public String matricula;
    public int n;
    public double [] notas = new double [n];
    
    

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

