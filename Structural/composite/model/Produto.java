package br.com.cod3r.exercicios.composite.model;

public class Produto implements Component {
    private String nome;
    private int preco;


    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int getTotal() {
        return this.preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + '}';
    }

}
