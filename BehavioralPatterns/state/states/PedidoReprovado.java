package br.com.cod3r.exercicios.state.states;

import br.com.cod3r.exercicios.state.services.PedidoService;

public class PedidoReprovado implements StatusPedido{

    private PedidoService pedido;

    public PedidoReprovado(PedidoService pedido){
        this.pedido = pedido;
    }

    @Override
    public String getName() {
        return "Pedido Reprovado";
    }

    @Override
    public void aprovarPedido() {

    }

    @Override
    public void esperarPedido() {

    }

    @Override
    public void reprovarPedido() {

    }

    @Override
    public void cancelarPedido() {

    }

    @Override
    public void finalizarPedido() {

    }
}
