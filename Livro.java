package Produto.Entidades;

public class Livro extends Produto {
    public String autor;
    public int numeroPaginas;

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}

