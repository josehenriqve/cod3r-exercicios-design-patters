package br.com.cod3r.exercicios.builder.model;

import br.com.cod3r.exercicios.builder.model.enums.Gender;

public class User {
    private long id;

    private String name;

    private String age;

    private Gender gender;

    private Adress address;

    private TypeUser typeUser;

    public User(long id, String name, String age, Gender gender, Adress address, TypeUser typeUser) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.typeUser = typeUser;
    }

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getAge() {return age;}

    public void setAge(String age) {this.age = age;}

    public Gender getGender() {return gender;}

    public void setGender(Gender gender) {this.gender = gender;}

    public Adress getAddress() {return address;}

    public void setAddress(Adress address) {this.address = address;}

    public TypeUser getTypeUser() {return typeUser;}

    public void setTypeUser(TypeUser typeUser) {this.typeUser = typeUser;}

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", typeUser=" + typeUser + "]";
    }

    public static class Builder {
        private long id;

        private String name;

        private String age;

        private Gender gender;

        private Adress address;

        private TypeUser typeUser;

        public Builder(long id) {
            this.id = id;
        }

        public Builder andName(String name) {
            this.name = name;
            return this;
        }

        public Builder andAge(String age) {
            this.age = age;
            return this;
        }

        public Builder andGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder andAddress(Adress address) {
            this.address = address;
            return this;
        }

        public Builder andTypeUser(TypeUser typeUser) {
            this.typeUser = typeUser;
            return this;
        }

        public User create() {
            return new User(id, name, age, gender, address, typeUser);
        }
    }
}
