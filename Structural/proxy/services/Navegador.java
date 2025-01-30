package br.com.cod3r.exercicios.proxy.services;

import br.com.cod3r.exercicios.proxy.model.Site;

public class Navegador implements GetProtocol {

    private String headers = "headerChrome";

    @Override
    public String getHeaders() {
        return this.headers;
    }

    @Override
    public void goToSite(Site site) {
        String header = "headerChrome";
        if (headers == header)  {
            System.out.println("Acessando o site "+site.getTitle());
        } else {
            System.out.println("Site invalido");
        }
    }
}
