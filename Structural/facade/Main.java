package br.com.cod3r.exercicios.facade;

import br.com.cod3r.exercicios.facade.facade.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.create();
        facade.list();
    }
}
