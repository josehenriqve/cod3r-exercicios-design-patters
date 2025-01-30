package br.com.cod3r.exercicios.facade.service;


import br.com.cod3r.exercicios.facade.model.Pagamento;



public class PagamentoService extends Service<Pagamento> {
    public void getTokenApi() {
        System.out.println("Getting token api");
    }

    public void isPaid() {
        System.out.println("true");
    }

    public void filtrarPagamentos() {
        System.out.println("Filtrando Pagamentos");
    }
}
