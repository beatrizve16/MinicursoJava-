package Produto.Entidades;

public class Roupa extends Produto {
    public String tamanho;
    public String cor;

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cor: " + cor);
    }
}
