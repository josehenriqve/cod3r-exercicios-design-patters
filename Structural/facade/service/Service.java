package br.com.cod3r.exercicios.facade.service;

import br.com.cod3r.exercicios.facade.model.Model;

import java.util.List;



import java.util.ArrayList;

public abstract class Service<T extends Model>{

    protected List<T> list = new ArrayList<>();

    public void create(T model) {
        list.add(model);
        System.out.println("Adicionado: " + model.print());
    }


    public void delete(T model) {
        list.remove(model);
        System.out.println("Removido: " + model.print());
    }


    public List<T> getAll() {
        return list;
    }
}