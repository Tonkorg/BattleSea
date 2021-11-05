package com.company;

public class Souf {
    public static void main( String[] args)
    {
        String text = "Something in english";
        System.out.printf(" I wrote %s  \n",text);
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("wo").append("r").append("l").append("d"); // двойное ( тойное) использование функций
        System.out.println(sb.toString());
        System.out.printf("This game have %.3f \n",99.49492); //замена + округление float числа
        System.out.printf("This's not bad %s", "i think");  //замена строк
    }

}
