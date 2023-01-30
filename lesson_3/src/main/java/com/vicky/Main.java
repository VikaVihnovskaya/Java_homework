package com.vicky;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("green");
        colors.add("brown");

        System.out.println(colors);
        for (int i = 0; i < colors.size(); i++) {
            colors.set(i, colors.get(i) + "!");
        }
        System.out.println(colors);
        colors.add(0, "pink");
        System.out.println(colors);
        System.out.println(colors.get(3));
        colors.set(2, "black");
        System.out.println(colors);
        colors.remove(3);
        System.out.println(colors);
        for (String str : colors) {
            if (str.contains("red")) {
                System.out.println(str);
            }
        }

        ArrayList<String> colorsTwo = new ArrayList<>();
        colorsTwo.add("white");
        colorsTwo.add("purple");
        colorsTwo.addAll(colors.subList(0, 2));
        System.out.println(colorsTwo);
        colors.removeIf(s -> !colorsTwo.contains(s));
        System.out.println(colors);
        colors.sort(Comparator.comparing(String::length));
        colorsTwo.sort(Comparator.comparing(String::length));
        System.out.println(colors);
        System.out.println(colorsTwo);
    }

}