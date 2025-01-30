package br.com.cod3r.exercicios.builder;

import br.com.cod3r.exercicios.builder.model.Adress;
import br.com.cod3r.exercicios.builder.model.TypeUser;
import br.com.cod3r.exercicios.builder.model.User;
import br.com.cod3r.exercicios.builder.model.enums.Gender;

public class Main {
    public static void main(String[] args) {
         User user = new User.Builder(1l).
                 andAge("17y").
                 andName("Joselves User").
                 andTypeUser(TypeUser.ADMIN).
                 andAddress(new Adress()).
                 andGender(Gender.MALE).
                 create();

        System.out.println(user.toString());
    }
}
