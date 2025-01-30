package br.com.cod3r.exercicios.chainOfResponsability.process.model;

public class Cliente {
    private String name;

    private String passWord;

    private String email;

    public String getName() {
        return name;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getEmail() {
        return email;
    }

    public Cliente(String name, String passWord, String email) {
        this.name = name;
        this.passWord = passWord;
        this.email = email;
    }


    public static class Builder{
        private String name;

        private String passWord;

        private String email;

        public Builder(String name){
            this.name = name;
        }

        public Builder withPassWord(String passWord){
            this.passWord = passWord;
            return this;
        }

        public Builder withEmail(String email){
            this.email = email;
            return this;
        }

        public Cliente build(){
            return new Cliente(name, passWord, email);
        }
    }
}
