package br.com.cod3r.exercicios.state.states;

import br.com.cod3r.exercicios.state.services.PedidoService;

public class PedidoAprovado implements StatusPedido{

    private String name = "pedidoAprovado";

    private PedidoService pedido;

    public PedidoAprovado(PedidoService pedido){
        this.pedido = pedido;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void aprovarPedido() {
        System.out.println("O pedido já esta no estado aprovado");
    }

    @Override
    public void esperarPedido() {
        this.pedido.setState(new PedidoPendente(this.pedido));
    }

    @Override
    public void reprovarPedido() {
        this.pedido.setState(new PedidoReprovado(this.pedido));
    }

    @Override
    public void cancelarPedido() {
        this.pedido.setState(new PedidoCancelado(this.pedido));
    }

    @Override
    public void finalizarPedido() {
        this.pedido.setState(new PedidoFinalizado(this.pedido));
    }
}
