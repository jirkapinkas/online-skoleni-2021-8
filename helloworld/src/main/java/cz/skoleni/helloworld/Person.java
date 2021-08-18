package cz.skoleni.helloworld;

import lombok.*;

@Data
@Builder
public class Person {

    private String name;

    private long id;

    private boolean alive;

    private int age;
//
//    public static PersonBuilder builder() {
//        return new PersonBuilder();
//    }
//
//    public static class PersonBuilder {
//
//        private String name;
//
//        private long id;
//
//        private boolean alive;
//
//        private int age;
//
//        public PersonBuilder name(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public PersonBuilder alive(boolean alive) {
//            this.alive = alive;
//            return this;
//        }
//
//        public PersonBuilder id(long id) {
//            this.id = id;
//            return this;
//        }
//
//        public PersonBuilder age(int age) {
//            this.age = age;
//            return this;
//        }
//
//        public Person build() {
//            Person person = new Person();
//            person.setName(this.name);
//            person.setAlive(this.alive);
//            person.setId(this.id);
//            person.setAge(this.age);
//            return person;
//        }
//
//    }

}
