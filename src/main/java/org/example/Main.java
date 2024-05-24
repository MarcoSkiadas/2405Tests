package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(5,4));
        System.out.println(isEven(4));
        System.out.println(prod(5,4));
        System.out.println(makeUpperCase("hello"));
        System.out.println(checkPositive(-3));


    }

    public static int sum(int a, int b) {

        return a+b;
    }

    public static boolean isEven(int a) {

       return a%2 == 0;

    }

    public static int prod(int a, int b) {
        return a*b;

    }

 public static String makeUpperCase(String word) {
       // Frage, warum muss eine Variable vor definiert werden?
        return word.toUpperCase();

    }

    public static boolean checkPositive(int a) {

        return a>=0;

    }

}