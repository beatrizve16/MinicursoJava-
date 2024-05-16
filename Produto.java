package Produto.Entidades;

public class Produto {
    public String nome;
    public double preco;

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
    }
}

