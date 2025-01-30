package br.com.cod3r.exercicios.facade.service;

import br.com.cod3r.exercicios.facade.model.Cliente;

public class ClienteService extends Service<Cliente>{
    public void criarAtenticadorApi(){
        System.out.println("Criando altenticador");
    }

    public void criarDados(){
        System.out.println("Criando dados");
    }
}
