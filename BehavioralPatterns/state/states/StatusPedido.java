package br.com.cod3r.exercicios.state.states;

public interface StatusPedido {

    String getName();

    void aprovarPedido();

    void esperarPedido();

    void reprovarPedido();

    void cancelarPedido();

    void finalizarPedido();


}
