package br.com.cod3r.exercicios.composite;

import br.com.cod3r.exercicios.composite.model.ProdutComposed;
import br.com.cod3r.exercicios.composite.model.Produto;

public class Main {
    public static void main(String[] args) {
        Produto tshirt = new Produto("camiseta",100);
        Produto pen = new Produto("pen",12);
        Produto smartphone = new Produto("smartphone",50);
        ProdutComposed productBox = new ProdutComposed();
        productBox.adicionar(tshirt);
        productBox.adicionar(pen);
        productBox.adicionar(smartphone);

    }
}
