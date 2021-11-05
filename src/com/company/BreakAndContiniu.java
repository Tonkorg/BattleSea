package com.company;

public class BreakAndContiniu {


    public static void main(String[] arg) {
        int x = 10;
        int[] mas = {1, 2, 3};
        int man = 0;
        for (int i = 0; i < x; i++) {
            /*if(man == 10)
            {
                break;
            }
            System.out.println("Вот дебил");
            man++;*/
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);  //вывод всех нечетных чисел
        }
        for (int i = 0; i < x; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println("Вывод всех четных чисел: " + i);
        }

        for (int i = 0; i < x; i++) {

                if (i%3 == 0) {
                    if(i==0)
                    {
                        continue;
                    }
                    System.out.println(" Выыод всех чисел делящихся на 3: " + i);

            }

        }
        int[]mas1 = new int[3];
        for (int i = 0;i<mas1.length;i++)
        {
            mas1[i]= 100+ (int)(Math.random()*mas[i] *3);
            System.out.println(mas1[i]);
        }
    }

}