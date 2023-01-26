package com.vicky;

public class ExerciseSix {

    public static void main(String[] args) {
        int a = 3;
        int b = 56;
        StringBuilder sum = new StringBuilder()
                .append(a)
                .append(" + ")
                .append(b).append(" = ")
                .append(a + b);
        System.out.println(sum);
        int i = sum.indexOf("=");
        System.out.println(sum.replace(i ,i+1,"равно"));
        StringBuilder dif = new StringBuilder()
                .append(a)
                .append(" - ")
                .append(b)
                .append(" = ")
                .append(a - b);
        System.out.println(dif);
        i = dif.indexOf("=");
        System.out.println(dif.replace(i ,i+1,"равно"));

        StringBuilder mult = new StringBuilder()
                .append(a)
                .append(" * ")
                .append(b)
                .append(" = ")
                .append(a * b);
        System.out.println(mult);
        i = mult.indexOf("=");
        System.out.println(mult.replace(i ,i+1,"равно"));

    }
}
