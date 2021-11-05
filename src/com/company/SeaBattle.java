package com.company;

import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {
        System.out.println(" Введите длину поля");
        Scanner in = new Scanner(System.in);
        int maxx = 0;
        int count = 0;
        Option game = new Option();
        boolean f = true;
        boolean q = false;
        boolean w = false;
        boolean e = false;
        int x = in.nextInt();
        int[] mas = new int[x];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i + 1;
            if (i == mas.length) {
                maxx = i;
            }
        }

        for (int i = (int) (Math.random() * mas.length); i < mas.length; i++) {

            if (f) {
                if (i + 2 > mas[maxx]) {
                    i = i - 1;
                    f = false;
                }
            } else {

                if (count < 3) {
                    switch (count) {
                        case 0:
                            game.setTarget1(mas[i]);
                            count++;
                            break;
                        case 1:
                            game.setTarget2(mas[i]);
                            count++;
                            break;
                        case 2:
                            game.setTarget3(mas[i]);
                            count++;
                            break;
                    }
                }


            }

        }

            for (int j = 0; j < 100; j++) {
                System.out.println("Введите клетку");
                if (q&&w&&e) {
                    System.out.println("Ты победил!!!");
                    break;
                }
                int first = in.nextInt();
                if (first== game.getTarget1())
                {
                    q = true;
                    System.out.println("Есть пробитие");
                }
                else if (first == game.getTarget2()) {
                    w = true;
                    System.out.println("Есть пробитие");
                }
                else if (first == game.getTarget3()) {
                    e = true;
                    System.out.println("Есть пробитие");
                }
                else {
                    System.out.println("Не попал, лох!");
                }
            }
    }
}




class Option {
    public void setTarget1(int target1) {
        this.target1 = target1;
    }

    public void setTarget2(int target2) {
        this.target2 = target2;
    }

    public void setTarget3(int target3) {
        this.target3 = target3;
    }

    private int target1;

    public int getTarget1() {
        return target1;
    }

    public int getTarget2() {
        return target2;
    }

    public int getTarget3() {
        return target3;
    }

    private int target2;
    private int target3;


}





