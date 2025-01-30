package br.com.cod3r.exercicios.observer.subject;

public class NotificationEngine extends Notification {

    private String status;

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String newStatus) {
        this.status = newStatus;
        notifyObservers(newStatus);
    }
}
