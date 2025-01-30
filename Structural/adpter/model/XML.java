package br.com.cod3r.exercicios.adpter.model;

public class XML {
    private String data;
    private String version;
    private String enconding;


    public XML(String data, String version, String enconding) {
        this.data = data;
        this.version = version;
        this.enconding = enconding;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getEnconding() {
        return enconding;
    }

    public void setEnconding(String enconding) {
        this.enconding = enconding;
    }


    public String toXml() {
        return "<version>" + version + "</version>"+"</enconding>"+"<enconding>" + enconding + "</enconding>"+"<data>" + data + "</data>"+"</enconding>";
    }
}
