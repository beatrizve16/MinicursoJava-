package Produto.Entidades;

public class Eletronico extends Produto {
    public String marca;
    public String modelo;

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
