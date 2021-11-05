package com.company;

public class Person {

    static public void main(String[] args) {
        Age Ivan = new Age();
        String s1 = Ivan.username("Ivan");
        int a1 = Ivan.userAge((int) (Math.random() * 80));
        int r1 = Ivan.calculateRetire();
        Age Tom = new Age();
        String s2 = Tom.username("Tom");
        int a2 = Tom.userAge((int) (Math.random() * 100));
        int r2 = Tom.calculateRetire();
        System.out.println("Имя первого человека: " + s1 + " и ему " + a1 + " года/лет");
        if (r1 > 0) {
            System.out.println(" До пенсии осталось всего " + r1 + " года/лет");
        } else {
            System.out.println("А чел то уже на пенсии " + (int) (Math.abs(r1))+ " года/лет");
        }
        System.out.println("Имя второго человека: " + s2 + " и ему " + a2 + " года/лет");
        if (r2 > 0) {
            System.out.println(" До пенсии осталось всего " + r2 + " года/лет");
        } else {
            System.out.println("А чел то уже на пенсии " + (int) (Math.abs(r2)) + " года/лет");
        }

        Age Bob = new Age();
        Age Kim = new Age();
        Bob.setName(" Bob");
        Kim.setName(" Kim");
        /*int k = (int) (Math.random() *100);
        int l = (int) (Math.random() *100);*/
        Kim.setAge((int) (Math.random() *100));
        Bob.setAge((int) (Math.random() *100));
        int r3 = Bob.calculateRetire();
        int r4 = Kim.calculateRetire();
        System.out.println("Имя первого человека: " + Bob.getName() + " и ему " + Bob.getAge() + " года/лет");
        if (r3 > 0) {
            System.out.println(" До пенсии осталось всего " + r3 + " года/лет");
        } else {
            System.out.println("А чел то уже на пенсии " + (int) (Math.abs(r3))+ " года/лет");
        }
        System.out.println("Имя второго человека: " + Kim.getName() + " и ему " + Kim.getAge() + " года/лет");
        if (r4 > 0) {
            System.out.println(" До пенсии осталось всего " + r4 + " года/лет");
        } else {
            System.out.println("А чел то уже на пенсии " + (int) (Math.abs(r4)) + " года/лет");
        }


    }
}

    class Age {


        public void setAge(int age) {
            if (age < 0) {
                System.out.println(" You have a problem");
            } else {
                this.age = age;
            }
        }
        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        int age;

        public void setName(String name) {
            if (name.isEmpty())
            {
                System.out.println(" Have a problem");
            }
            else
            {
                this.name = name;
            }
        }

        String name;


        String username(String nameper) {
            name = nameper;
            return name;
        }

        int userAge(int Year) {
            age = Year;
            return age;
        }

        int calculateRetire() {
            int ret = 65 - age;
            return ret;
        }
    }
