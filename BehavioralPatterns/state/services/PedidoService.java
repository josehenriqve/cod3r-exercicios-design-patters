package br.com.cod3r.exercicios.state.services;

import br.com.cod3r.exercicios.state.states.PedidoPendente;
import br.com.cod3r.exercicios.state.states.StatusPedido;

public class PedidoService {

    private StatusPedido estado = new PedidoPendente(this);

    public void setState(StatusPedido state) {
        this.estado = state;
    }


    public String getName() {
        return this.estado.getName();
    }


    public void aprovarPedido() {
       this.estado.aprovarPedido();
    }


    public void esperarPedido() {
        this.estado.esperarPedido();
    }


    public void reprovarPedido() {
        this.estado.reprovarPedido();
    }


    public void cancelarPedido() {
        this.estado.cancelarPedido();
    }


    public void finalizarPedido() {
        this.estado.finalizarPedido();
    }
    @Override
    public String toString() {
        return this.estado.toString();
    }
}
