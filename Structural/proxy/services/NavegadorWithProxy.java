package br.com.cod3r.exercicios.proxy.services;

import br.com.cod3r.exercicios.proxy.model.Site;

public class NavegadorWithProxy implements GetProtocol{

    private GetProtocol getProtocol;

    public NavegadorWithProxy(GetProtocol getProtocol) {
        this.getProtocol = getProtocol;
    }

    @Override
    public String getHeaders() {
        System.out.println("NavegadorWithProxy.getHeaders");
        return getProtocol.getHeaders();
    }

    @Override
    public void goToSite(Site site) {
        if (site.getUrl().contains("vvv")) {
            System.out.println("Site proibido");
        } else {
            getProtocol.goToSite(site);
        }
    }
}
