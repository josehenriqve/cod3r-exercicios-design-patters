package br.com.cod3r.exercicios.state.states;


import br.com.cod3r.exercicios.state.services.PedidoService;

public class PedidoFinalizado implements StatusPedido{

    private String name = "Pedido Finalizado";

    private PedidoService pedido;

    public PedidoFinalizado(PedidoService pedido){
        this.pedido = pedido;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void aprovarPedido() {
        System.out.println("Esse pedido já foi finalizado");
    }

    @Override
    public void esperarPedido() {
        System.out.println("Esse pedido já foi finalizado");
    }

    @Override
    public void reprovarPedido() {
        System.out.println("Esse pedido já foi finalizado");
    }

    @Override
    public void cancelarPedido() {
        System.out.println("Esse pedido já foi finalizado");
    }

    @Override
    public void finalizarPedido() {
        System.out.println("Pedido Finalizado");
        System.out.println("Enviando ao cliente");
    }
}
