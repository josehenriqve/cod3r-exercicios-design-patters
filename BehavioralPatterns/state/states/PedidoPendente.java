package br.com.cod3r.exercicios.state.states;

import br.com.cod3r.exercicios.state.services.PedidoService;

public class PedidoPendente implements StatusPedido{


    private PedidoService pedido;

    public PedidoPendente(PedidoService pedido){
        this.pedido = pedido;
    }
    @Override
    public String getName() {
        return "Pedido pendente";
    }

    @Override
    public void aprovarPedido() {
        this.pedido.setState(new PedidoAprovado(this.pedido));
    }

    @Override
    public void esperarPedido() {
        System.out.println("Pedido já está pendente");
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
        System.out.println("Impossível enviar ao cliente com os status pendente");
    }
}
