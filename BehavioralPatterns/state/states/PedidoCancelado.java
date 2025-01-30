package br.com.cod3r.exercicios.state.states;

import br.com.cod3r.exercicios.state.services.PedidoService;

public class PedidoCancelado implements StatusPedido{
    private String name;

    private PedidoService pedido;

    public PedidoCancelado(PedidoService pedido){
        this.pedido = pedido;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void aprovarPedido() {
        System.out.println("Não posso aprovar porque o pedido foi cancelado");
    }

    @Override
    public void esperarPedido() {
        System.out.println("Não posso esperar porque o pedido foi cancelado");
    }

    @Override
    public void reprovarPedido() {
        System.out.println("Não posso reprovar porque o pedido foi cancelado");
    }

    @Override
    public void cancelarPedido() {
        System.out.println("Não posso cancelar porque o pedido foi cancelado");
    }

    @Override
    public void finalizarPedido() {
        System.out.println("Não posso finalizar porque o pedido foi cancelado");
    }
}
