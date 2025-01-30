package br.com.cod3r.exercicios.proxy.model;

public class Site {
    private String url;

    private String title;

    public Site(String url, String title) {
        this.url = url;
        this.title = title;
    }

    public String getUrl() {return url;}

    public void setUrl(String url) {this.url = url;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}
}
