package br.com.cod3r.exercicios.observer.subject;



import br.com.cod3r.exercicios.observer.observers.YoutubeListener;

import java.util.ArrayList;
import java.util.List;

public abstract class Notification {
    private List<YoutubeListener> listeners = new ArrayList<YoutubeListener>();

    public void subscribe(YoutubeListener observer) {
        listeners.add(observer);
    }

    public void unsubscribe(YoutubeListener observer) {
        listeners.remove(observer);
    }

    public void notifyObservers(String status) {
        for(YoutubeListener o: listeners) {
            o.updateNotificationStatus(status);
        }
    }

    public int getNumberOfSubscribers() {
        return listeners.size();
    }

}
