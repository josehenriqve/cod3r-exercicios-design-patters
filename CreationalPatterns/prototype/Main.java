package br.com.cod3r.exercicios.prototype;

import br.com.cod3r.exercicios.prototype.model.Carregador;
import br.com.cod3r.exercicios.prototype.model.TipoCarregador;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Carregador carregador = new Carregador("branca","30v",true, TipoCarregador.C);
        Carregador carregadorClone = (Carregador) carregador.clone();
        carregadorClone.setTipoCarregador(TipoCarregador.A);
        System.out.println(carregadorClone);
        System.out.println(carregador);
    }
}
