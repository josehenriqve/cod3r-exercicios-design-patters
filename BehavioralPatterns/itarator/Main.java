package br.com.cod3r.exercicios.itarator;




public class Main {
    public static void main(String[] args) {
        ClientCompose compose = new ClientCompose(new Client("client1","emailtes@gmail.com"),new Client("client2","client2@gmail.com"));

        for(Client client: compose){
            System.out.println("Name: " + client.getName() + " Email: " + client.getEmail());
        }
    }
}
