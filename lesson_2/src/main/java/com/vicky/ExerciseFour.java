package com.vicky;

public class ExerciseFour {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;
        String sum = new StringBuilder()
                .append(a)
                .append(" + ")
                .append(b).append(" = ")
                .append(a + b)
                .toString();
        System.out.println(sum);
//        System.out.println(sum.replace("=", "равно"));    // решение к 6 задаче
        String dif = new StringBuilder()
                .append(a)
                .append(" - ")
                .append(b)
                .append(" = ")
                .append(a - b)
                .toString();
        System.out.println(dif);
        String mult = new StringBuilder()
                .append(a)
                .append(" * ")
                .append(b)
                .append(" = ")
                .append(a * b)
                .toString();
        System.out.println(mult);

    }
}
