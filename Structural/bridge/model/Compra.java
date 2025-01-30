package br.com.cod3r.exercicios.bridge.model;


import java.util.List;

public interface Compra {
     List<ItemCompra> getItens();
     double getValorTotal();
     void adicionarItensItem(List<ItemCompra> itemCompra);
}
