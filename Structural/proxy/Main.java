package br.com.cod3r.exercicios.proxy;

import br.com.cod3r.exercicios.proxy.model.Site;
import br.com.cod3r.exercicios.proxy.services.GetProtocol;
import br.com.cod3r.exercicios.proxy.services.Navegador;
import br.com.cod3r.exercicios.proxy.services.NavegadorWithProxy;

public class Main {
    public static void main(String[] args) {
        //GetProtocol navegador = new Navegador();
        GetProtocol navegador = new NavegadorWithProxy(new Navegador());
        navegador.goToSite(new Site("facebook.com.br","Facebook"));
        navegador.goToSite(new Site("sitevvv2.com","Site vvv 2"));
        navegador.goToSite(new Site("google.com.br","Google"));
        navegador.goToSite(new Site("vvvsite.com.br","vvv videos"));
    }
}
