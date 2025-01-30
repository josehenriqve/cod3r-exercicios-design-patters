package br.com.cod3r.exercicios.adpter.model;

public class Envelop {

    private int id;

    private String email;

    private String nome;

    private String titulo;

    private String anexo;

    private JSON corpo;

    public Envelop(int id, String email, String nome, String titulo, String anexo, JSON corpo) {
        this.id = id;
        this.email = email;
        this.nome = nome;
        this.titulo = titulo;
        this.anexo = anexo;
        this.corpo = corpo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorpo() {
        return this.corpo.toJson();
    }

    public void setCorpo(JSON corpo) {
        this.corpo = corpo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public static class Builder{
        private int id;

        private String email;

        private String nome;

        private String titulo;

        private String anexo;

        public Builder(int id, String email) {
            this.id = id;
            this.email = email;
        }

        public Builder andNome(String nome) {
            this.nome = nome;
            return this;
        }
        public Builder andTitulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder andAnexo(String anexo) {
            this.anexo = anexo;
            return this;
        }

        public Envelop build(JSON corpo) {
            return new Envelop(id, email, nome, titulo, anexo, corpo);
        }

    }
}
