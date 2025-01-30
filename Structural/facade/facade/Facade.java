package br.com.cod3r.exercicios.facade.facade;

import br.com.cod3r.exercicios.facade.model.Cliente;
import br.com.cod3r.exercicios.facade.model.Pagamento;
import br.com.cod3r.exercicios.facade.service.ClienteService;
import br.com.cod3r.exercicios.facade.service.PagamentoService;

public class Facade {

    private ClienteService clienteService = new ClienteService();

    private PagamentoService pagamentoService = new PagamentoService();



    public void create() {

        clienteService.create(new Cliente("1","00","321"));
        clienteService.create(new Cliente("2","0","321"));
        clienteService.create(new Cliente("3","32","123"));

        pagamentoService.create(new Pagamento(1,"123",10));
        pagamentoService.create(new Pagamento(1,"123",10));
    }

    public void list() {
        for(Cliente cliente : clienteService.getAll()){
            System.out.println(cliente.print());
        }

        for(Pagamento pagamento : pagamentoService.getAll()){
            System.out.println(pagamento.print());
        }
    }



}
