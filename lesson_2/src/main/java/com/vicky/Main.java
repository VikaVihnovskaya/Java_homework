package com.vicky;

public class Main {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "abd";
        System.out.println(str1.contains(str2));

        StringBuilder stringBuilder = new StringBuilder(str1);
        String str3 = "dcba";
        stringBuilder.reverse();
        System.out.println(str3.equals(stringBuilder.toString()));

    }
}