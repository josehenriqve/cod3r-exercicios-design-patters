package br.com.cod3r.exercicios.adpter.model;

public class JSON {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String toJson() {
        return "{\"data\":\"" + data + "\"}";
    }
}
