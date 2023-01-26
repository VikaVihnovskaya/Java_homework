package com.vicky;

public class ExerciseFive {

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
        sum.deleteCharAt(i);
        sum.insert(i, "равно");
        System.out.println(sum);

        StringBuilder dif = new StringBuilder()
                .append(a)
                .append(" - ")
                .append(b)
                .append(" = ")
                .append(a - b);
        System.out.println(dif);
        i = dif.indexOf("=");
        dif.deleteCharAt(i);
        dif.insert(i, "равно");
        System.out.println(dif);

        StringBuilder mult = new StringBuilder()
                .append(a)
                .append(" * ")
                .append(b)
                .append(" = ")
                .append(a * b);
        System.out.println(mult);
        i = mult.indexOf("=");
        mult.deleteCharAt(i);
        mult.insert(i, "равно");
        System.out.println(mult);

    }
}