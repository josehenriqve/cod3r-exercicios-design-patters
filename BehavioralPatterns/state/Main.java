package br.com.cod3r.exercicios.state;

import br.com.cod3r.exercicios.state.services.PedidoService;

public class Main {
    public static void main(String[] args) {
        PedidoService pedidoService = new PedidoService();
        pedidoService.aprovarPedido();
        pedidoService.reprovarPedido();
        pedidoService.finalizarPedido();
        System.out.println(pedidoService.getName());

    }
}
