package br.com.cod3r.exercicios.composite.model;

import java.util.ArrayList;
import java.util.List;

public class ProdutComposed implements Component{

    private List<Component> produtos = new ArrayList<Component>();

    public void adicionar(Component produto){
        this.produtos.add(produto);
    }

    public void remover(Component component){
        this.produtos.remove(produtos.indexOf(component));
    }

    @Override
    public int getTotal() {
        return  produtos.stream()
                .map(Component::getTotal)
                .reduce(0, Integer::sum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProdutComposed:\n");
        produtos.forEach(component -> sb.append(component.toString()).append(" "));

        return sb.toString();
    }
}
