package com.company;

public class Constructor {

    public static void main ( String [] arg){
        Human Tom = new Human();
Human Bob = new Human("Bob");
Human Kim = new Human("Kim", 20);
    }
}


class Human {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human() {
        System.out.println("Hello from 1-st const");
    }

    public Human(String name) {
        System.out.println("Hello from 2-st const");
        this.name = name;
    }

    public Human(String name, int age) {
        System.out.println("Hello from 3-st const");
        this.name = name;
        this.age = age;
    }

}
