package br.com.cod3r.exercicios.proxy.services;

import br.com.cod3r.exercicios.proxy.model.Site;

public interface GetProtocol {
    String getHeaders();
    void goToSite(Site site);
}
