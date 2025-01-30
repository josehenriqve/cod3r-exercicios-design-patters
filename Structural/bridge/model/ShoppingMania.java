package br.com.cod3r.exercicios.bridge.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingMania implements Compra {
    private double valorTotal;
    private List<ItemCompra> itens = new ArrayList<>();

    private double taxaDoShopping = 0.8;

    @Override
    public List<ItemCompra> getItens() {
        return this.itens;
    }

    @Override
    public void adicionarItensItem(List<ItemCompra> itemCompra) {
        this.valorTotal = calcularValorTotal();
        this.itens.addAll(itemCompra);
    }

    public double calcularValorTotal() {
        for(ItemCompra itemCompra : itens) {
            this.valorTotal += itemCompra.getValor();
        }
        return valorTotal;
    }

    @Override
    public double getValorTotal() {
        return this.valorTotal + calcularTaxaDoShopping();
    }

    public double calcularTaxaDoShopping() {
        return this.valorTotal * taxaDoShopping;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setItens(List<ItemCompra> itens) {
        this.itens = itens;
    }

    public double getTaxaDoShopping() {
        return taxaDoShopping;
    }

    public void setTaxaDoShopping(double taxaDoShopping) {
        this.taxaDoShopping = taxaDoShopping;
    }
}
