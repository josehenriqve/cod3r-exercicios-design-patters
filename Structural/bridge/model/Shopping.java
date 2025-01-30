package br.com.cod3r.exercicios.bridge.model;

import java.util.ArrayList;
import java.util.List;

public class Shopping implements Compra {
    private double valorTotal;
    private List<ItemCompra> itens = new ArrayList<>();

    private ItemCompra brinde;

    private double taxaDoShopping = 0.2;

    @Override
    public List<ItemCompra> getItens() {
        if (!itens.contains(brinde)) {
            this.itens.add(brinde);
        }
        return this.itens;
    }

    @Override
    public double getValorTotal() {
        return this.calcularValorTotal();
    }


    @Override
    public void adicionarItensItem(List<ItemCompra> itemCompra) {
        this.itens.addAll(itemCompra);
    }

    public double calcularValorTotal() {
        for(ItemCompra itemCompra : itens) {
            this.valorTotal += itemCompra.getValor();
        }
        return valorTotal;
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

    public ItemCompra getBrinde() {
        return brinde;
    }

    public void setBrinde(ItemCompra brinde) {
        this.brinde = brinde;
    }

    public double getTaxaDoShopping() {
        return taxaDoShopping;
    }

    public void setTaxaDoShopping(double taxaDoShopping) {
        this.taxaDoShopping = taxaDoShopping;
    }

    public void adicionarItem(ItemCompra itemCompra) {
        this.itens.add(itemCompra);
    }
}
