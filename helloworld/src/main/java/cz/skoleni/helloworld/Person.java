package cz.skoleni.helloworld;

import lombok.*;

@Data
@Builder
public class Person {

    private String name;

    private long id;

    private boolean alive;

    private int age;

}
