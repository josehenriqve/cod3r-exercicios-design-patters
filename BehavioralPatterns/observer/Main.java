package br.com.cod3r.exercicios.observer;

import br.com.cod3r.exercicios.observer.model.User;
import br.com.cod3r.exercicios.observer.observers.YoutubeListener;
import br.com.cod3r.exercicios.observer.subject.NotificationEngine;

public class Main {
    public static void main(String[] args) {
        YoutubeListener user = new User("jose","jose@123");
        YoutubeListener user2 = new User("Lucas","lucas@123");
        YoutubeListener user3 = new User("Joao","joao@123");
        YoutubeListener use4 = new User("claudio","claudio@123");


        NotificationEngine notificationEngine = new NotificationEngine();

        notificationEngine.subscribe(user);
        notificationEngine.subscribe(user2);
        notificationEngine.subscribe(user3);

        notificationEngine.setStatus("Coloquei fogo na minha casa e olha o que aconteceu!! ");
        System.out.println("notificacao enviada para: "+notificationEngine.getNumberOfSubscribers());


    }
}
