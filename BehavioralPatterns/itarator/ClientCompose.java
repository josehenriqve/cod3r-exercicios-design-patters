package br.com.cod3r.exercicios.itarator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ClientCompose implements Iterable<Client>{

    private List<Client> listOfClients = new ArrayList<>();

    public ClientCompose(Client... client) {
        this.listOfClients = Arrays.asList(client);
    }

    @Override
    public Iterator<Client> iterator() {
        return listOfClients.iterator();
    }
}
