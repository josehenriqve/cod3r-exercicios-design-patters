package br.com.cod3r.exercicios.observer.model;

import br.com.cod3r.exercicios.observer.observers.YoutubeListener;

public class User implements YoutubeListener {
    private String name;

    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    @Override
    public void updateNotificationStatus(String status) {
        if (!status.isEmpty()) {
            System.out.println(status+" \n para "+this.name);
        }
    }
}
